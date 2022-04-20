package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int[5];
		double sum = 0;
		
		for(int i=0; i<5; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
			System.out.println("평균은 " +sum/array.length + "입니다.");
			sc.close();
		}
		
		

	}


