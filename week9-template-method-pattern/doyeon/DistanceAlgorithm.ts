// 거리 계산 알고리즘

// 1. 내 위치 얻어오기
// 2.  대상(구현) 의 위치 불러오기
// 3. 두 점  사이 거리 계산하기
// 4. 1km 이내라면 알림주기
export default abstract class DistanceAlgorithm { 
    public templateMethod(): void {
        this.getMyLocation();
        this.getTargetLocation();
        this.calculateDistance();
        this.notify();
        this.hook();
    }
    // 구상 서브 클라스에서 구현해야 하는 메소드 
    protected abstract getTargetLocation(): void;

    protected calculateDistance(): void {
        console.log("calculateDistance : 두 점 사이 거리 계산하기");
    }
    protected getMyLocation(): void{
        console.log("getMyLocation : 내 위치 얻어오기");
        
    }
    protected notify(): void { 
        console.log("notify : 1km 이내라면 알림주기");
    }

    // 아무것도 안해도 되고, 서브클래스에서 오버라이드도 가능함.
    protected hook(): void { }
    
}