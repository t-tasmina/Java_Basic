import java.util.Scanner;

public class Javabasic17 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value: ");
        int intVal = sc.nextInt();
        System.out.println("x = " + intVal);

        System.out.println("Enter a long value: ");
        long longVal = sc.nextLong();
        System.out.println("x = " + longVal);

        System.out.println("Enter a double value: ");
        double doubleVal = sc.nextDouble();
        System.out.println("x = " + doubleVal);


        sc.nextLine(); //to consume buffered characters

        System.out.println("Enter a full line: ");
        String fullLine = sc.nextLine();
        System.out.println("You Entered : " + fullLine);

        sc.close();
    }
}