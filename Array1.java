import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

         System.out.print("Search: ");
         int search = s.nextInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == search) {
                System.out.println("index: " + i);
                return;
            }
        }
    }
}
