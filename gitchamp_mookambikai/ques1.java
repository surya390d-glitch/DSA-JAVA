import java.util.Scanner;

class ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //type_my();
        type_gem();
    }

    static void type_gem() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num_students = in.nextInt();
        for (int i = 1; i <= num_students; i++) {
            System.out.println("\nProcessing Student #" + i);
            in.nextLine();
            System.out.print("\nName: ");
            String name = in.nextLine();

            System.out.print("att %: ");
            int att = in.nextInt();
            System.out.print("marks: ");
            int m = in.nextInt();
            System.out.print("family income: ");
            long fam_in = in.nextInt();
            System.out.print("extra curiculactivity(yes/no): ");
            // in.nextLine();
            String extra = in.next();

            if (att >= 75 && m >= 60) {
                if (fam_in < 250000) {
                    System.out.println("\nOutput " + i + ": " + name + " - Eligible With Income Preference.");
                } else {
                    System.out.println("\nOutput " + i + ": " + name + " - Eligible");
                }
            } else {
                System.out.println("\nOutput " + i + ": " + name + " - Not Eligible");
            }
        }
    }
}
