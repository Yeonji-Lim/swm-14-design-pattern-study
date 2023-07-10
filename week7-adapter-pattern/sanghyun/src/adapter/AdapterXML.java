package adapter;

public class AdapterXML implements Adapter{

    @Override
    public String convertToJson(String xml) {

        String json = "";

        json += "{ ";
        String[] lines = xml.split("\n");
        for (int i = 2; i < lines.length-1; i++) {
            String line = lines[i];
            String key = line.substring(line.indexOf("<") + 1, line.indexOf(">"));
            String value = line.substring(line.indexOf(">") + 1, line.indexOf("</"));

            json += "\"" + key + "\": \"" + value + "\"";
            if(lines.length - 2 != i){
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
