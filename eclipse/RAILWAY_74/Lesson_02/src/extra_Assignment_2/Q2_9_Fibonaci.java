package extra_Assignment_2;
/*Dãy số Fibonacci được định nghĩa như sau:

F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2.

Hãy viết chương trình tìm số Fibonacci thứ n.*/

import java.util.Scanner;

public class Q2_9_Fibonaci {
/* De qui	
	public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
*/
static void fibonacci(int b) { //khong de qui
	
	int fb0 = 0;
	int fb1 = 1;
	int fbn = 1;
	
	for (int i = 3; i <b ; i++) {
		fb0 = fb1;
		fb1 = fbn;
		fbn =fb0+fb1;
	}
	
	System.out.println("so Fibonacci thu "+b+ " :"+fbn);
	
}	


	
static  void nhapSoNguyen () {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên : ");
        int soNguyen = scanner.nextInt();
        
        
    	if (soNguyen < 0) {
            soNguyen = scanner.nextInt();
        } else if (soNguyen == 1 ) {
            System.out.println("so Fibonacci thu "+ soNguyen + " :"+0);
        } else if (soNguyen == 2 || soNguyen == 3) {
            System.out.println("so Fibonacci thu "+ soNguyen + " :"+1);
        } else 
        
        fibonacci (soNguyen);
        
	    scanner.close();
    return ;    
	}

}
