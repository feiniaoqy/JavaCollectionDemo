package com.feiniaoqy.demo.CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	public static void arrayList(){
		ArrayList<String> al = new ArrayList();
		al.add("你是傻瓜");
		al.add("你才是");
		al.add("我不是");
		al.add(2, "你就是个大傻瓜");
		System.out.println(al.get(2));
		
	}
	
	public static void linkedList(){
		List link = new LinkedList();
		link.add(123);
		link.add("lwc");
		link.add(8.8);
		link.add("nxj");
		link.add(520);
		printList(link);
		printReversedList(link);




	}
	public static void printList(List link) {
		System.out.println("正序链表中的元素");
		// 的到链表的迭代器,位置指向链头
		ListIterator li = link.listIterator();
		// 判断迭代器中是否有下一个元素
		while (li.hasNext()) {
			// 返回下个元素
			System.out.print(li.next() + " ");
		}
		System.out.println();
	}

	public static void printReversedList(List link) {
		System.out.println("逆向链表中的元素");
		// 的到链表的迭代器,位置指向link.size()结尾
		ListIterator li = link.listIterator(link.size());
		// 判断迭代器中是否有前一个元素
		while (li.hasPrevious()) {
			// 返回前一个元素
			System.out.print(li.previous() + " ");
		}
		System.out.println();
	}
	
	
	//Vector 是具有线程安全的 这里就木有测试代码啦
	 
}
