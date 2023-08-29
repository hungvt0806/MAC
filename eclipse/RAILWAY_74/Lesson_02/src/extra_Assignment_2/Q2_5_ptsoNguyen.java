package extra_Assignment_2;
/*Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
Ví dụ: Số 28 được phân tích thành 2 x 2 x 7*/

import java.util.Scanner;

public class Q2_5_ptsoNguyen {

	static void phanTichSoNguyen(int a) {
		
		int n = 2;
		System.out.print("So dc nhap phan tich thanh : ");
		
		while (a>0) {
			if (a%n == 0) {
				if (a == n) System.out.println(n); 
				else System.out.print(n+" * ");	
				a/=n; 
			}else n++;
							
		}
	}
	
	
	static  void nhapSoNguyen () {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên : ");
        int soNguyen = scanner.nextInt();
        
        phanTichSoNguyen (soNguyen);
        
	    scanner.close();
    return ;    
	}
}
