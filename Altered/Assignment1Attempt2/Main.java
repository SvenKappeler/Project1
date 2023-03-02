import java.io.IOException;
import java.util.LinkedList;

import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException, IOException {
        
        // Start GUI
        //new GUI();

        // Make a new hashtable and populate it with businesses
        CustomHashTable businesses = new CustomHashTable();
        DataStorage.parseBusinessesJSON(businesses);
        System.out.println("Done with the Parse");

        // Add reviews to the businesses
        DataStorage.addReviewToBusiness(businesses);
        System.out.println("Done with the Reviews Merge");

        businesses.scoreBusinesses();
        System.out.println("Done with the Scoring");

        Business outputOne = new Business();
        Business outputTwo = new Business();
        Business outputThree = new Business();
        double latitude = 38.575764;
        double longitude = -121.478851;

        System.out.println("The default latitude and longitude is Lat: " + latitude + " Long: " + longitude);


        outputOne = businesses.locateClosestBusinesses(latitude, longitude);
        outputTwo = businesses.locateSecondClosestBusiness(outputOne.getName(), latitude, longitude);
        outputThree = businesses.locateThirdClosestBusinesses(outputOne.getName(), outputTwo.getName(), latitude, longitude);
        System.out.println("The First closest business is: " + outputOne.getName());
        System.out.println("The Second closest business is: " + outputTwo.getName());
        System.out.println("The Third closest business is: " + outputThree.getName());

        System.out.println("Done");


    }
}
