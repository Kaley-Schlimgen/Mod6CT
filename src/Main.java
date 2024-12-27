import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Fred", "123 W. Elm St."));
        students.add(new Student(2,"Amy", "232 South St."));

        //rollNo comparator

        MySelectionSortMethod.selectionSort(students, new NameComparator());
        System.out.println("\nSORTED BY NAME:");
        printStudents(students);
    }



    public static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
