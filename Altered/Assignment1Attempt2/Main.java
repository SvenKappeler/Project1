import java.io.IOException;
import java.util.LinkedList;

import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) throws JsonSyntaxException, IOException {
        // Initialize the data store with Yelp dataset records
        CustomHashTable businesses = new CustomHashTable();
        DataStorage.parseBusinessesJSON(businesses);

        CustomHashTable reviews = new CustomHashTable();
        DataStorage.parseReviewsJSON(reviews);
        //businesses.printAll();
        //CustomHashTableReviews reviews = new CustomHashTableReviews();
        //DataStorage.parseJSON(reviews);
        //businesses.printHashTable();
        //businesses.getBusinessName(5);
        //reviews.getReviewText(5);

        //int index = 0;

        //businesses.printHashTable();

        // for all businesses
        /*
        for(int stepper = 0; stepper < 2 //businesses.getCount(); stepper ++){
            // for every business in the given node
            while(index < businesses.getNodeCount(stepper)){
                if(reviews.get(businesses.getBusinessAtNodeIndex(stepper, index).getBusinessId()) != null){
                    System.out.println("" + reviews.get(businesses.getBusinessAtNodeIndex(stepper, index).getBusinessId()).getText());
                }
            }
            index = 0;
        }
        */
        /*
        public void getBusinessName(int nodeNumber){
            LinkedList<Business> node = table[nodeNumber];
            for(Business business : node ){
                if(node.size() != 0){
                    System.out.print(business.getName() + "\n");
                }
            }
    
        }
        */

        
        // Initialize the similarity metric
        // SimilarityMetric similarityMetric = new SimilarityMetric();
        
        // Initialize the GUI and wire it to the data store and similarity metric
        // GUI gui = new GUI(dataStore, similarityMetric);
        
        // Start the GUI
        // gui.start();
    }
}