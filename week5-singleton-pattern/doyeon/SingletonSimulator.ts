import MyProfile from "./MyProfile";

console.log("<인스턴스 처음 생성>");
let myProfile1 = MyProfile.getInstance();
console.log(myProfile1.toString());
console.log("\n<위치 처음 대입>");

let myProfile2 = MyProfile.getInstance();
myProfile2.setLocation({ lat: 45.123, lng: 123.456 });
console.log(myProfile2.toString());


console.log("\n<위치 두번재 대입>");
let myProfile3 = MyProfile.getInstance();
myProfile3.setLocation({ lat: 78.789, lng: 987.654 });
console.log(myProfile3.toString());

console.log("\n<아이콘 변경>");
let myProfile4 = MyProfile.getInstance();
myProfile4.setIcon(2);
console.log(myProfile4.toString());

console.log("\n<myProfile1 로 출력해봄>");
console.log(myProfile1.toString());

