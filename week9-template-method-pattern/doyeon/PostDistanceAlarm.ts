import DistanceAlgorithm from "./DistanceAlgorithm";

export default class PostDistanceAlarm extends DistanceAlgorithm {
    public getTargetLocation(): void {
        console.log("getTargetLocation - post : 게시글의 위치 불러오기");
    }
}