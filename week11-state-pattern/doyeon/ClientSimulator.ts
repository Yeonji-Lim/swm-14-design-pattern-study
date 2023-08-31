import Context from "./Context";

var initLocation: number = 0;

const context = new Context(initLocation);

context.requestLocation();
context.requestLocation();
context.requestLocation();
context.setState("ghost");
context.requestLocation();
context.requestLocation();
context.requestLocation();
context.setState("frieze");
context.requestLocation();
context.requestLocation();
context.requestLocation();
