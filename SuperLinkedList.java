import java.util.LinkedList;
import java.rmi.dgc.Lease;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashSet;

public class SuperLinkedList extends LinkedList{
    public boolean removeVowels() {
        ListIterator<String> iter = this.listIterator();
        boolean re = false;
        while(iter.hasNext()){
            if("AEIOU".contains(iter.next().toUpperCase()) ){
                iter.remove();
                re = true;
        }//end of if
        }//end of while 
        return re;
    }//end of remove vowels 

    public boolean removeConsonants() {
        ListIterator<String> iter = this.listIterator();
        boolean re = false;
        while(iter.hasNext()){
            if("BCDFGHJKLMNPQRSTVWXYZ".contains(iter.next().toUpperCase()) ){
                iter.remove();
                re = true;
        }//end of if 
        }//end of while 
        return re;
    }//end of remove consonates 

    public LinkedList<String> removeDuplicates() {
        ListIterator<String> iter = this.listIterator();
        LinkedList<String> removedE = new LinkedList();
        HashSet tempSet = new HashSet();

        while(iter.hasNext()){
            String temp = iter.next();
            if(tempSet.contains(temp)){
                removedE.add(temp);
                iter.remove();
            }else
                tempSet.add(temp);
        }//end of while 
        
        return removedE;
    }//end of duplicates 

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> combine = new LinkedList();
        String run = "";
        ListIterator<String> iter = this.listIterator();
        while(iter.hasNext()){
            run += iter.next();
            combine.add(run);
        }//end of while 
        return combine;
    }//end of concatenate 

    public LinkedList<String> mix(LinkedList<String> list2) {
        boolean alternate = true;
        LinkedList<String> mix = new LinkedList();
        ListIterator<String> iter = this.listIterator();
        ListIterator<String> iter2 = list2.listIterator();
        while(iter.hasNext() || iter2.hasNext()){
        if(alternate){
            mix.add(iter.next());
            alternate = false;
        }
        else{
            mix.add(iter2.next());
            alternate = true;
        }
        }//end of while 
        return mix;
    }//end of mix 

    public String toString() {
        ListIterator<String> iter = this.listIterator();
        String re = "";
        while(iter.hasNext()){
            re += iter.next() + " , "; 
        }//end of while 
        return re;
    }//end of toString
} // end SuperLinkedList