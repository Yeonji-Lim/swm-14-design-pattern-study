import GhostReceiver from "../Receiver/GhostReceiver";
import Command from "./Command";

export class GhostCommand implements Command{
    public ghostMode : GhostReceiver
    constructor(receiver: GhostReceiver) {
        this.ghostMode = receiver;
    }
    execute(): void {
        this.ghostMode.on();
    }
    undo(): void {
        this.ghostMode.off();
    }

}