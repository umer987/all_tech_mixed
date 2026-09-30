bbnnbn         bbnnnnnvbcbcvhhhhhhhqeertyhhjjgguuiioop nnnnnyyyypoiuyyrrewqjjjjjbnnbjhjhjg nnnjuuy=#bnjjjnnjjjjbnnnnuuutrtgu nmmkkkkbnbnnnnbnnnnnn mvkvmvjnmmmmhkvhggbbbbhhnnbpackage pureparc;

class HashTable {
	     private int tableSize;
	     private Integer[] table;
	  
	     public HashTable(int size) {
	         tableSize = size;
	         table = new Integer[tableSize];
	     }
	  
	     // Simple hash function
	     private int hashFunction(int key) {
	         return key % tableSize;
	     }
	 


public void insert(int key) {
	      int index = hashFunction(key);
	      int originalIndex = index;
	      int i = 1;
	   // Linear probing to handle collisions
	          while (table[index] != null) {
	              index = (originalIndex + i) % tableSize;
	              i++;
	              if (index == originalIndex) {
	                  System.out.println("Hash table is full, cannot insert " + key);
	                  return;
	              }
	          }
	          table[index] = key;
	          System.out.println("Inserted " + key + " at index " + index);
	      }
public boolean search(int key) {
	     int index = hashFunction(key);
	     int originalIndex = index;
	     int i = 1;
	  
	     while (table[index] != null) {
	         if (table[index] == key) {
	             System.out.println("Found " + key + " at index " + index);
	             return true;
	         }
	         index = (originalIndex + i) % tableSize;
	         i++;
	         if (index == originalIndex) {
	             break;
	         }
	     }
	     System.out.println("Key " + key + " not found.");
	     return false;
	 }
	  
public void delete(int key) {
	     int index = hashFunction(key);
	     int originalIndex = index;
	     int i = 1;
	  
	     while (table[index] != null) {
	         if (table[index] == key) {
	             table[index] = -1;  // Mark as deleted
	             System.out.println("Deleted " + key + " from index " + index);
	             return;
	         }
	         index = (originalIndex + i) % tableSize;

	         i++;
	                  if (index == originalIndex) {
	                      break;
	                  }
	              }
	              System.out.println("Key " + key + " not found.");
	          }
	          
	         
	         
	         
public static void main(String[] args) {
    HashTable h = new HashTable(5);
    
    // Insert some keys
    h.insert(10);
    h.insert(20);
    h.insert(30);
    h.insert(15); // This will cause a collision
    
    // Search for keys
    h.search(20);
    h.search(15);
    h.search(99); // This doesn't exist
    
    // Delete a key
    h.delete(20);
    h.search(20); // Should not be found after deletion
    
    // Try to insert more (will fill the table)
    h.insert(25);
    h.insert(35); // This should fail as table is full
}


}



