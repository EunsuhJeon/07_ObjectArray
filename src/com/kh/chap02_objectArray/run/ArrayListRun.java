package com.kh.chap02_objectArray.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Phone> list = new ArrayList</*Phone*/>();
		
		list.add(new Phone("������", "����", 1300000, "11pro"));
		list.add(new Phone("������", "�Ｚ", 1200000, "s20"));
		list.add(new Phone("������8", "����", 500000, "8"));
		System.out.println(list);
		
		// add�޼ҵ�� 1�� �ε��� �ڸ��� ���� �о �� ���
		list.add(1,new Phone("����", "����", 100000,"10"));
		System.out.println(list);
		
		// set�޼ҵ�� �ڸ� ��ü�� �� ���
		list.set(0, new Phone("������", "����", 1000000,"1"));
		System.out.println(list);
		
		// ������ ���հ� ���
		int total =0;
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			total += list.get(i).getPrice();
		}
		System.out.println("�� ����: " + total + "��");
		system.out.println("���: " + total/list.size());
		*/
		
		for(Phone p : list) {
			System.out.println(p);
			total += p.getPrice();
		}
		System.out.println("�Ѱ���: " + total + "��");
		System.out.println("���: " + total/list.size());
		System.out.println("=========================");
		
		// ����ڿ��� �ڵ��� �̸� �Է¹޾� ���� ��ȸ�ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϰ��� �ϴ� �ڵ��� : ");
		String buy = sc.nextLine();
		
		for(Phone p : list) {
			if(p.getName().equals(buy)) {
				System.out.println(p.getPrice()+ "���Դϴ�.");
			}
		}
		System.out.println("=============================");
		
		// subList�޼ҵ�� ���ο� ��̸���Ʈ ������ �� ���
		List<Phone> sub = list.subList(0, 2);
		System.out.println(sub);
		
		// addAll�޼ҵ�� ��ģ �� ���
		list.addAll(sub);
		System.out.println(list);
		
		// 0�� �ε��� ��ü�� ���
		System.out.println(list.get(0));
		
		// 1�� �ε����� �̸��� ���
		System.out.println(list.get(1).getName());
		System.out.println("=========================");
		// ���� �ݺ��� �̿��Ͽ� �� �پ� ���
		for(Phone p : list) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
