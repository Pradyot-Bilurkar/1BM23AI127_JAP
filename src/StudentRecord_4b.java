import java.util.Scanner;
class Score
{
    int marks;
}
public class StudentRecord_4b
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        final int num = 5;

        Score score[]  = new Score[num];
        for(int i=0; i<num; i++)
        {
            score[i] = new Score();
            System.out.println("Enter Score of student " + (int)(i+1) + " : ");
            score[i].marks = in.nextInt();
        }

        int sum = 0;
        int highest = score[0].marks;
        for(int i=0 ; i<num ; i++)
        {
            sum+=score[i].marks;
            if(score[i].marks > highest)
            {
                highest = score[i].marks;
            }
        }
        double avg = sum/num;
        System.out.println("Sum of scores : " + sum);
        System.out.println("Average of scores : " + avg);
        System.out.println("Highest scores : " + highest);


    }
}
