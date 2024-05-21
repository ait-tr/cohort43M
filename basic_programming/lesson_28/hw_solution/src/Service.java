import java.util.HashMap;
import java.util.Map;
public class Service {
    public Map<String, String> counter(String[] wordArray){

        Map<String, String> ourMap = new HashMap<>();

        for (int i = 0; i < wordArray.length; i++) {

            String key = wordArray[i];

            int counter = 0;

            if (ourMap.get(key) != null){
                counter = Integer.parseInt(ourMap.get(key));
            }
            counter++;

            ourMap.put(key, String.valueOf(counter));
        }
        return ourMap;
    }
}
