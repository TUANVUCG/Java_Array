import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        int i;
        String[] students = {"student1", "student2", "student3", "student4", "student5", "student6"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String name = sc.nextLine();
        boolean k = false;
        for (i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                k = true;
            }
        }
        if (k) {
            System.out.println("Name's student is : " + name);
            System.out.println("Position of student in the list is : " + (i + 1));
        }
        if (!k) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
