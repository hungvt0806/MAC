package extra_Assignment_2;

import java.util.Scanner;

/*Xếp loại sinh viên theo các qui luật dưới đây:
Nếu điểm >= 9.0 - Loại xuất sắc
Nếu 8.0<= điểm < 9.0 - Loại giỏi
Nếu 7.0<= điểm < 8.0 - Loại khá
Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá
Nếu 5.0 <= điểm < 6.0 - Loại trung bình
Nếu điểm < 5.0 - Loại kém
Với điểm = ( (điểm toán)*2 + điểm lý + điểm hóa )/4
Viết Chương trình:
a. Nhập vào điểm 3 môn học
b. Tính điểm trung bình
c. Xác định học lực của học sinh dựa trên điểm trung bình
d. Hiển thị học lực của học sinh*/

public class Q1_6_hocLuc {
	public  void hocLuc () {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào điểm Toán : ");
        double a = scanner.nextDouble();
        
        System.out.println("Nhập vào điểm Lý : ");
        double b = scanner.nextDouble();
        
        System.out.println("Nhập vào điểm Hóa : ");
        double c = scanner.nextDouble();
        
        
        double diemTrungBinh = (a*2+b+c)/4;
        System.out.printf("Điểm trung bình 3 môn : %.2f\n", diemTrungBinh);
        
        if(diemTrungBinh>=9.0) {
        	System.out.println("Loại xuất sắc ");	
		}else if (diemTrungBinh>=8.0 && diemTrungBinh<9.0){
			System.out.println("Loại giỏi ");
		}else if (diemTrungBinh>=7.0 && diemTrungBinh<8.0){
			System.out.println("Loại khá ");
		}else if (diemTrungBinh>=6.0 && diemTrungBinh<7.0){
			System.out.println("Loại trung bình khá ");
		}else if (diemTrungBinh>=5.0 && diemTrungBinh<6.0){
			System.out.println("Loại trung bình ");
		}else if (diemTrungBinh<5.0 ) {
			System.out.println("Loại kém ");
		}
    
	    
	    scanner.close();
    return ;   
	}
}
