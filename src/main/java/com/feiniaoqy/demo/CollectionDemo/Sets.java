package com.feiniaoqy.demo.CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	//HashSet
	public static void hashSet(){
		HashSet<Character> hs = new HashSet();

		hs.add('a');
		hs.add('c');
		hs.add('b');
		hs.add('g');
		hs.add('h');
		hs.add('c');
		hs.add('f');
		hs.add('h');
		hs.add('l');
		System.out.println("hs的size是"+hs.size());
		//遍历hs
		Iterator ite = hs.iterator(); 
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
	//LinkedSet
	public static void linkedHashSet(){
		LinkedHashSet<Integer> ls = new LinkedHashSet();

		ls.add(2);
		ls.add(3);
		ls.add(1);
		ls.add(2);
		ls.add(5);
		ls.add(9);
		ls.add(8);
		ls.add(6);
		ls.add(5);
		System.out.println("hs的size是"+ls.size());
		//遍历hs
		Iterator ite = ls.iterator(); 
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
	//TreeSet
	public static void treeSet(){
		TreeSet<Integer> ts = new TreeSet();

		ts.add(2);
		ts.add(3);
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(9);
		ts.add(8);
		ts.add(6);
		ts.add(5);
		System.out.println("hs的size是"+ts.size());
		//遍历hs
		Iterator ite = ts.iterator(); 
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}



}
