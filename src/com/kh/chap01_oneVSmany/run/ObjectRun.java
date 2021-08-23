package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		
		// ���1. �⺻�����ڷ� ���� �� setter �޼ҵ� �̿��Ͽ� �� �ʱ�ȭ
		/*
		Book bk = new Book();
		bk.setTitle("�ڹ��� ����");
		bk.setAuthor("������");
		bk.setPrice(10000);
		bk.setPublisher("kh");
		*/
		
		// ��� 2. �Ű����� �����ڸ� ���ؼ� �ƿ� ������ ���ÿ� �� �ʱ�ȭ
		//Book bk = new Book("�ڹ��� ����", "������", 10000, "kh");
		
		//[����] ����ڿ��� �Է¹��� ���� ��ü ���� �� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("������: ");
		String title = sc.nextLine();
		System.out.print("����: ");
		String author = sc.nextLine();
		System.out.print("����: ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("���ǻ�: ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		
		System.out.println(bk.information());
		*/
		
		
		// ����, �� ���� Book ��ü�� �����ؾ� �Ѵٸ�?
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// �� ������ ���� ������ �ݺ������� ����ڿ��� �Է¹ޱ� => �Է¹��� �� �� ��ü ������ ���ÿ� �ʱ�ȭ
		
		for(int i=0; i<=2; i++) { 
			System.out.println((i+1) + "��° ���� ���� �Է�");
			
			System.out.print("������: ");
			String title = sc.nextLine();
			System.out.print("����: ");
			String author = sc.nextLine();
			System.out.print("����: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("���ǻ�: ");
			String publisher = sc.nextLine();
			
			// �Ź� ���ǰ˻� �� ������ ��ü �����ؾ� ��.
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if (i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		
		}
		// ��ü ���� �Ϸ�
		
		// ��ü ���� ���� ��ȸ�ϱ�
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		// ���� �������� �˻��ϴ� ����
		System.out.print("�˻��� å ����: ");
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
		// else if ������ �ۼ����� �ʴ� ����? => �Ȱ��� �������� �����ϴ��� ��� ��� �˻� ����� ��Ÿ���� ����
		
		
		
		
	}
	
	
}
