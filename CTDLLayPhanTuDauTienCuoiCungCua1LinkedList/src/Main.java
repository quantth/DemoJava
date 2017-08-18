import java.util.LinkedList;
/**
 * Created by NguyenVanQuan on 8/14/2017.
 */
public class Main {
        public static void main(String[] args) {
            LinkedList lList = new LinkedList();
            lList.add("100");
            lList.add("200");
            lList.add("300");
            lList.add("400");
            lList.add("500");
            System.out.println(lList);
            System.out.println("First element of LinkedList is : " + lList.getFirst());
            System.out.println("Last element of LinkedList is : " + lList.getLast());
        }
    }

