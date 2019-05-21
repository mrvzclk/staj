
import java.util.Scanner;


public class staj1 {

    public static void tree(int m)
    {
    for (int i = 0; i <= m; i++)
    {
        for (int h =0; h < m - i; h++) 
        { System.out.print(" "); }

        for (int j =0; j <2*i-1; j++)
        { System.out.print("*"); }
        
     System.out.print("\n");
    }}
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
           int m = input.nextInt();
        if (m<1 || m>15) {
            System.out.print("1 ile 15 arası bir sayı giriniz.");
        } else tree(m);
    
    
    }
    
}
