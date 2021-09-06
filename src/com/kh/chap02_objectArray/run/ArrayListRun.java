package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList</*Phone*/>();
		
		list.add(new Phone("아이폰", "애플", 1300000, "11pro"));
		list.add(new Phone("갤럭시", "삼성", 1200000, "s20"));
		list.add(new Phone("아이폰8", "애플", 500000, "8"));
		System.out.println(list);
		
		// add메소드로 1번 인덱스 자리에 순서 밀어낸 후 출력
		list.add(1,new Phone("내폰", "대기업", 100000,"10"));
		System.out.println(list);
		
		// set메소드로 자리 대체한 후 출력
		list.set(0, new Phone("벨벳폰", "엘지", 1000000,"1"));
		System.out.println(list);
		
		// 가격의 총합계 출력
		int total =0;
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			total += list.get(i).getPrice();
		}
		System.out.println("총 가격: " + total + "원");
		system.out.println("평균: " + total/list.size());
		*/
		
		for(Phone p : list) {
			System.out.println(p);
			total += p.getPrice();
		}
		System.out.println("총가격: " + total + "원");
		System.out.println("평균: " + total/list.size());
		System.out.println("=========================");
		
		// 사용자에게 핸드폰 이름 입력받아 가격 조회하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		for(Phone p : list) {
			if(p.getName().equals(buy)) {
				System.out.println(p.getPrice()+ "원입니다.");
			}
		}
		System.out.println("=============================");
		
		// subList메소드로 새로운 어레이리스트 생성한 뒤 출력
		List<Phone> sub = list.subList(0, 2);
		System.out.println(sub);
		
		// addAll메소드로 합친 뒤 출력
		list.addAll(sub);
		System.out.println(list);
		
		// 0번 인덱스 객체만 출력
		System.out.println(list.get(0));
		
		// 1번 인덱스의 이름만 출력
		System.out.println(list.get(1).getName());
		System.out.println("=========================");
		// 향상된 반복문 이용하여 한 줄씩 출력
		for(Phone p : list) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
