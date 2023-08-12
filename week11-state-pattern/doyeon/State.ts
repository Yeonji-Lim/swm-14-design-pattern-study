import Context from "./Context";

export default abstract class State {
    public context: Context;
    public abstract updateLocation(): void;

}