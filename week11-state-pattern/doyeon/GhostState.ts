import Context from "./Context";
import State from "./state";

export default class GhostState implements State {
    context: Context;
    
    constructor(context: Context){
        this.context = context;
    }

    public updateLocation(): void{
        this.context.moveUser();
        console.log("<update> 유령상태 : 위치를 보여주지 않습니다.");
    }
}