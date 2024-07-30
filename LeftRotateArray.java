public class Main 
{
    static void tesT(int[] a)
    {
       for(int i =0;i<a.length-1;i++)
       {
        int temp = a[i+1];
        a[i+1]= a[i];
        a[i]=temp;
       }
      for(int j=0;j<a.length;j++)
      {
        System.out.println(a[j]);
      }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        tesT(a);
    }
}
