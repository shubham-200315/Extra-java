package Java.concepts;
import java.util.*;
public class arlist {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        list.add(98);
        for(int i=0; i<5; i++ )
        {
            list.add(sc.nextInt());
        }
        for(int i=0; i<5; i++ )
        {
            System.out.println(list.get(i)); 
        }
        sc.close();
        // for multidimensional array 
        // ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        // for(int i=0; i<5; i++ )
        // {
        //     for(int j=0; j<3; j++)
        //     {

        //         list.add(new ArrayList<>());
        // list.get(i).add(sc.nextInt());
        //     }
        // }
    //     static ArrayList<Integer> findindex(int []arr,int target , int index)
    //     {

    //         ArrayList<Integer> list = new ArrayList<>();
    //         if(index == arr.length)
    //         {
    //             return list;
    //         }
    //         if(arr[index]==target)
    //         {
    //             list.add(index);
    //         }
    //         ArrayList<Integer> ans = findindex(arr, target , index+1);
    //     list.addAll(ans);
    //     return list;
    // }
         
    }
}
