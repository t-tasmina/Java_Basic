public class Javabasic10 {
    public static void main(String[] args)  {
        int sum = 0;
        int i = 8;
        while(i <= 100) {
            sum = sum + i;
            i = i + 5;
        }

        System.out.println("Sum is: " + sum);
    }
}
