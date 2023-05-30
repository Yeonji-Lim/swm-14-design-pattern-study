import Duck from "./Duck";
import FlyWithWings from "../FlyBehaviors/FlyWithWings";

export default class MallardDuck extends Duck {
  constructor() {
    super();
    this.flyBehavior = new FlyWithWings();
  }
  public display(): string {
    console.log("저는 물오리입니다.");

    return "저는 물오리입니다.";
  }
}
