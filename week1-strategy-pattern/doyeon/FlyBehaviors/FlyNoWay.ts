import FlyBehavior from "./FlyBehavior";

export default class FlyNoWay implements FlyBehavior {
  fly(): string {
    console.log("저는 못날아요...");

    return "저는 못날아요...";
  }
}
