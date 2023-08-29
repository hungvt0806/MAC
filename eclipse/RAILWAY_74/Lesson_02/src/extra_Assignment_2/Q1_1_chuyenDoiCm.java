package extra_Assignment_2;

import java.util.Scanner;

/*Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet (cm).
Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch (số thực, có 2 số lẻ thập phân).
Với 1 inch = 2.54 cm và 1 foot = 12 inches.*/

public class Q1_1_chuyenDoiCm {


	public  void chuyenDoi () {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một số thực (cm): ");
        double cm = scanner.nextDouble();
		double inches = cm / 2.54; // Chuyển đổi sang inches
	    double feet = inches / 12; // Chuyển đổi inches sang feet
	     
	    System.out.printf("Tương đương: %.2f feet %.2f inches", feet, inches);
	    
	    scanner.close();
    return ;    
	}
	

    
}
