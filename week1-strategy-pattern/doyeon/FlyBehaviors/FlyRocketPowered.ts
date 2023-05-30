import FlyBehavior from "./FlyBehavior";

export default class FlyRocketPowered implements FlyBehavior {
  fly(): string {
    console.log("저는 로켓추진으로 날라갑니다.");
    return "저는 로켓추진으로 날라갑니다.";
  }
}
