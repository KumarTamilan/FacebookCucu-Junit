package org.sampleTestRunner;

import java.util.Set;
import java.util.TreeSet;

public class Arrayss {

	public static void main(String[] args) {
		// 2.TYPES OF ARRAY DECLARATION :
		// Literal way and
		// Using new keyword.
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int b[] = new int[12];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		b[5] = 60;
		b[6] = 70;
		b[7] = 80;
		b[8] = 90;
		b[9] = 100;
		// 3.How to find the Array length and index position ?
		System.out.println("Total Length : " + b.length);
		System.out.println("Total Index  : " + (b.length - 1));
		System.out.println("Particular Index position : " + b[7]);

		// 4.How to print the all Array value in console ?
		// Two way 1.ForLoop 2.For EachLoop
		System.out.println("All Array values using For Loop : ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// second way :
		System.out.println("All Array values using For Each Loop : ");
		for (int ss : a) {
			System.out.println(ss);
		}
		// 6.How to print the Array in Reverse ?
		System.out.println("All Array values printed in Reverse : ");
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.println(b[i]);
		}
		// 7.What is memory wastage in Array ?
		System.out.println("Memory Wastage : ");
		for (int aaa : b) {
			System.out.println(aaa);
		}
		
		// 8.What is mean by fixed in size ?
//		System.out.println("This is fixed in size,So if we are give to"
//				+ " more than 4th index it will return to ArrayIndexOutOfBoundException.");
//		int aa[] = {1,2,3,4};
//		aa[4]=5;
//		System.out.println(aa[4]);
		
		
		
		
		
		
		
		// 9.Array Types ?
		// 1.One Dimentional Array.
		// 2.Multi Dimentional Array.Mostly we are using multi D A.

		// 10.Write the Two Dimentional Array ?
		int[][] cc = { { 23, 46, 35, 98, 76, 85, 86, 43 },
				{ 34, 56, 23, 45, 67, 87, 98 }, 
				{ 12, 23, 34, 45, 56 },
				{ 21, 32, 43, 54 },
				{ 98, 87, 12, 23, 34, 45, 56, 67 },
				{ 32, 53, 64, 63, 73, 76 },
				{ 92, 93, 84, 75, 64, 43 },
				{ 19, 37, 58, 35, 45, 25, 25 },
				{ 83, 47, 95, 45, 24, 36 } };

		// 11.In this 2D Array How to find Total Length ?
		System.out.println("2D Array Total Length : " + cc.length);

		// 12.In this 2D Array How to find the particular Index column count?
		System.out.println("2D Array particular Index column count : " + cc[5].length);
		
		
		// 13.In this 2D Array How to find the each column Length ?(Entire Length)
		System.out.println("2D Array Total column Length : ");
		int arraySize = cc.length - 1;
		for (int i = 0; i < arraySize; i++) {
			System.out.println(cc[i].length);
		}
		// 14.In this 2D Array How to print the all Data using For loop and For Eachloop
		// ?
		System.out.println("Using For loop print all 2D Array Data : ");
		for (int i = 0; i <= cc.length - 1; i++) {
			for (int j = 0; j < cc[i].length; j++) {
				System.out.print(cc[i][j] + "|");
			}
			System.out.println();
		}
		// For eachloop :
		System.out.println("Using For Each loop print all 2D Array Data : ");
		for (int dd[] : cc) {
			for (int ee : dd) {
				System.out.print(ee + "|");
			}
			System.out.println();
		}
		
		// 15.How to overcome Array is a similar datatype ?
		// -Using Object Class,Because Object is all Class Parent class
		// OR all Class Super Class is Object.
		System.out.println("Overcome Array is a similar DataType : ");
		Object[] ff = { 100, 354, 5342, 8457763453234l, 8465.67463f, 78456624645d, 
				'A', true, "Kumaran" };
		System.out.println(ff.length);
		for (Object aaaa : ff) {
			System.out.println(aaaa);
		}
		
		// 16.How to sort the Array with Duplicates?
		System.out.println("How to sort the Array in Accending Order: ");
		int g[] = { 7, 6, 5, 4, 3, 2, 1, 8, 9, 2, 3, 4 };
		int temp = 0;

		for (int i = 0; i < g.length; i++) {
			for (int j = i + 1; j < g.length; j++) {
				if (g[i] > g[j]) {
					temp = g[i];
					g[i] = g[j];
					g[j] = temp;
				}
			}
		}
		for (int ss : g) {
			System.out.print(ss + ",");
		}
		System.out.println();
		
		// 17.How to sort the Array with Duplicates?
		System.out.println("How to sort the Array in Decending Order: ");
		int h[] = { 7, 6, 5, 4, 3, 2, 1, 8, 9, 2, 3, 4 };
		int tem = 0;

		for (int i = 0; i < h.length; i++) {
			for (int j = i + 1; j < h.length; j++) {
				if (h[i] < h[j]) {
					tem = h[i];
					h[i] = h[j];
					h[j] = tem;
				}
			}
		}
		for (int ss : h) {
			System.out.print(ss + ",");
		}
		
		// 18.Find the Largest number in given String :
		System.out.println("Find the Largest number in given String : ");
		int k[] = { 7, 6, 5, 4, 3, 2, 1, 8, 9, 2, 3, 4 };
		int max = k[0];

		for (int i = 1; i < k.length; i++) {
			if (k[i] > max) {
				max = k[i];
			}
		}
		System.out.println(max);
		
		// 19.Find the Smallest number in given String :
		System.out.println("Find the Smallest number in given String : ");

		int l[] = { 7, 6, 5, 4, 3, 2, 1, 8, 9, 2, 3, 4 };

		int min = l[0];
		for (int i = 1; i < l.length; i++) {
			if (l[i] < min) {
				min = l[i];
			}
		}
		System.out.println(min);
		
		
		// 20.How to remove the duplicates in given Array ?
		System.out.println("Remove duplicates number in given String : ");
		int bb[] = { 9, 8, 7, 6, 7, 6, 5, 4, 3, 4, 5, 3, 2, 3, 2, 1, 1, 0, 0 };

		Set<Integer> set = new TreeSet();

		for (int i = 0; i < bb.length; i++) {
			set.add(bb[i]);
		}
		System.out.println(set);
		
		// 21.How to Find the duplicates in given Array ?
		System.out.println("Find the duplicates number in given String : ");
		int dd[] = { 9, 8, 7, 6, 7, 6, 5, 4, 3, 4, 5, 3, 2, 3, 2, 1, 1, 0, 0 };

		for (int i = 0; i < dd.length; i++) {
			for (int j = i + 1; j < dd.length; j++) {
				if (dd[i] == dd[j]) {
					System.out.print(dd[i] + ",");
				}
			}
		}
		System.out.println();
		
		// 22.How to Find the Missing number in given Array ?
		System.out.println("Find the missing number in given String : ");
		
		int z[] = {1,2,4,5};
		
		int sum1 =0;
		for(int i=0; i<z.length; i++) {
			sum1=sum1+z[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=1; i<=5; i++) {
			sum2 = sum2+i;
		}
		System.out.println(sum2);
		int sum = sum2-sum1;
		System.out.println(sum);
		
		
	}
}
