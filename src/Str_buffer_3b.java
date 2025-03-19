import java.util.Scanner;
public class Str_buffer_3b {
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer();
        System.out.println("Capacity of String Buffer object s1 : " + s1.capacity());

        StringBuffer s2 = new StringBuffer("Hello");
        System.out.println("String s2 : " + s2);
        System.out.println("Capacity of String Buffer s2 : " + s2.capacity());

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s3 = in.nextLine();

        StringBuffer s4 = new StringBuffer(s3);
        String s5 = s4.reverse().toString().toUpperCase();
        System.out.println("Reversed string in upper case : " + s5);

        System.out.println("Enter a string to append : ");
        String s6 = in.nextLine();

        StringBuffer s7 = new StringBuffer(s5);
        s7.append(s6);
        System.out.println("String after appending : " + s7);
        in.close();
    }
}
