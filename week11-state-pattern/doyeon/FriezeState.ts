import Context from "./Context";
import State from "./state";

export default class FriezeState implements State {
    context: Context;

    constructor(context: Context){
        this.context = context;
    }
    public updateLocation(): void{
        
        console.log("<update> 얼음상태 : 마지막 위치 " + this.context.getLocation() );
        
    }
    
}