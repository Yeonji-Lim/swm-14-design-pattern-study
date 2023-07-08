package adapter;

import Target.Target;

public interface Adapter extends Target {

    abstract String convertToJson(String data);

}
