package currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of currency notes in your country");
		int size=sc.nextInt();
		int currency[]=new int[size];
		System.out.println("Please enter the"+size+"currency denominations, in any order");
		for (int i = 0; i < currency.length; i++) {
			currency[i]=sc.nextInt();	
		}
		System.out.println("Before Sorting"+Arrays.toString(currency));
        MergeSort ms= new MergeSort();
        ms.sort(currency, 0, size-1);
        System.out.println("After Sorting"+Arrays.toString(currency));
        
        System.out.println("Please enter the total amount");
        int amount= sc.nextInt();
        NoteCount nc = new NoteCount();
        nc.counting(currency,amount);
	}

}
