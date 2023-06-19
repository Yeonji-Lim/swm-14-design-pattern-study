import Beverage from "../Beverage";
import CondimentDecorator from "./CondimentDecorator";

export class Javachip extends CondimentDecorator {
  beverage: Beverage;
  constructor(beverage: Beverage) {
    super();
    this.beverage = beverage;
  }
  getDescription(): string {
    return this.beverage.getDescription() + ", 자바칩";
  }
  cost() {
    return 500 + this.beverage.cost();
  }
}
