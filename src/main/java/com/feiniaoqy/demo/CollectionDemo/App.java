package com.feiniaoqy.demo.CollectionDemo;

import java.util.LinkedHashMap;

import com.feiniaoqy.demo.MapDemo.Maps;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sets.hashSet();
        System.out.println("===============================");
        Sets.linkedHashSet();
        System.out.println("===============================");
        Sets.treeSet();
        
        System.out.println("=================List==============");
        Lists.arrayList();
        System.out.println("=====================================");
        Lists.linkedList();
        System.out.println("=================Map==============");
        Maps.hashMap();
    }
}
