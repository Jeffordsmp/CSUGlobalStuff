import java.util.ArrayList;

public class sortMain {

    public static void main(String [] args) {
        MergeSort mergeSort = new MergeSort();
        ArrayList<Student> studentArr = new ArrayList<Student>();
        studentArr.add(new Student(864, "Sarah", "4535 Woodhill Avenue"));
        studentArr.add(new Student(771, "Carl", "1733 Hillside Street"));
        studentArr.add(new Student(913, "Betty", "4526 Middleville Road"));
        studentArr.add(new Student(565, "Earl", "4788 Water Street"));
        studentArr.add(new Student(430, "Jack", "3681 Nutter Street"));
        studentArr.add(new Student(126, "Bobby", "4733 Fowler Avenue"));
        studentArr.add(new Student(379, "Victor", "547 Thompson Street"));
        studentArr.add(new Student(622, "Brenda", "4343 Oakwood Circle"));
        studentArr.add(new Student(492, "Helen", "1645 Heliport Loop"));
        studentArr.add(new Student(295, "John", "110 Morris Street"));

        System.out.println("\nPre-Sort");
        for (Student x : studentArr) {
            System.out.print(x.getRollNo());
            System.out.print(":");
            System.out.print(x.getName());
            System.out.print("  ");
        }
        System.out.println("\n");

        System.out.println("--------------");


        ArrayList<Student> newStudentArr = new ArrayList<Student>();

        newStudentArr = mergeSort.sort(studentArr);
        System.out.println("\nPost-Sort");
        for (Student x : newStudentArr){
            System.out.print(x.getRollNo());
            System.out.print(":");
            System.out.print(x.getName());
            System.out.print("  ");  
        }
        System.out.println("\n");
    }
}
