public class Javabasic13 {
    public static void main(String[] args)  {
        int a[] = new int [3];
        a[0] = 05;
        a[1] = 10;
        a[2] = 20;

        int x = a[0] + a[2];
        System.out.println("Value of x: " + x);

        a[2] = 100;
        x = a[0] + a[2];
        System.out.println("Value of x: " + x);
    }
}
