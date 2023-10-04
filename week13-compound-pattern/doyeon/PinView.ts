import PinController from "./PinController";
import Subject from "./PinModel";

export default interface Observer {
  update(): void;
}

export default class PinView implements Observer{
  model: Subject;
  controller: PinController;
  myPosition: number;
  constructor(m: Subject, c: PinController) {
    this.model = m;
    this.controller = c;
    m.registerObesrver(this);
    this.myPosition = m.getPosition();
  }
  update(): void { 
    this.myPosition = this.model.getPosition();
    this.display();
  }
  display(): void{
    console.log("나의 위치는 " + this.myPosition + "입니다.");
    
  }
  
    // 사용자가 view를 통해 조작 control하게됨

}