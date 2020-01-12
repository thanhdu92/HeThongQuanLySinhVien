import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String select;
        StudentList studentList= new StudentList();

        Scanner scanner=new Scanner(System.in);

        Menu();
        while (true){
            System.out.println("Please select one number: ");
            select=scanner.nextLine();
            switch (select){
                case "1":
                    studentList.addStudent(new Student());
                    break;
                case "2":
                    studentList.seeStudentInformation();
                    break;
                case "3":
                    studentList.findStudent();
                    break;
                case "4":
                    studentList.deleteStudentInformation();
                    break;
                case "5":
                    studentList.studentListSort();
                    break;
                case "6":return;
            }

        }

    }

    static void Menu() {
        System.out.println("=========================");
        System.out.println("STUDENT CONTROL SYSTEM");
        System.out.println("1.Add student");
        System.out.println("2.See student information");
        System.out.println("3.Find student");
        System.out.println("4.Delete student information");
        System.out.println("5.Sort student list by name");
        System.out.println("6.Exit");
        System.out.println("=========================");
    }
}
