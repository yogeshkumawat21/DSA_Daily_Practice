public class Main 
{
    static void tesT(int[] a,int target)
    {
        for(int i =0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=j+1;j<a.length-1;k++)
                {
                   if(a[i]+a[j]+a[k]==target)
                   {
                    System.out.println(i+" "+j+" "+k);
                   }
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,23, 2, 3, 4, 2, 1, 3, 4, 5, 6};
        int target =6;
        tesT(a,target);
    }
}
