import java.util.LinkedList;
import java.rmi.dgc.Lease;
import java.util.Iterator;
import java.util.ListIterator;

class SLLTester {
  public static void main(String[] args) {
      SuperLinkedList first = new SuperLinkedList();
      first.add("A");
      first.add("b");
      first.add("c");
      first.add("I");
      first.add("e");
      System.out.println("first list " + first.toString());
      SuperLinkedList second = new SuperLinkedList();
      second.add("E");
      second.add("E");
      second.add("b");
      second.add("O");
      second.add("z");
      System.out.println("second list " + second.toString());
      SuperLinkedList third = new SuperLinkedList();
      third.add("x");
      third.add("x");
      third.add("Z");
      third.add("W");
      third.add("x");
      System.out.println("third list " + third.toString());
      if(first.removeVowels())
        System.out.println("first list without the vowels " + first.toString());
      else
        System.out.println("No vowels in list");

      
      if(second.removeConsonants())
        System.out.println("second list without cosonants " + second.toString());
      else
        System.out.println("No consonants in list");

      System.out.println("the duplicates of the third list");
      LinkedList<String> duplicates = third.removeDuplicates();
      ListIterator<String> DIter = duplicates.listIterator();
      while(DIter.hasNext())
        System.out.println(DIter.next());
      System.out.println("the status of third list with no duplicates " + third.toString());
      System.out.println("combined firt list: ");
      LinkedList<String> conList = first.concatenateStrings();
      ListIterator<String> conIter =  conList.listIterator();
      while(conIter.hasNext())
        System.out.println(conIter.next());
      System.out.println("The status of first after concatenateStrings is called, " + first.toString());
      LinkedList<String> mixedUp = second.mix(third);
      ListIterator<String> mixIter = mixedUp.listIterator();
      System.out.println("returned mix called on second with parameters third ");
      while(mixIter.hasNext())
        System.out.println(mixIter.next());
      System.out.println("Status of second list " + second.toString());
      System.out.println("Status of third list " + third.toString());
  } // end main
} // end class