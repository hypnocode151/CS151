package assignment3;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Hypnocode
 */
public class ThrowHistorian {

    
    
    
    public static ArrayList RecordThrows(Player human, Player computer, ArrayList recordThrows){
        
        Throw playerThrow = human.getThrow();
        Throw computerThrow = computer.getThrow();
        
            recordThrows.add(playerThrow); //adds playerthrow to arraylist
            recordThrows.add(computerThrow);//adds computerthrow to arraylist

            System.out.print(recordThrows);
            
            return recordThrows; //returns arraylist
    }
    
    public static void searchSequence(ArrayList<Throw> recordThrows,
                                     ArrayList<Throw> matchThrows) {
        Iterator itr = recordThrows.iterator(); //makes iterator for 
                                                //arraylist of total record
        Iterator itr2 = matchThrows.iterator();
        int counter = 0; //sets counter
        while(itr.hasNext()) {
            if(recordThrows.contains(matchThrows) == true) {//tests to see if
                                                            //there is a match
                                                            //between both array
               counter++;
            }
            System.out.print(itr.next());
            System.out.print(counter);
            }
    }

    @Override //overriding equals function, which is used in contains.
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    
    public int hashCode() { 
        int hash = 7;
        return hash;
    }


    
    
}
