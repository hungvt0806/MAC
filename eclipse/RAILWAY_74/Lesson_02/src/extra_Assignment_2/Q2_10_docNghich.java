package extra_Assignment_2;

/*Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ
phải sang trái số đó ta vẫn nhận được một số giống nhau.
Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).

public static boolean isThuanNghich(int n) {
        // chuyển đổi số n thành một chuỗi String
        String numberStr = String.valueOf(n);
        // kiểm tra tính thuận nghịch
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

*/

public class Q2_10_docNghich {

	static void docNghich () {
		System.out.println("các số thuận nghịch độc có sáu chữ số : ");
		for(int i= 100000; i <= 999999; i++) {
			int d1 = i/100000;
			int d2 =(i%100000)/10000;;
			int d3 =(i%10000)/1000;;
			int d4 =(i%1000)/100;;
			int d5 =(i%100)/10;
			int d6 = i%10;
			if (d1==d6 && d2==d5 && d3==d4) System.out.println(i);
		}
	}
}
