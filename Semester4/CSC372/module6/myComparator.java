import java.util.*;

public class myComparator implements Comparator<Student> {
    public int compare(Student a, Student b){
        return a.getRollNo() - b.getRollNo();
    }
}

