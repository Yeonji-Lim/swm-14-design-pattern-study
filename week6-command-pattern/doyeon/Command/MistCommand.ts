import MistReceiver from "../Receiver/MistReceiver";
import Command from "./Command";

export class MistCommand implements Command{
    public mistMode : MistReceiver
    constructor(receiver: MistReceiver) {
        this.mistMode = receiver;
    }
    execute(): void {
        this.mistMode.on();
    }
    undo(): void {
        this.mistMode.off();
    }

}