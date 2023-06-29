export default class MyProfile{
    // 브라우저가 멀티 스레드이기 때문에 런타임 환경은 멀티 스레드이지만
    // 자바스크립트는 콜 스택을 하나 가지는 싱글 스레드로 동작한다
    private static uniqueInstance: MyProfile;
    private name: string;
    private icon: number;
    private location: { lat: number, lng: number };
    private constructor() {
        this.name = "홍길동";
        this.icon = 1;
        this.location = { lat: 0, lng: 0 };
    }
    public static getInstance(): MyProfile {
        if (this.uniqueInstance == null) {
            this.uniqueInstance = new MyProfile();
        }
        return this.uniqueInstance;
    }
    public getName(): string { 
        return this.name; 
    }
    public getIcon(): number {
        return this.icon;
    }
    public setName(name: string): void {
        this.name = name;
    }
    public setIcon(icon: number): void {
        this.icon = icon;
    }
    public getLocation(): { lat: number, lng: number } {
        return this.location;
    }
    public setLocation(location: { lat: number, lng: number }): void {
        this.location = location;
    }
    public toString(): string {
        return "이름 : " + this.name + " / 아이콘 번호 : " + this.icon + "\n 현재위치 : " + this.location.lat + ", " + this.location.lng + "\n";
        
    }
}