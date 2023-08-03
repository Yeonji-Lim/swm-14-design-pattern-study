import Component from "./Component";

export default class Leaf extends Component {
    protected name: string;
    constructor(name: string) {
        super();
        this.name = name;
    }
    public getName(): string {
        return this.name;
    }
    public print(): string {
        console.log('(Leaf ' + this.name + ')');
        return 'Leaf] ' + this.name;
    }

}
