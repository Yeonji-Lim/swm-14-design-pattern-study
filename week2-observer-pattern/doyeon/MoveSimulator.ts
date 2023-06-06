import PositionData from "./Subjects/PositionData";
import DistanceFromFriendDisplay from "./Objects/DistanceFromFriendDisplay";
import CurrentCoordinateDisplay from "./Objects/CurrentCoordinateDisplay";
import TravelDistanceDisplay from "./Objects/TravelDistanceDisplay";

const myPosition = new PositionData(-3);
const currentCoordinateDisplay = new CurrentCoordinateDisplay(myPosition);
const distanceFromFriendDisplay = new DistanceFromFriendDisplay(myPosition);
const travelDistanceDisplay = new TravelDistanceDisplay(myPosition);

myPosition.setPosition(0);
myPosition.setPosition(11);
myPosition.setPosition(10);
myPosition.setPosition(15);
