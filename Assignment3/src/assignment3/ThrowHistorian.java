package assignment3;

import java.util.ArrayList;

/**
 *
 * @author Hypnocode
 */
public class ThrowHistorian 
{
    private static ArrayList<Throw> recordThrow = new ArrayList(); 

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
        int start;

        if(recordThrow.size() >= n) 
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
        int counter = 0;
        boolean match = true;
        
        for(int i = 1; i < recordThrow.size() - 1; i = i + 2)  
        {
            int k = i;
            if (recordThrow.size() - k >= Sequence.size())
            {
                for(int j = 0; j < Sequence.size(); j++) 
                {       
                    if (!recordThrow.get(k).equals(Sequence.get(j)))
                    {
                        match = false;
                        j = Sequence.size();
                    }
                    k++;
                }
            }
            else
                match = false;
            
            if(match)
                counter++;
            match = true;
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
 
