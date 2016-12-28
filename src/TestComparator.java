import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args) {
        Student[] students = new Student[3];

        // Random rand = new Random();
        //
        // for (int i = 0; i < students.length; i++) {
        // students[i] = new Student(rand.nextInt(1000));
        // }
        //
        // Arrays.sort(students, TestArr.compareByAge);
        //
        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].age);
        // }

        // sort by name
        students[0] = new Student("zak");
        students[1] = new Student("alex");
        students[2] = new Student("ethan");

        Arrays.sort(students, TestComparator.compareByName);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }

        // sort by gpa
        students[0] = new Student(1.3);
        students[1] = new Student(-1.4);
        students[2] = new Student(66.2);

        Arrays.sort(students, TestComparator.compareByGpa);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].gpa);
        }

    }

    static Comparator<Student> compareByAge = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.age - s2.age;
        }

    };

    static Comparator<Student> compareByName = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }

    };

    static Comparator<Student> compareByGpa = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            Double s1gpa = new Double(s1.gpa);
            Double s2gpa = new Double(s2.gpa);

            return s1gpa.compareTo(s2gpa);
        }

    };

}

class Student {
    String name;
    int age;
    double gpa;

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(double gpa) {
        this.gpa = gpa;
    }

}
