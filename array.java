import java.util.Scanner;

public class array {
   public array() {
   }

   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[5];

      for(int var3 = 1; var3 < 5; ++var3) {
         System.out.println("Enter the number :");
         var2[var3] = var1.nextInt();
         System.out.println(var2[var3]);
      }

      var1.close();
   }
}
