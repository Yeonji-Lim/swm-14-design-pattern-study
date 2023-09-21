import Subject from "./Subject";

export default class RealSubject implements Subject {
    public getData(): void {
        console.log('s) 값을 불러왔습니다...!!!!!!');
    }
}

