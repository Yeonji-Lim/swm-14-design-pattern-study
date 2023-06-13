import Beverage from "../Beverage";
import CondimentDecorator from "./CondimentDecorator";

export class Whip extends CondimentDecorator {
  beverage: Beverage;
  constructor(beverage: Beverage) {
    super();
    this.beverage = beverage;
  }
  getDescription(): string {
    return this.beverage.getDescription() + ", 휘핑";
  }
  cost() {
    return 600 + this.beverage.cost();
  }
}
