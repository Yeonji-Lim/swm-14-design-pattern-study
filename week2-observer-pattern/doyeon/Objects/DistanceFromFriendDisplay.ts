import PositionData from "../Subjects/PositionData";
import DisplayElement from "./DisplayElement";
import Observer from "./Observer";

export default class DistanceFromFriendDisplay
  implements Observer, DisplayElement
{
  private positionData: PositionData;
  private coordinate!: number;
  private friendCoordinate: number = 10;

  constructor(positionData: PositionData) {
    this.positionData = positionData;
    positionData.registerObserver(this);
  }
  display(): void {
    let distance = Math.abs(this.coordinate - this.friendCoordinate);
    if (distance <= 1) {
      console.log(" ☆ 친구가 가까이 있습니다! 떨어진 거리: " + distance);
    }
  }
  update(): void {
    this.coordinate = this.positionData.getPosition();
    this.display();
  }
}
