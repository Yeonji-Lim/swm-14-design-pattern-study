import Observer from "../Objects/Observer";
import Subject from "./Subject";

export default class PositionData implements Subject {
  private observers: Observer[];
  private coordinate: number;
  // 생성자
  constructor(c: number) {
    this.observers = [];
    this.coordinate = c;
  }
  registerObserver(o: Observer): void {
    this.observers.push(o);
  }
  removeObserver(o: Observer): void {
    let index = this.observers.indexOf(o);
    if (index !== -1) {
      // splice : 해당 index부터 n개를 추출 후 해당 배열에서 제거
      this.observers.splice(index, 1);
    }
  }
  // 저장된 observer에게 모두 update를 날려준다.
  notifyObservers(): void {
    for (let i = 0; i < this.observers.length; i++) {
      this.observers[i].update();
    }
  }
  // 외부 측정기기에서 position이 정해진다.
  setPosition(coordinate: number): void {
    this.coordinate = coordinate;
    this.notifyObservers();
  }
  // display 에서 posision을 얻는다.
  getPosition(): number {
    return this.coordinate;
  }
}
