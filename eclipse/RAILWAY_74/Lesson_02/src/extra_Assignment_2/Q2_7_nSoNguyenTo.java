package extra_Assignment_2;

import java.util.Scanner;

public class Q2_7_nSoNguyenTo {
	static boolean soNguyenTo (int b) {
		int m = 0;
		boolean check = false;
		for (int i = 2; i <= b; i++) {
			if (b%i == 0) m++;		
				
			}
		if (b>1 && m <= 1) check = true;
		
		return check;
		}
	
	
	static void n_SoNguyenTo(int a) {
		
		System.out.print(a+ " so nguyen to dau tien la  : ");
		int n = 2;
		int count = 0;
		while (count < a ) {
			if (soNguyenTo(n) == true) {
				 System.out.print(n+" ");
				 n++;
				 count++;
		}else n++;	
							
		}
	}
	
	
	static  void nhapSoNguyen () {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên : ");
        int soNguyen = scanner.nextInt();
        
        n_SoNguyenTo (soNguyen);
        
	    scanner.close();
    return ;    
	}
}
