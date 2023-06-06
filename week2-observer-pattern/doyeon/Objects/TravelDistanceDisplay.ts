import PositionData from "../Subjects/PositionData";
import DisplayElement from "./DisplayElement";
import Observer from "./Observer";

export default class TravelDistanceDisplay implements Observer, DisplayElement {
  private positionData: PositionData;
  private currentCoordinate!: number;
  private lastCoordinate: number = 0;
  private distance: number;

  constructor(positionData: PositionData) {
    this.positionData = positionData;
    positionData.registerObserver(this);
    this.distance = 0;
  }
  display(): void {
    console.log("누적 이동거리 : " + this.distance);
  }
  update(): void {
    this.currentCoordinate = this.positionData.getPosition();
    this.distance += Math.abs(this.currentCoordinate - this.lastCoordinate);

    this.lastCoordinate = this.currentCoordinate;

    this.display();
  }
}
