package appunti;
import java.util.*;

public class Demo {
    public static void main(String args[]) {
        int a[] = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
        Set<Integer> s = new HashSet<Integer>();
        try {
            for(int i = 0; i < 5; i++) {
                s.add(a[i]);
            }
            System.out.println(s);
            TreeSet sorted = new TreeSet<Integer>(s);
            System.out.println("Sorted list = ");
            System.out.println(sorted);
        }



        catch(Exception e) {}
    }
}