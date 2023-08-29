package extra_Assignment_2;
/*Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng
[giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
Ví dụ: 02:11:05*/

import java.util.Scanner;

public class Q1_2_chuyenDoiTime {
	public  void doiSoGiay () {
		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Nhập vào một số từ 0 tới 68399 (giây): ");
        int giay = scanner.nextInt();
        
        while (giay<0|| giay>68399) {
  
        	System.out.println("Nhập lại một số từ 0 tới 68399 (giây): ");
        	giay = scanner.nextInt();
		}
        
        
		int hours  = giay / 3600; // Chuyển đổi sang gio
	    int minus = (giay%3600) / 60; // Chuyển đổi sang phút
	    int second = giay%60;// Chuyển đổi sang giây
	    
	    System.out.printf("Tương đương: %02d : %02d : %02d", hours, minus,second);
	    
	    scanner.close();
    return ;    
	}

}
