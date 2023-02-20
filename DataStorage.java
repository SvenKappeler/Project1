import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class DataStorage {


    public static void parseJSON(CustomHashTable businesses) throws JsonSyntaxException, IOException{
    // Parse information 
    String filename = "yelp_dataset/yelp_academic_dataset_business.json";
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            
            // parse the JSON object into a Map
            Map<String, Object> obj = new Gson().fromJson(line, Map.class);
        
            // create a new Business object from the Map
            String businessId = (String) obj.get("business_id");
            String name = (String) obj.get("name");
            double latitude = (double) obj.get("latitude");
            double longitude = (double) obj.get("longitude");
            Business business = new Business(businessId, name, latitude, longitude);
        
            // add the Business object to the hashtable
            businesses.add(businessId, business);
            }
        }
    }
}

