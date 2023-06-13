import Beverage from "../Beverage";
import CondimentDecorator from "./CondimentDecorator";

export class Milk extends CondimentDecorator {
  beverage: Beverage;
  constructor(beverage: Beverage) {
    super();
    this.beverage = beverage;
  }
  getDescription(): string {
    return this.beverage.getDescription() + ", 우유";
  }
  cost() {
    return 300 + this.beverage.cost();
  }
}
