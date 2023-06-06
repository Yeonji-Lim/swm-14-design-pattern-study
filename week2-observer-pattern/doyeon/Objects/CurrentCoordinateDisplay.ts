import PositionData from "../Subjects/PositionData";
import DisplayElement from "./DisplayElement";
import Observer from "./Observer";

export default class CurrentCoordinateDisplay
  implements Observer, DisplayElement
{
  private positionData: PositionData;
  private coordinate!: number;

  constructor(positionData: PositionData) {
    this.positionData = positionData;
    positionData.registerObserver(this);
  }
  display(): void {
    console.log("\n현재 위치 : " + this.coordinate);
  }
  update(): void {
    this.coordinate = this.positionData.getPosition();
    this.display();
  }
}
