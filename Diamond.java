
package practise;


public class Diamond {
    public static void main(String[]args){
/*int s = 0;
int n=6;
for (int i = n; i > 0; i--) {
   for (int j = 0; j < s; j++)
      System.out.print(" ");
   for (int j = 0; j < i; j++)
      System.out.print("* "); 
   System.out.print("\n");
   s++;
}
   */ int n = 6;
      int s = n - 1;
      System.out.print("A diamond with " + 2*n + " rows is as follows:\n\n");
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < s; j++)
            System.out.print(" ");
         for (int j = 0; j <= i; j++)
            System.out.print("* ");
         System.out.print("\n");
         s--;
      }
      s = 0;
      for (int i = n; i > 0; i--) {
         for (int j = 0; j < s; j++)
            System.out.print(" ");
         for (int j = 0; j < i; j++)
            System.out.print("* ");
         System.out.print("\n");
         s++;
      }         
        }
   }

