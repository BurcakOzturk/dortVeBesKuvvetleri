package dortVeBesKuvvetleri;

import java.util.Scanner;

public class dortVeBesKuvvetleri {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Sınır sayınızı giriniz : ");
		
		n= input.nextInt();
		
		for (int i= 1 ; i<=n; i*=4) {
		
			System.out.println(i+" sayısı 4'ün katıdır.");
		}		
		
		for (int j= 1 ; j<=100; j*=5) {
			
			System.out.println(j+" sayısı 5'in katıdır.");
		}
	}
}
	
