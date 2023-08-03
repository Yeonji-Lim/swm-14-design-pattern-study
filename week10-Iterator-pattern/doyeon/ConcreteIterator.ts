import IteratorI from "./Iterator";

// Data가 interator를 사용하게 하는곳
export default class ConcreteIterator implements IteratorI<string> {
    private index: number = 0;
    private items: string[];

    constructor(items: string[]) {
        this.items = items;
    }
    
    hasNext(): boolean {
        return this.index < this.items.length;
    }

    next(): string {
        if(this.index >= this.items.length) {
            throw new Error('No more item')
        }

        const item = this.items[this.index];
        this.index++;

        return item;
    }
}