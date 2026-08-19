public class ZigZag
{
    public static void main(String[] args)
    {
        int n = 3, cols = 7;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= cols; j++)
            {
                boolean print = false;
                if (i == 1 && j % 4 == 1) print = true;
                if (i == 2 && (j % 4 == 2 || j % 4 == 0)) print = true;
                if (i == 3 && j % 4 == 3) print = true;
                System.out.print(print ? "*" : " ");
            }
                System.out.println();
        }
    }
}
