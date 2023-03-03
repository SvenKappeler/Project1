import java.io.IOException;
import java.util.LinkedList;

import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException, IOException {
        
        // Start GUI

        // Make a new hashtable and populate it with businesses
        CustomHashTable businesses = new CustomHashTable();
        DataStorage.parseBusinessesJSON(businesses);
        System.out.println("Done with the Parse");

        // Add reviews to the businesses
        DataStorage.addReviewToBusiness(businesses);
        System.out.println("Done with the Reviews Merge");


    
        System.out.println("Done with the Scoring");

        new GUI(businesses);

        System.out.println("Done");


    }
}
