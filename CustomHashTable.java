import java.util.LinkedList;

public class CustomHashTable {
    private int count;
    private int size;
    private LinkedList<Business>[] table;

    public CustomHashTable(){
        size = 150000;
        this.table = new LinkedList[size];
        this.count = 0;

        // Make an empty linked list at every node
        for (int i = 0; i < 15000; i++){
            table[i] = new LinkedList<Business>();
        }
    }

    public int hash(String key){
        int hash = 0;
        hash = (key.hashCode() & 0x7fffffff) % size; // Modulo to keep it inside the hashtable and to keep it postive
        return hash;
    }
    
    public void add(String key, Business value){
        int index = hash(key);
        LinkedList<Business> node = table[index];

        //Loop to check if Object is already in Node
        if (node != null){
            for(Business business : node){
                if (business.getBusinessId().equals(key)){
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

    public Business get(String key) {
        int index = hash(key); 
        LinkedList<Business> node = table[index];

        // Loop to check if Object is in Node

        for (Business business : node) {
            if (business.getBusinessId().equals(key)) {
                return business;
            }
        }

        // Object is not in Node 

        return null;
    }

    public int getCount(){
        return count;
    }

    public void getBusinessName(int nodeNumber){
        LinkedList<Business> node = table[nodeNumber];
        for(Business business : node ){
            if(node.size() != 0){
                System.out.print(business.getName() + "\n");
            }
        }

    }

    public void printHashTable() {
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) { // check if the linked list is not empty
                System.out.println("node " + i + ":");
                for (Business business : table[i]) {
                    System.out.println(business.toString());
                }
            }
        }
    }

    
    
    

}
