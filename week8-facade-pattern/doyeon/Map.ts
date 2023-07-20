export default class Map  {
    private center: number = 0;
    private radius: number = 5;
    public detectDragMap(): void {
        console.log("지도를 드래그를 감지합니다.");
    }
    public disposeDragMap(): void{
        console.log('지도 드래그 감지를 종료합니다.');
    }
    public getMapRange(){
        console.log('현재 지도의 범위를 반환합니다.');
        return { 'center': this.center, 'radius': this.radius };
    }
}
