import java.util.Scanner;
public class Findingarray {
    


    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10, 12, 14, 16};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to find");
        int key = sc.nextInt();
        int in = search(a, key);
        if (in != -1) {
            System.out.println("Element found at index " + in);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int search(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
    
}
