import MallardDuck from "./Ducks/MallardDuck";
import ModelDuck from "./Ducks/ModelDuck";
import FlyRocketPowered from "./FlyBehaviors/FlyRocketPowered";

const mallard = new MallardDuck();
mallard.performFly();
mallard.display();

// 동적으로 행동 지정하기
const model = new ModelDuck();
model.performFly();
model.display();

model.setFlyBehavior(new FlyRocketPowered());

model.performFly();
