import java.io.IOException;

import javax.xml.crypto.Data;

import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException, IOException {
        // Initialize the data store with Yelp dataset records
        CustomHashTable businesses = new CustomHashTable();
        DataStorage.parseJSON(businesses);
        businesses.printHashTable();
        businesses.getBusinessName(14998);


        
        // Initialize the similarity metric
        // SimilarityMetric similarityMetric = new SimilarityMetric();
        
        // Initialize the GUI and wire it to the data store and similarity metric
        // GUI gui = new GUI(dataStore, similarityMetric);
        
        // Start the GUI
        // gui.start();
    }
}