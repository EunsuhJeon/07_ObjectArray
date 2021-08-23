package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		
		// 방법1. 기본생성자로 생성 후 setter 메소드 이용하여 값 초기화
		/*
		Book bk = new Book();
		bk.setTitle("자바의 정석");
		bk.setAuthor("강보람");
		bk.setPrice(10000);
		bk.setPublisher("kh");
		*/
		
		// 방법 2. 매개변수 생성자를 통해서 아예 생성과 동시에 값 초기화
		//Book bk = new Book("자바의 정석", "강보람", 10000, "kh");
		
		//[응용] 사용자에게 입력받은 값을 객체 생성 후 초기화
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("도서명: ");
		String title = sc.nextLine();
		System.out.print("저자: ");
		String author = sc.nextLine();
		System.out.print("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사: ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		
		System.out.println(bk.information());
		*/
		
		
		// 만약, 세 개의 Book 객체를 관리해야 한다면?
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 세 도서에 대한 정보를 반복적으로 사용자에게 입력받기 => 입력받은 후 각 객체 생성과 동시에 초기화
		
		for(int i=0; i<=2; i++) { 
			System.out.println((i+1) + "번째 도서 정보 입력");
			
			System.out.print("도서명: ");
			String title = sc.nextLine();
			System.out.print("저자: ");
			String author = sc.nextLine();
			System.out.print("가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("출판사: ");
			String publisher = sc.nextLine();
			
			// 매번 조건검사 후 각각의 객체 생성해야 함.
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		
		}
		// 객체 생성 완료
		
		// 전체 도서 정보 조회하기
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		// else if 문으로 작성하지 않는 이유? => 똑같은 도서명이 존재하더할 경우 모든 검색 결과를 나타내기 위해
		
		
		
		
	}
	
	
}
