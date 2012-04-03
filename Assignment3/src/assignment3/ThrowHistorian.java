package assignment3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
/**
 *
 * @author Hypnocode
 */
public class ThrowHistorian {
        private ArrayList<Throw> recordThrow = new ArrayList<Throw>(); 
    
        
     /*
     * Saves the throw records into arraylist
     */
     public void Recordthrow(Player human, Player computer) {
        recordThrow.add(human.getThrow());
        recordThrow.add(computer.getThrow());
    }
    
    
    /*
     * retrieves the last n elements from the array
     * @return the last n elements.
     */
        public ArrayList getLastSequence(int n){
        ListIterator itr = recordThrow.listIterator();
        ArrayList newSequence = new ArrayList();
        int start;
        
        if(recordThrow.size() < n) {
            newSequence = new ArrayList();
            start = recordThrow.size() - n;
                for(int i = 0 ; i < n ; i++) {
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
    public int searchSequence(ArrayList<Throw> Sequence) {
        ListIterator itr = recordThrow.listIterator(); //makes iterator for 
                                                //arraylist of total record
        int counter = 0; //sets counter
        Throw temp;
        if(recordThrow.size() < Sequence.size()) {
         Sequence = null;   
        }
        
        while(itr.hasNext()) {
            for(int i = 0 ; i < recordThrow.size() ; i = i + 2) {
                for(int j = 0 ; j < Sequence.size() ; j++) {
                    if(recordThrow.get(i).equals(Sequence.get(i))) {
                    counter++;
                    }
                }
            }
        }
        return counter;
    }
    
    
    /*
     * Clears the array so that it can be reused in another round.
     */
     public void reset() 
    {
        recordThrow.clear();
    }
}
 
 
