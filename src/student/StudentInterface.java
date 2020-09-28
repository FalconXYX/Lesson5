package student;

import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        student stul = new student();
        student stu2 = new student();
        String ems;
        Scanner scan = new Scanner(System.in);
        String name;
        int score; //Input first Student's data 

        while (true) {
            System.out.print("Enter name for first student: ");
            name = scan.nextLine();
            stul.setName(name);
           
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stul.getName());
                score = scan.nextInt();
                stul.setScore(i, score);
            }

            ems = stul.validatedata();
            
            if (ems == null) {
                break;
            } else {
                System.out.println(ems);
                scan.nextLine();
            }
        }

        scan.nextLine();

        while (true) {
            System.out.print("Enter name for Second student: ");
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i, score);
            }
           
            ems = stu2.validatedata();
            if (ems == null) {
                break;
            } else {
                System.out.println(ems);
                scan.nextLine();
            }

        }
        System.out.println("\n----------------------------\n");
        System.out.println(stul);
        System.out.println(stu2);
    }

}
