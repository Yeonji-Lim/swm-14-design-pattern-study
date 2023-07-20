import Data from "./Data";
import Facade from "./Facade";
import Map from "./Map";

const clientMap = new Map();
const clientData = new Data();

const facade: Facade = new Facade(clientData, clientMap);

facade.turnOnApp();
facade.turnOffApp();