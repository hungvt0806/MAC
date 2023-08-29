package extra_Assignment_2;
/*Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên a và b.*/

import java.util.Scanner;

public class Q2_8_uocBoiChung {
	
static void uocChungLonNhat (int a, int b) {
	int n =0;
	do {
		n++;
	}while (n<=a && n<=b && a%n == 0 && b%n == 0) ;
	
		 System.out.println("uoc chung lon nhat : "+(n-1));
}	

static void boiChungNhoNhat (int a, int b) {
	int m = 1;
		
	 while (m%a != 0 || m%b !=0) {
		m++;
	}
	System.out.println("boi chung nho nhat : "+m);
	
}	
	
	
	
static  void nhap2SoNguyen () {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên thu 1 : ");
        int a = scanner.nextInt();
        
        System.out.println("Nhập vào một số nguyên thu 2 : ");
        int b = scanner.nextInt();
        
        uocChungLonNhat (a,b);
        boiChungNhoNhat (a,b);
        
	    scanner.close();
    return ;    
	}
}
