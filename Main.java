import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Stream strm1 = new Group("g1");
        Stream strm2 = new Group("g2");
        //
        strm1.addGroup(new Group("11"));
        strm1.addGroup(new Group("12"));
        strm1.addGroup(new Group("13"));
        strm1.addGroup(new Group("14"));
        //
        strm2.addGroup(new Group("21"));
        strm2.addGroup(new Group("22"));
        strm2.addGroup(new Group("23"));
        System.out.print("Stream 1: ");
        for (var group : strm1){
            System.out.print(group + " " );
        }
        System.out.print("\nStream 2: ");
        for (var group : strm2){
            System.out.print(group + " " );
        }
        System.out.print("\nstrm1.compareTo(strm2) : ");
        System.out.println(strm1.compareTo(strm2));
        System.out.print("strm2.compareTo(strm1) : ");
        System.out.println(strm2.compareTo(strm1));
        
        List<Stream> db = new ArrayList<>();
        db.add(strm1);
        db.add(strm2);

        System.out.println("Before sort: " + db);
        db.sort(new StreamComparator(""));
        System.out.println("After sort: " + db);
    }
}
