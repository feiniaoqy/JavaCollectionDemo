# JavaCollectionDemo
//=======================有关Collection与Map的简要总结==============================
//=====================本demo没有详细介绍每一个类的各个方法，关键是掌握下面总结的不同点=============================================
1、Collection  是一个接口 
	Set接口和List接口都是继承这个接口
		实现Set接口的集合类有：HashSet、LinkedSet 还有SortedSet接口，而TreeSet实现了SortedSet接口
			HashSet:是无序的
			LinkedSet:元素是按插入顺序固定
			TreeSet:元素不论以什么元素插入,在遍历的时候,都会以天然顺序遍历 TreeSet底层是使用TreeMap实现的  
			
		实现List接口的有：LinkedList、Vector、ArrayList
			LinkedList:底层是双向链表，在插入和删除操作效率很高，但随机访问的性能很差
			Vector:其他与ArrayList相同，不同的是Vector操作元素的方法是同步的,同一时刻只能有一个线程访问,没有特殊需求都使用ArrayList
			ArrayList:依赖于数组实现的,初始长度为10的Object[],并且可随需要而增加的动态数组
					当元素超过10,那么ArrayList底层会新生成一个数组,长度为原来的1.5倍+1,
					然后将原数组内容复制到新数组中,并且后续增加的内容会放到新数组中,
					当新数组无法容纳增加的元素,重复该过程
					ArrayList对随机访问性能很好,但进行大量插入,删除操作,性能很差,因为操作之后后续元素需要移动
2、Map 接口
	Map增加对象时,如果key值在Map已经存在,将会替换原先value值   
	Map里面的key值是不能重复的,value值可以重复  
	Map的泛型不可以是基本数据类型,比如Map<int,int>报错 
	
	实现Map接口的类有HashMap、LinkedHashMap、HashTable
		HashMap:该类通过对键计算哈希码来决定值的存储,不保证键的存储顺序,HashMap允许键值为null,但只能出现一次
		LinkedHashMap:采用双链表实现的,有固定顺序,也就是插入顺序 
		HashTable:Hashtable对元素操作的方法为同步方法,同一时刻只能有一个线程访问,没有特殊需求不使用 ,不允许null键的存在  
		
	SortedMap接口继承了Map接口
		TreeMap实现了Map接口：键对象不论以什么顺序插入,在遍历的时候,都会以天然顺序遍历,所以想要为TreeMap增加自定义类型,必须指定排序规则(在构造函数中)
