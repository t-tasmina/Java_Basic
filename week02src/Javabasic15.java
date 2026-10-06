public class Javabasic15 {
    public static void main(String[] args)  {
        String st = "Hi, I'm good.";
        String s2Obj = new String("Bangladesh");
        System.out.println(st + " " + s2Obj);

        String s = "Dhaka, Bangladesh";
        
        int l = s.length();
        System.out.println("Length: " + l);
        
        System.out.println("Upper Case: " + s.toUpperCase());
        System.out.println("Lower Case: " + s.toLowerCase());
        System.out.println("Char at index 0: " + s.charAt(0));

        String str1 = "Dhaka, Bangladesh";
        String str2 = "Hi";
        
        if (str1.equals(str2)) {
            System.out.println("They are equal.");
        } else {
            System.out.println("Not equal.");
        }

        String eq1 = "Hi";
        String eq2 = "Hi";
        
        if (eq1 == eq2) {
            System.out.println("They are equal.");
        } else {
            System.out.println("Not equal.");
        }

        String diff1 = "Hi";
        String diff2 = "Hifdagdas";
        
        if (diff1 == diff2) {
            System.out.println("They are equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}