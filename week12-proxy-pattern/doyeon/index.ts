import CustomProxy from "./CustomProxy";
import RealSubject from "./RealSubject";
import Subject from "./Subject";

console.log(" ---- 바로 real subject에 접속 ----");

const realSubject = new RealSubject();
realSubject.getData();

console.log("\n ---- 프록시를 통해 접속 ----");
for (let index = 0; index < 4; index++) {
    var proxy = new CustomProxy(realSubject);
    proxy.getData();
    
}

