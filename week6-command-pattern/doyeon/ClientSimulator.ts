import { FriezeCommand } from "./Command/FriezeCommand";
import { GhostCommand } from "./Command/GhostCommand";
import { MistCommand } from "./Command/MistCommand";
import FriezeReceiver from "./Receiver/FriezeReceiver";
import GhostReceiver from "./Receiver/GhostReceiver";
import MistReceiver from "./Receiver/MistReceiver";
import UserModeCustomInvoker from "./UserModeCustomInvoker";


let invoker = new UserModeCustomInvoker();

const friezeReceiver = new FriezeReceiver();
const friezeCommand = new FriezeCommand(friezeReceiver);
const ghostReceiver = new GhostReceiver();
const ghostCommand = new GhostCommand(ghostReceiver);
const mistReceiver = new MistReceiver();
const mistCommand = new MistCommand(mistReceiver);


invoker.setCommand(0, friezeCommand);
invoker.setCommand(1, ghostCommand);
invoker.setCommand(2, mistCommand);

console.log(invoker.toString());

invoker.onButtonClick(0);
invoker.offButtonClick(0);

invoker.onButtonClick(1);
invoker.offButtonClick(1);

invoker.onButtonClick(2);
invoker.offButtonClick(2);