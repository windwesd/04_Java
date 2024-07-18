package practice;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/* 	[실습문제 1]
		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	*/
	
	public void practice1(){
		
		int[] arr = new int[9]; //길이가 9인 배열을 선언 및 할당
		
		// 배열 요소 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// 출력 및 합계
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) { // 짝수번째 인덱스 요소 합
				sum += arr[i];
			}
		}
		
		System.out.print("\n짝수 번쨰 인덱스 합 :" + sum);
		
	}
	
	/* 	[실습문제 2]
		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	*/
	public void practice2(){
		
		int[] arr = new int[9]; // 배열 선언 및 할당
		
		int sum = 0;
		
		// 정방향
		for(int i = 0; i<arr.length; i++) {
			
			// i		 	  : 0 1 2 3 4 5 6 7 8
			// arr.length	  : 9 9 9 9 9 9 9 9 9
			// arr.length - i : 9 8 7 6 5 4 3 2 1 
			// arr[i]	 	  : 9 8 7 6 5 4 3 2 1
			arr[i] = arr.length-i;
			System.out.print(arr[i] + " ");
			
		
			if(i % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 :" + sum);
		
		// 역방향(8 -> 0)
		int[] arr2 = new int[9];
		
		// i				: 8 7 6 5 4 3 2 1 0
		// arr.length		: 9 9 9 9 9 9 9 9 9
		// arr.length - 1 	: 1 2 3 4 5 6 7 8 9
		// arr[i]			: 1 2 3 4 5 6 7 8 9
		
		// 대입은 역방향
		int sum2 = 0;
		for(int i = arr2.length-1; i >= 0; i++) {
			arr2[i] = arr2.length - i;
			
			if(i % 2 == 1) sum2 += arr2[i];
		}
		
		// 출력은 정방향
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n홀수 번쨰 인덱스 합 : " + sum2);
		
	}
	
	/* 	[실습문제 3]
		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	*/
	
	public void practice3(){
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+ " ");
		}
		}
	
	/* 	[실습문제 4]
		정수 5개를 입력 받아 배열을 초기화 하고
		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	*/
	
	public void practice4(){
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt(); // 요소마다 입력 값 대입
		}
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		// 검색 값이 존재하면 true
		// 없으면 false
		boolean flag = false;
		
		for(int i = 0; i<arr.length; i++) {
			
			// i번째 요소에 저장된 값과 검색할 값이 같은 경우
			if(arr[i] == search) {
				System.out.print("인덱스 : " + i);
				flag = true;
			}
		}
		if(!flag) {  // flag == false
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}
		
	
	public void practice5() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			
			sum += arr[i]; // 합계 누적
		}
		
		// 한 줄 출력
		for(int value : arr) System.out.print(value + " ");
		
		// 합계 출력
		System.out.println("\n 총 합 : " + sum);
	}
	
	
	/* 	[실습 문제 6]
		주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		단, char 배열 저장 시 
		성별을 나타내는 숫자 이후부터 *로 저장하세요.
	
		문자열.length() : 문자열의 길이
		문자열.charAt(index) : 문자열 중 index번째 문자(char) 반환
	*/
	public void practice6() {
		// 991122-1234567
		char[] arr = new char[14];
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		
		// 주민등록번호를 char 배열 요소로 하나씩 대입
		for(int i = 0; i < arr.length; i++) {
			
			if(i <= 7) arr[i] = str.charAt(i); // 성별 까지
			else	   arr[i] = '*';		   // 성별 이후
			
			System.out.print(arr[i]);
			
		}
		
	}
	}
