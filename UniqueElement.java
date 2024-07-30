public class Main 
{
    static void tesT(int[] a)
    {
        for(int i =0;i<a.length;i++)
        {
            int count =0;
            for(int j=0;j<a.length;j++)
            {
                 if(a[i]==a[j])
                 {
                   count++;
                 }
            }
            if(count==1)
            {
                System.out.println(a[i]);
            }
        
            
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,23, 2, 3, 4, 2, 1, 3, 4, 5, 6};
        tesT(a);
    }
}
