package adapter;

public class AdapterYAML implements Adapter{

    @Override
    public String convertToJson(String yaml) {
        String json = "";

        json += "{ ";

        String[] lines = yaml.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] keyAndValue = lines[i].split(": ");
            json += "\"" + keyAndValue[0] + "\": \"" + keyAndValue[1] + "\"";
            if(lines.length -1 != i){
                json += ", ";
            }
        }

        json += " }";


        return json;
    }

    @Override
    public String getJson(String data) {
        return convertToJson(data);
    }


}
