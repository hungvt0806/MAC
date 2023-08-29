package extra_Assignment_2;
/*Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1.
Hãy liệt kê các phần tử xuất hiện trong dãy đúng 2 lần.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_2_2Lan {
	
	static void display(int[]a) {
		
		 ArrayList<Integer> b = new ArrayList<Integer>();
			for (int i = 0; i < a.length; i++) {
				int count1 =0;
				int count2 =0;
				for (int j = i; j < a.length; j++) 
					if (a[i]==a[j]) count1++;
				for (int j = 0; j < i; j++) 
					if (a[i]==a[j]) count2++;
				if(count1==1 && count2==1)b.add (a[i]);
			}
		System.out.println("in ra mang da nhap :");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("phan tu xuat hien 2 lan la : ");
		for (int i : b) {
		      System.out.print(i+" ");
		    }
					
	}
	
		
	static void nhapMang() {
		int[] a;
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap so phan tu mang a[]:");
		n=sc.nextInt();
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("nhap phan tu a["+i+"]=");
			a[i] = sc.nextInt();
		}
		display(a); 
		
		sc.close();	
	}
		
	
}


