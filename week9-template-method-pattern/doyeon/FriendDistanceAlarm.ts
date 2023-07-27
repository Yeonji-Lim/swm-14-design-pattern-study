import DistanceAlgorithm from "./DistanceAlgorithm";

export default class FriendDistanceAlarm extends DistanceAlgorithm { 
    public getTargetLocation(): void {
        console.log("getTargetLocation - friends : 친구들의 위치 불러오기");
    }
    public hook(): void {
        console.log("hook - friends : 해당 친구에게도 알림을 보내기");
        
    }
}