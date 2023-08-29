package extra_Assignment_2;
/*Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32*/

import java.util.Scanner;

public class Q2_4_sumDigit {
	
	
	static void tinhTongSoNguyen (int a) {
		int tong = 0;
		
        do {
        	tong = tong + (a % 10);
			a = (a /10);
		
        } while (a >0) ;
        
		System.out.println("tổng các chữ số : "+tong);
	}
	
	
	static  void nhapSoNguyen () {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên : ");
        int soNguyen = scanner.nextInt();
        
        tinhTongSoNguyen (soNguyen);
        
	    scanner.close();
    return ;    
	}

}
