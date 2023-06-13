import DarkRoast from "./DarkRoast";
import { Javachip } from "./Decorator/Javachip";
import { Milk } from "./Decorator/Milk";
import { Mocha } from "./Decorator/Mocha";
import { Whip } from "./Decorator/Whip";
import Espresso from "./Espresso";

// 기본 다크로스트 음료
var americano = new DarkRoast();
console.log(americano.getDescription() + " $" + americano.cost());

// 모카 자바칩 라떼 휘핑
var customBeverage = new Espresso();
customBeverage = new Milk(customBeverage);
customBeverage = new Mocha(customBeverage);
customBeverage = new Javachip(customBeverage);
customBeverage = new Whip(customBeverage);

console.log(customBeverage.getDescription() + " $" + customBeverage.cost());
