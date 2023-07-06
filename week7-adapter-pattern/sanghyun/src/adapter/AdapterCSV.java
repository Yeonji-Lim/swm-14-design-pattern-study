package adapter;

public class AdapterCSV implements Adapter{
    @Override
    public String convertToJson(String csv) {
        String json = "";

        String[] lines = csv.split("\n");
        String[] keys = lines[0].split(",");
        String[] values = lines[1].split(",");

        json += "{";
        for (int i = 0; i < keys.length; i++) {
            json += "\"" + keys[i] + "\": \"" + values[i] + "\"";
            if(i != keys.length-1){
                json += ", ";
            }
        }
        json += "}";

        return json;
    }

    @Override
    public String getJson(String data) {
        return convertToJson(data);
    }
}
