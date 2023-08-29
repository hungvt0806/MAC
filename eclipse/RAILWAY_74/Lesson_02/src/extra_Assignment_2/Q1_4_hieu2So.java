package extra_Assignment_2;
/*Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.

Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ hai].
Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ hai].*/

import java.util.Scanner;

public class Q1_4_hieu2So {
	public  void hieu2So () {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();
        
        int hieu = a-b;
        
        if(hieu>0) {
        	System.out.println("Số a lớn hơn sô b ");	
		}else if (hieu<0) {
			System.out.println("Số a nhỏ hơn số b ");
		}else {
			System.out.println("Số a bằng số b ");
		}
    
	    
	    scanner.close();
    return ;    
	}

}
