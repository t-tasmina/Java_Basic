public class Javabasic14 {
    public static void main(String[] args)  {
        int sum = 0;
        int a[][] = {{55, 02, 30},
                    {25, 33, 10}};
        for(int i = 0; i < 2; i++) { 
            for(int j = 0; j < 3; j++) { 
                sum = sum + a[i][j];
            }
        }

        System.out.println("Value of Avg: " + sum/6);
    }
}