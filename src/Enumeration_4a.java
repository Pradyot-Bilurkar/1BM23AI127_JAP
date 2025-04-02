import java.util.Scanner;
public class Enumeration_4a
{
    public enum DayOfWeek
    {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public boolean isWorkingDay()
        {
            return (this != SATURDAY && this != SUNDAY);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Is Monday a working day? : " + DayOfWeek.MONDAY.isWorkingDay());
    }
}
