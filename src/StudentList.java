import java.util.*;

public class StudentList {
    ArrayList<Student> students = new ArrayList<Student>();

    Scanner scanner = new Scanner(System.in);

    void addStudent(Student newStudent) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input student name: ");
        newStudent.name = scanner.nextLine();
        System.out.println("Please input student code: ");
        newStudent.studentCode = scanner.nextLine();
        System.out.println("Please input student address: ");
        newStudent.address = scanner.nextLine();
        System.out.println("Please input student birth year: ");
        newStudent.studentBirthYear = scanner.nextInt();

        students.add(newStudent);
    }

    void seeStudentInformation() {
        if (students.size() == 0) {
            System.out.println("Not found any student on list!");
        } else {
            for (Student student :
                    students) {
                student.seeStudentInformation();
            }
        }
    }

    void findStudent() {
        if (students.size() == 0) {
            System.out.println("Not found any student on list!");
        } else {
            System.out.println("Please input student name: ");
            Scanner scanner = new Scanner(System.in);
            String findName = scanner.nextLine();

            boolean found = false;
            for (Student student :
                    students) {
                if (student.name.equals(findName)) {
                    student.seeStudentInformation();
                    found = true;
                }
            }

            if (found == false) {
                System.out.println("Student not found!");
            }

        }
    }

    void deleteStudentInformation() {
        if (students.size() == 0) {
            System.out.println("Not found any student on list!");
        } else {
            System.out.println("Please input student name: ");
            Scanner scanner = new Scanner(System.in);
            String deleteName = scanner.nextLine();

            boolean found = false;
            for (Student student :
                    students) {
                if (student.name.equals(deleteName)) {
                    students.remove(student);
                    System.out.println("Deleted information of student name " + deleteName);
                    found = true;
                    break;
                }
            }

            if (found == false) {
                System.out.println("Student not found!");
            }

        }
    }

    void studentListSort() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                int comp = t1.name.compareTo(t2.name);
                if (comp > 0) {
                    return 1;
                }
                return -1;
            }

        });

        for (Student student :
                students) {
            student.seeStudentInformation();
        }
    }
}
