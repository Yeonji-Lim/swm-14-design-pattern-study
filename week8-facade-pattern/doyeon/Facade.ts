import Data from "./Data";
import Map from "./Map";

export default class Facade{
    private data: Data;
    private map: Map;
    mapRange: any;
    constructor(data: Data, map: Map){ 
        this.data = data;
        this.map = map;
    }
    public turnOnApp() {
        console.log('<<<< 앱을 켭니다. >>>>');
        this.map.detectDragMap();
        this.mapRange = this.map.getMapRange();
        this.data.getData(this.mapRange.center, this.mapRange.radius);
        this.data.getDataRadiusOne(this.mapRange.center);
    }
    public turnOffApp() {
        console.log('<<<< 앱을 종료합니다. >>>>');
        this.map.disposeDragMap();
        this.data.getDataRadiusOneBackground(this.mapRange.center);
    }
}