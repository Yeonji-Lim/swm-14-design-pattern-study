import Data from "./ConcreteAggregate";


const items: string[] = [
    'apple',
    'banana',
    'orange',
    'strawberry'
];

const data = new Data(items);
const iterator = data.createIterator();

while (iterator.hasNext()) {
    const currentItem = iterator.next();

    console.log(currentItem);
}