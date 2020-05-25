package hashCode;



public class HashTable {
	
private final static int TABLE_SIZE = 2048;
 
HashEntry[] table;

public HashTable() 
{
      table = new HashEntry[TABLE_SIZE];
      for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
}

public int hashFunction(int key) 
{
	

	return key%TABLE_SIZE;
}

public int get(int key)
{
      
	  int hash = hashFunction(key);
      
      if (table[hash] == null)
            return -1;
      else
            return table[hash].getValue();
      
}

public void put(int key, int value) 
{
	
      int hash = hashFunction(key);
      
      if(table[hash]!=null) 
      {
    	  System.out.println("COLLUSION!!!");
      }
      
      else 
      {
    	  table[hash] = new HashEntry(key, value);
   	  }
      
      
}



}
