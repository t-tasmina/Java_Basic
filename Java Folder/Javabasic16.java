public class Javabasic16 {
    public static void main(String[] args)  {
        String s1 = "I@love@Bangladesh";
        String[] a1 = s1.split("@");
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        String s2 = "I@#love@#Bangladesh";
        String[] a2 = s2.split("@");
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }

        String s3 = "I love Bangladesh";
        String[] a3 = s3.split("\\s");
        for (int i = 0; i < a3.length; i++) {
            System.out.println(a3[i]);
        }

        String s4 = "I        love   Bangladesh";
        String[] a4 = s4.split("\\s+");
        for (int i = 0; i < a4.length; i++) {
            System.out.println(a4[i]);
        }
    }
}