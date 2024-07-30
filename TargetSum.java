
public class Main 
{
    static void tesT(int[] a, int target)
    {
       for(int i=0;i<a.length;i++)
       {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]+a[j]==target)
            {
                System.out.println(i+" "+j);
            }
        }
       }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 3, 4, 2, 1, 3, 4, 5, 6};
        int target =5;
        tesT(a , target);
    }
}
