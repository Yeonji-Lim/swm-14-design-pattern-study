export default abstract class Beverage{
    description: string = "음료 설명란";

    public getDescription(): string{
        return this.description;
    }

    public abstract cost(): number;
}