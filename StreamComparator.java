import java.util.Comparator;

public class StreamComparator extends Stream implements Comparator<Stream>{
    public StreamComparator(String group) {
        super(group);
        //TODO Auto-generated constructor stub
    }

    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.studyGroups.size(), o2.studyGroups.size());
    }
}
