package extra_Assignment_2;
/*Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.*/

import java.util.Scanner;

public class Q2_6_lietKeNguyenTo {
	
	static boolean soNguyenTo (int b) {
		int m = 0;
		boolean check = false;
		for (int i = 2; i <= b; i++) {
			if (b%i == 0) m++;		
				
			}
		if (b>1 && m <= 1) check = true;
		
		return check;
		}
	
	
	static void lietKeSoNguyenTo(int a) {
		
		System.out.print("So nguyen to nho hon so nhap vao  : ");
		int n = 2;
		while (n<a) {
			if (soNguyenTo(n) == true) {
				 System.out.print(n+" ");
				 n++;
		}else n++;	
							
		}
	}
	
	
	static  void nhapSoNguyen () {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên : ");
        int soNguyen = scanner.nextInt();
        if (soNguyen <=2) System.out.println("khong co so nguyen to nho hon");
        else lietKeSoNguyenTo (soNguyen);
        
	    scanner.close();
    return ;    
	}
}
