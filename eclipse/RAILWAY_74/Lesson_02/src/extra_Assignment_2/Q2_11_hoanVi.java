package extra_Assignment_2;
/*Viết chương trình liệt kê tất cả các hoán vị của 1, 2, .., n.*/

import java.util.Scanner;

public class Q2_11_hoanVi {
	int[] a;
	int[] b;
	
	static void nhapSoNguyen() {
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập vào một số nguyên : ");
    int soNguyen = scanner.nextInt();
    
    
    scanner.close();
	}


	
	static void hoanVi(int k) {
		
		for (int i =0; i<k;i++) a[i]=i+1; 		
		if (k == soNguyen) xuat();
		else {
			for (int i =0; i<soNguyen,i++)
				if (b[i]== 0) {
					a[k]=i;
					b[i]=1;
					hoanVi (k+1);
				}
			
		} 
	}
	static void xuat() {
		
		for (int i = 0; i < soNguyen; i++) 
			System.out.print(a[i]+" ");
			
		System.out.println();
	}

	
}
		
		

