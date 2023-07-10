import Command from "./Command/Command";
import { NoCommand } from "./Command/NoCommand";

export default class UserModeCustomInvoker {
    commandList: (Command | null)[] 
    constructor() {
        // onCommand를 Command 타입 7개 배열로 생성
        this.commandList = new Array(3).fill(null);
        // no command로 배열 초기화
        const noCommand = new NoCommand();

        for (let i = 0; i < 3; i++){
            this.commandList[i] = noCommand;
        }
    }
    setCommand(slot: number, command: Command): void{
        this.commandList[slot] = command;
    }
    onButtonClick(slot: number): void {
        if (this.commandList[slot] !== null) {
            this.commandList[slot]?.execute();
        }
    }
    offButtonClick(slot: number): void {
        if (this.commandList[slot] !== null) {
            this.commandList[slot]?.undo();
        }
    }
    toString(): string {
        let stringBuff = "\n ------- user mode custom invoker -------\n";
        for (let i = 0; i < this.commandList.length; i++) {
            stringBuff += "[slot " + i + "] " + this.commandList[i]?.constructor.name +" (on) (off) \n";
        }
        return stringBuff;
    }
}