import FlyNoWay from "../FlyBehaviors/FlyNoWay";
import Duck from "./Duck";

export default class ModelDuck extends Duck {
  constructor() {
    super();
    this.flyBehavior = new FlyNoWay();
  }
  public display(): string {
    console.log("저는 모형오리입니다.");
    return "저는 모형오리입니다.";
  }
}
