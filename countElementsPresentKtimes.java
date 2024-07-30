public class Main 
{
    static void tesT(int[] a)
    {
        boolean[] counted = new boolean[a.length];
        for(int i =0;i<a.length;i++)
        {
            if(counted[i])
            {
                continue;
            }
            int count =0;
            for(int j=i;j<a.length;j++)
            {
                if(counted[j])
                {
                    continue;
                }
                if(a[i]==a[j])
                {
                    count ++;
                    counted[j]=true;
                }
            }
            System.out.println(a[i]+"  is present times" +count);
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 3, 4, 2, 1, 3, 4, 5, 6};
        tesT(a);
    }
}
