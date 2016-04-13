package com.feiniaoqy.demo.MapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {
	//HashMap LinkedHashMap、HashTable、TreeMap基本操作类似，但也有部分不同
	public static void hashMap(){
		TreeMap tm = new TreeMap();
		HashMap<String,String > hm = new HashMap();
		hm.put(null, null);
		hm.put("1", "据说key有且只有一个为空哦~");
		hm.put("2", "据说value可以重复，且可以多个为空欸~");
		hm.put("3", "据说value可以重复，且可以多个为空欸~");
		bl(hm);
		hm.remove("1");
		bl(hm);
	}
	//这里是对values进行遍历  对key遍历也是类似的
	public static void bl(HashMap<String,String > hm){
		Collection c = hm.values();
		Iterator ite = c.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
	

}
