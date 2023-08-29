package extra_Assignment_2;
import java.util.Arrays;
import java.util.Scanner;

/*Viết chương trình nhập vào 4 số nguyên.
Hiển thị ra số lớn nhất và nhỏ nhất
Ví dụ:
nhập vào 4 số 1,2,3,4 thì kết quả là:
Số lớn nhất là: 4
Số nhỏ nhất là: 1*/
public class Q1_3_lonNho {
	public void maxMin() {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    
     Arrays.sort(array);
     System.out.println("Giá trị lớn nhất :"+array[array.length-1]);
     System.out.println("Giá trị nhỏ nhất :"+array[0]);
     
     
	    scanner.close();
	    return;
	}
	
}
