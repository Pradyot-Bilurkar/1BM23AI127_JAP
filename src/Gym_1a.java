//1a : Gym membership

import java.util.Scanner;
public class Gym_1a
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int age;
        String name;
        boolean status;
        int duration;

        System.out.println("Enter Name, age, status(true or false) and duration of membership in months: ");

        name = in.nextLine();
        age = in.nextInt();
        status  = in.nextBoolean();
        duration = in.nextInt();

        int fee = duration*50;

        System.out.println("Customer name : "+ name);
        System.out.println("Customer age : "+ age);
        System.out.println("Membeship status : "+status);
        System.out.println("The membership fee permonth is $50. \nThe total cost of membership for "+ duration +" months is : $"+ fee);
    }

}