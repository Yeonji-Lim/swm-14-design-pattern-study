import Aggregator from "./Aggregator";
import ConcreteIterator from "./ConcreteIterator";
import IteratorI from "./Iterator";

// 데이터 담는 곳
export default class Data implements Aggregator{
    private items: string[] = [];

    constructor(items: string[]) {
        this.items = items;
    }

    public createIterator(): IteratorI<string> {
        return new ConcreteIterator(this.items);
    }
}
