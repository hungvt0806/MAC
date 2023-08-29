package extra_Assignment_2;
/*Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần*/

import java.util.Scanner;
import java.util.ArrayList;


public class Q2_1_1Lan {

	static void display(int[]a) {
		
		 ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int count =0;
			for (int j = 0; j < a.length; j++) 
				if (a[i]==a[j]) count++;
			if(count==1)b.add (a[i]);
		}
		System.out.println("in ra mang da nhap :");
	for (int i = 0; i < a.length; i++)
		System.out.print(a[i]+" ");
	System.out.println();
	System.out.println("phan tu chi xuat hien 1 lan la : ");
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
