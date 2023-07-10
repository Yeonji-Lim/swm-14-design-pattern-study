import FriezeReceiver from "../Receiver/FriezeReceiver";
import Command from "./Command";
export class FriezeCommand implements Command{
    public friezeMode : FriezeReceiver
    constructor(receiver: FriezeReceiver){
        this.friezeMode = receiver;
    }
    execute(): void {
        this.friezeMode.on();
    }
    undo(): void {
        this.friezeMode.off();
    }
}