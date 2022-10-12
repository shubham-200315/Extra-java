package Java.kkrecur;

public class sumdigit {
    public static void main(String []args) {
        System.out.println(sdigit(1342));
    }
    public static int sdigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n + sdigit((n-1)/10);
    }
}
