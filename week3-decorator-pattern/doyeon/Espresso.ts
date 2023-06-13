import Beverage from "./Beverage";

export default class Espresso extends Beverage {
  constructor() {
    super();
    this.description = "에스프레소";
  }

  public cost(): number {
    return 2000;
  }
}
