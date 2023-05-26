import java.util.Scanner;
public class part3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Tiêu thụ ký tự xuống dòng sau nextInt()

        String[] studentNames = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
        }

       
        System.out.println("List of student names:");
        for (String name : studentNames) {
            System.out.println(name.toUpperCase());
        }

        sc.close();

    }
}
