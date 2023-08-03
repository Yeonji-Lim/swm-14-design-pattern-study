
// 반복자가 구현해야하는 인터페이스
export default interface IteratorI<T> {
    hasNext(): boolean;
    next(): T;
}
