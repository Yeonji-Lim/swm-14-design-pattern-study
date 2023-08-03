import DistanceAlgorithm from "./DistanceAlgorithm";
import FriendDistanceAlarm from "./FriendDistanceAlarm";
import PostDistanceAlarm from "./PostDistanceAlarm";


const myPostAlarm = new PostDistanceAlarm();
myPostAlarm.templateMethod();

console.log("\n====================================\n");

const myFriendAlarm = new FriendDistanceAlarm();
myFriendAlarm.templateMethod();