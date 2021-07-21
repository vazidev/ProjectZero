import java.util.*;

class Budgetar{
	
    public static void main(String[] args) {
    	int x= 1;      //Counter value
    	//int tfa;       //Total Funds available
    	HashMap cogs= new HashMap<String, Double>();  //Cost of goods table {Item, Cost}
    	HashMap cv = new HashMap<String, Double>();    // Stores table {Item, Critial Value}
    	
    	
    	Scanner item = new Scanner(System.in);   // Java Data Input 
    	
    	System.out.println("Enter Total $ Funds Available:");	
    	Double tfa = item.nextDouble();
    	System.out.println("My Budget: $" + tfa);
    	
        System.out.println(" Please populate the Items List");
         do {
            //String ItemX = item.next();   //Item Name
            //Double cogX = item.nextDouble();       //Item Cost
            //cogs.put(ItemX, cogX);				//save data to Hashmap, Key item
            
        	 cogs.put(item.nextLine);
        	 System.out.println(cogs);
            if (item.next().isEmpty()) { 	//will detect an Empty 0r Zero values, 
            	x = 0;
            }
            x++;
            
            
        }while (x > 0);
         System.out.println(cogs);
    }

}
