import java.util.LinkedList;

public class CustomHashTableReviews {
    private int count;
    int size;
    private LinkedList<Review>[] table;

    public CustomHashTableReviews(){
        size = 15000;
        this.table = new LinkedList[size];
        this.count = 0;

        // Make an empty linked list at every node
        for (int i = 0; i < 15000; i++){
            table[i] = new LinkedList<Review>();
        }
    }

    public int hash(String key){
        int hash = 0;
        hash = (key.hashCode() & 0x7fffffff) % size; // Modulo to keep it inside the hashtable and to keep it postive
        return hash;
    }
    
    public void add(String key, Review value){
        int index = hash(key);
        LinkedList<Review> node = table[index];

        //Loop to check if Object is already in Node
        if (node != null){
            for(Review review : node){
                if (review.getReviewId().equals(key)){
                    //Not Sure if we will have duplicates
                    return;
                }
            }
        }

        // Object not in Node already
        if (node != null){
            node.add(value);
            count++;

            
        }
        
    }

    public Review get(String key) {
        int index = hash(key); 
        LinkedList<Review> node = table[index];

        // Loop to check if Object is in Node

        for (Review review : node) {
            if (review.getBusinessId().equals(key)) {
                return review;
            }
        }

        // Object is not in Node 

        return null;
    }

    public int getCount(){
        return count;
    }

    public void getReviewText(int nodeNumber){
        LinkedList<Review> node = table[nodeNumber];
        for(Review review : node ){
            if(node.size() != 0){
                System.out.print(review.getText() + "\n");
            }
        }

    }

    public void printHashTable() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) { // check if the linked list is not empty
                System.out.println("node " + i + ":");
                for (Review review : table[i]) {
                    System.out.println(review.toString());
                }
            }
        }
    }  
}
