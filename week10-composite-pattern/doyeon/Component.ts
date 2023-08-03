
export default abstract class Component {
    protected parent!: Component | null;

    public setParent(parent: Component | null) {
        this.parent = parent;
    }

    public getParent(): Component | null {
        return this.parent;
    }

    public add(component: Component): void { }

    public remove(component: Component): void { }

    public getChild(index: number): Component | null {
        return this.parent;
    }
    public getName(): string | null {
        return null;
    }
    public isComposite(): boolean {
        return false;
    }

    public abstract print(): string;
}