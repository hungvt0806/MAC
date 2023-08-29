package extra_Assignment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_3_xuatHien {
	static void display(int[]a) {
		
		 ArrayList<Integer> b = new ArrayList<Integer>();
			for (int i = 0; i < a.length; i++) {
				int count1 =0;
				int count2 =0;
				for (int j = i; j < a.length; j++) 
					if (a[i]==a[j]) count1++;
				for (int j = 0; j < i; j++) 
					if (a[i]==a[j]) count2++;
				if(count1==1 && count2>=1)b.add (a[i]);
			}
		System.out.println("in ra mang da nhap :");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		if (a.length == 1) System.out.println("phan tu "+a[0]+" xuat hien 1 lan");
		for (int i : b) {
			int count3 =0;
			for (int j = 0; j < a.length; j++) 
				if (i == a[j])count3++;
			System.out.println("phan tu "+i+" xuat hien "+count3);
		
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
