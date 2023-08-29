package extra_Assignment_2;
/*Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b không*/
import java.util.Scanner;

public class Q1_5_chiaHet {
	public  void chiaHet () {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a: ");
        int a = scanner.nextInt();
        
        System.out.println("Nhập vào số b: ");
        int b = scanner.nextInt();
        
        int soDu = a%b;
        
        if(soDu==0) {
        	System.out.println("Số a chia hết cho số b ");	
		}else {
			System.out.println("Số a không chia hết cho số b ");
		}
    
	    
	    scanner.close();
    return ;    
	}
}
