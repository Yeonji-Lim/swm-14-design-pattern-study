import FlyBehavior from "./FlyBehavior";

export default class FlyWithWings implements FlyBehavior {
  fly(): string {
    console.log("날고 있어요!");

    return "날고 있어요!";
  }
}
