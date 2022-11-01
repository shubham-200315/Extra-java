import java.util.ArrayList;

public class factor {
    public static void main (String[]args)
    {
        int n = 20;
        fact1(n);
    }
    static void fact(int n)
    {
        for(int i=1; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                if (n/i == i)
                {
                    System.out.println(i);
                }
                else{

                    System.out.println(i + " " + n/i);
                }
            }
        }

    }
    static void fact1(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                if (n/i == i)
                {
                    System.out.println(i);
                }
                else{

                    System.out.println(i + " " );
                    list.add(n/i);
                }

            }
        }
    for(int i=list.size()-1; i>=0; i--)
    {
        System.out.println(list.get(i));
    }
    }
}
