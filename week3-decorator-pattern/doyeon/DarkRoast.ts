import Beverage from "./Beverage";

export default class DarkRoast extends Beverage {
  constructor() {
    super();
    this.description = "다크 로스트";
  }

  public cost(): number {
    return 3000;
  }
}
