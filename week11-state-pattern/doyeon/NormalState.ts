import Context from "./Context";
import State from "./state";

export default class NormalState implements State {
    context: Context;
    constructor(context: Context){
        this.context = context;
    }
    public updateLocation(): void{
        this.context.moveUser();
        console.log("<update> 기본상태 : 현재 위치 " + this.context.getLocation() );
    }
}