import service.*;
import java.util.Scanner;

public class StudentManagementSystemMain{
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        int choice;
        do{
            sm.displayChoice();
            System.out.println("Enter choice");
            choice = sn.nextInt(); 
            sn.nextLine();

            switch(choice){
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.searchStudent();
                    break;
                case 3:
                    sm.updateStudent();
                    break;
                case 4:
                    sm.deleteStudent();
                    break;
                case 5:
                    sm.viewAllStudents();
                    break;
                case 6:
                    System.out.println("Exited...");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 6);
    }
}