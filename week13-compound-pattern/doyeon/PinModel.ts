import Observer from "./PinView";


export default interface Subject {
    registerObesrver(o: Observer): void;
    notifyObservers(): void;
}

export default class PinModel implements Subject {
    private observer!: Observer;
    private coordinate: number = 0;
    
    // 생성자
    constructor() {
        this.coordinate = 0;
    }
    registerObesrver(o: Observer) {
        this.observer = o;
    }
    // 저장된 observer에게 모두 update를 날려준다.
    notifyObservers(): void {
        this.observer.update();
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