package Java.kkrecur;

public class prodigit {
    public static void main(String []args) {
        System.out.println(pdigit(1342));
    }
    public static int pdigit(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return n%10 * pdigit(n/10);
    }
}
