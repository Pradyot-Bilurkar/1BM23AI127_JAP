public class Chess_1b
{
    public static void main(String args[])
    {
        int i, j;
        for(i = 1; i<=8; i++) {
            for (j = 1; j <= 8; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print("W ");
                    } else {
                        System.out.print("B ");
                    }
                } else {
                    if (j % 2 == 1) {
                        System.out.print("B ");
                    } else {
                        System.out.print("W ");
                    }
                }
            }
            System.out.println("");
        }
    }
}




