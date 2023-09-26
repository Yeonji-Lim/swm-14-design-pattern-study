import PinModel from "./PinModel";
import PinView from "./PinView";

export default class PinController{
    model: PinModel;
    view: PinView;

    constructor(m: PinModel){
        this.model = m;
        this.view = new PinView(m, this);

    }
    forward(): void {
        this.model.setPosition(this.model.getPosition() + 1);
    }
    backward(): void {
        this.model.setPosition(this.model.getPosition() - 1);
    }
    // view에 모양을 바꾸는 코드가 가능
}