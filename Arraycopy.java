public class Arraycopy {
    public static int[] display(int a[]) {
        int c[] = new int[a.length];
        int j = a.length - 1; 
        for (int i : a) {
            c[j] = i;
            j--;
        }
        return c;
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10, 12};
        int copy[] = display(a);
        for (int i : copy) {
            System.out.println(i + "");
        }
    }

}
