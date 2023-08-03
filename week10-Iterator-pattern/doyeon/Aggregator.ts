import IteratorI from "./Iterator";
// 공통된 인터페이스를 갖고 createIterator()를 처리함
export default interface Aggregator {
    createIterator(): IteratorI<string>;
}