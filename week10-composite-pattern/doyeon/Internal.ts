import Component from "./Component";

export default class Internal extends Component {
    protected children: Component[] = [];
    protected name: string;
    constructor(name: string) {
        super();
        this.name = name;
    }

    public add(component: Component): void {
        this.children.push(component);
        component.setParent(this);
    }

    public remove(component: Component): void {
        const componentIndex = this.children.indexOf(component);
        this.children.splice(componentIndex, 1);

        component.setParent(null);
    }
    public getChild(index: number): Component | null {
        return this.children[index];
    }
    public isComposite(): boolean {
        return true;
    }
    public getName(): string {
        return this.name;
    }

    public print(): string {
        const results: string[] = [];
        console.log(`Branch(${this.name}`);
        
        for (const child of this.children) {
            results.push(child.print());
        }
        console.log(')');
        
        // console.log(`Branch(${results.join(' + ')})`);
        return `Branch(${results.join(' + ')})`;
    }
}
