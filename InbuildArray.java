public class InbuildArray {
    public static void main(String[] args) {
        int a[]={5,3,1,13,9,15,21,19,23,27,31};
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After sorting array:");
        for(int i:a)
        {
            System.out.println(i+"");
        }

    }
}
