import RealSubject from "./RealSubject";
import Subject from "./Subject";

export default class CustomProxy implements Subject {
    private realSubject: RealSubject;

    constructor(realSubject: RealSubject) {
        this.realSubject = realSubject;
    }

    public getData(): void {
        if (this.checkAccess()) {
            this.realSubject.getData();
            this.logAccess();
        }
        else {
            console.log('p) 접근 권한이 없습니다.XXXXXXXXX\n');
            return;
        }
    }

    private checkAccess(): boolean {
        console.log('p) 권한을 확인합니다...');
        const randomAccessNumber = Math.floor(Math.random() * 10);
        if (randomAccessNumber > 3) {
            console.log('p) 접근 허용 ', randomAccessNumber);
            return true;
        }
        else {
            console.log('p) 접근 거부 ', randomAccessNumber);
            return false;
        }
    }

    private logAccess(): void {
        console.log('p) 접속을 기록합니다...\n');
    }
}