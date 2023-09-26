import PinController from "./PinController";
import PinModel from "./PinModel";

const model = new PinModel();
const controller = new PinController(model);


console.log("다음 명령을 사용가능합니다.---- [1] 앞으로 이동, [2] 뒤로 이동, [3] 종료\n");
console.log("[1] 앞으로 이동 선택");

controller.forward();
console.log("[2] 뒤로 이동 선택");
controller.backward();
console.log("[3] 종료 선택");
