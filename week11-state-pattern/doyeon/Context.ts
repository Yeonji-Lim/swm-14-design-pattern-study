import FriezeState from "./FriezeState";
import GhostState from "./GhostState";
import NormalState from "./NormalState";
import State from "./state";

export default  class Context {
    ghostState: State;
    friezeState: State;
    normalState: State;
    state: State;
    
    location: number;
    constructor(initLocation: number){
        this.ghostState = new GhostState(this);
        this.friezeState = new FriezeState(this);
        this.normalState = new NormalState(this);
        this.location = initLocation;
        this.state = this.normalState;
    }
    public requestLocation(): void{
        this.state.updateLocation();
    }
    public setState(nextState: String): void{
        if(nextState == "normal"){
            this.state = this.normalState;
        }
        else if(nextState == "ghost"){
            this.state = this.ghostState;
        }
        else if(nextState == "frieze"){
            this.state = this.friezeState;
        }
    }
    public getLocation(): number{
        return this.location;
    }
    public moveUser(): void{
        this.location = this.location + Math.floor(Math.random() * 10);
        console.log("<시스템> 현재 위치 : " + this.location);
    }
}