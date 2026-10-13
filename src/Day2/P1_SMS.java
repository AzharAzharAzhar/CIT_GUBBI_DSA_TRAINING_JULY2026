package Day2;
import java.util.Scanner;

class student{
    String name;
    String usn;
    int age;
    String branch;
    student(String name, String usn, int age, String branch){
        this.name = name;
        this.age = age;
        this.usn = usn;
        this.branch = branch;
    }

    void display(){
        System.out.print("Student Name: "+this.name+"\n");
        System.out.print("Age: "+this.age+"\n");
        System.out.print("USN: "+this.usn+"\n");
        System.out.print("Branch: "+this.branch+"\n");
    }
}

public class P1_SMS {
    public static void main(String[] args) {
        student[] st = new student[5];
        int count = 0;
        while (true) {
            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count < 5) {
                        System.out.println("Adding the Student!");
                        System.out.println("\n Enter Name: ");
                        String name = sc.nextLine();
                        System.out.println("\n Enter USN: ");
                        String USN = sc.nextLine();
                        System.out.println("\n Enter Branch: ");
                        String branch = sc.nextLine();
                        System.out.println("\n Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        st[count] = new student(name, USN, age, branch);
                        System.out.println("Student Added successfully");
                        count++;
                    }

                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        st[i].display();
                    }
                    break;
                case 3:
                    System.out.println("Exit from Loop");
                    break;
            }
        }
    }
}
