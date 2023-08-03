import Component from "./Component";
import Internal from "./Internal";
import Leaf from "./Leaf";


console.log('----- 사과 하나 ---------');

const simple = new Leaf('사과');
simple.print();
console.log('');
console.log('----- 아침과 저녁 메뉴 ---------');

const tree = new Internal('오늘의 메뉴');
const internal1 = new Internal('아침');
internal1.add(new Leaf('우유'));
internal1.add(new Leaf('토스트'));
const internal2 = new Internal('저녁');
internal2.add(new Leaf('치킨'));
tree.add(internal1);
tree.add(internal2);
tree.print();
console.log('');

console.log('----- 오늘의 메뉴에 사과 추가 ---------');


tree.add(simple);
tree.print();