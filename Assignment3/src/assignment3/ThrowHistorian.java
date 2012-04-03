package assignment3;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Hypnocode
 */
public class ThrowHistorian 
{
    private static ArrayList<Throw> recordThrow = new ArrayList<Throw>(); 

    /*
    * Saves the throw records into arraylist
    */
   public static void recordThrows(Throw human, Throw computer) 
    {
        recordThrow.add(human);
        recordThrow.add(computer);
    }
    
    /*
     * retrieves the last n elements from the array
     * @return the last n elements.
     */
    public static ArrayList getLastSequence(int n)
    {
        ArrayList newSequence = new ArrayList();
        int start = 0;

        if(recordThrow.size() < n) 
        {
            newSequence = new ArrayList();
            start = recordThrow.size() - n;

            for(int i = 0 ; i < n ; i++) 
            {
                newSequence.add(recordThrow.get(start));
                start++;
            }
        }           

        return newSequence;
    }
    
    /*
     * Searches the ArrayList to find if there are matches with
     * a selected pattern that has previously been seen
     * @return the highest counter
     */
    public static int searchSequence(ArrayList<Throw> Sequence) 
    {
        ListIterator itr = recordThrow.listIterator(); //makes iterator for 
                                                //arraylist of total record
        int counter = 0;
        
        
            for(int i = 0 ; i < recordThrow.size() ; i = i + 2)  {
                for(int j = 0 ; j < Sequence.size() ; j++) {
                    int k = i;
                    while(recordThrow.get(k).equals(Sequence.get(j))){
                        if(Sequence.size() <= j){
                            counter++;
                        }
                        k=k+2; j++;
                    }
                }
            }
        
        
        return counter;
    }
    
    
    /*
     * Clears the array so that it can be reused in another round.
     */
    public static void reset() 
    {
        recordThrow.clear();
    }

 
}
 
