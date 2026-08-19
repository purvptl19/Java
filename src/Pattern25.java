public class Pattern25
{
    public static void main(String args[])
    {
        int i, j, rows;

        rows=8;
        for(i=1; i<=rows; i++)
        {

            for(j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=rows; j++)
            {
                if(i==1 || i==rows || j==1 || j==rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

