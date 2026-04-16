import java.util.Scanner;

public class HARSHAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnrollmentSystem system = new EnrollmentSystem();

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. View Students ");
            System.out.println("4. Enroll Student ");
            System.out.println("5. View Enrollments");
            System.out.println("6. Process Enrollment");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Course ID: ");
                        int hscid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String cname = sc.nextLine();
                        System.out.print("Enter Fee: ");
                        double fee = sc.nextDouble();
                        system.addCourse(new Course(hscid, cname, fee));
                        break;
                       

                    case 2:
                         System.out.print("Enter Student ID: ");
                        int hsid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();
                        system.addStudent(new Student(hsid, name, email));
                        break;
                     

                    case 3:
                        system.viewStudents();
                        break;
                       

                    case 4:
                         System.out.print("Enter Student ID: ");
                        hsid = sc.nextInt();
                        System.out.print("Enter Course ID: ");
                       hscid = sc.nextInt();
                        system.enrollStudent(hsid, hscid);
                        break;
                        

                    case 5:
                        system.viewEnrollments();
                        break;

                    case 6:
                        System.out.print("Enter task description: ");
                        String task = sc.nextLine();
                        EnrollmentProcessor ep = new EnrollmentProcessor(task);
                        ep.start();
                        break;

                    case 7:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (InvalidEnrollmentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

