import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stream implements Iterable<Stream>, Comparable<Stream>{

    public List<Stream> studyGroups;
    public String group;

    public Stream(String group){
        this.group = group;
        studyGroups = new ArrayList<>();
    }
    public void addGroup(Stream group){
        studyGroups.add(group);
    }
    @Override
    public String toString() {
        return group;
    }

    @Override
    public Iterator<Stream> iterator() {
        Iterator<Stream> it = new Iterator<Stream>() {
            private int ind = 0;
            @Override
            public boolean hasNext() {
                return ind < studyGroups.size();
            }
            @Override
            public Stream next() {
                return studyGroups.get(ind++);
            }
        };
        return it;
    }
    @Override
    public int compareTo(Stream o) {
        if (this.studyGroups.size() > o.studyGroups.size()){
            System.out.println("FirstStream > SecondStream");
            return 1;
        }
        else if (this.studyGroups.size() < o.studyGroups.size()){
            System.out.println("FirstStream < SecondStream");
            return -1;
        }
        else {
            System.out.println("Equal");
            return 0;
        }
    }
    
}
