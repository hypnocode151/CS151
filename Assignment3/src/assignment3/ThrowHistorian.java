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
    
        
    public void throwRecord(Player Human, Player Computer) {
        recordThrow.add(Human.getThrow());
        recordThrow.add(Computer.getThrow());
    }
    
    
        public ArrayList getLastSequence(int n){
        ListIterator itr = recordThrow.listIterator();
        ArrayList newSequence = new ArrayList();
        
        if(recordThrow.size() < n) {
         newSequence = null;   
        }
        
        for(int i = 0 ; i < n ; i++) {
            newSequence.add(itr.previous());
        }
        
                
        return newSequence;
    }
   
    
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
    
     static void reset() 
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
 
 
