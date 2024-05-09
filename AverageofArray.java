public class AverageOfArray {
    public static double avg(int a[]){
        double sum=0;
        for(int i:a)
        {
            sum=sum+i;

        }
        double s=sum/a.length;
        return s;
    }
    public static void main(String args[])
    {
        int a[]={4,7,9,3,5,8,2};
        double answer=avg(a);
        System.out.println(answer);

    }
    
}