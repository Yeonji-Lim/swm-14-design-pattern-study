import Beverage from "../Beverage";
import CondimentDecorator from "./CondimentDecorator";

export class Mocha extends CondimentDecorator {
  beverage: Beverage;
  constructor(beverage: Beverage) {
    super();
    this.beverage = beverage;
  }
  getDescription(): string {
    return this.beverage.getDescription() + ", 모카";
  }
  cost() {
    return 500 + this.beverage.cost();
  }
}
