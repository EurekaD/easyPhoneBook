package myPhoneBook;

import java.util.HashMap;



public class Model {
	HashMap map = new HashMap();
	
	public void put(String str_name,String str_tel) {
		map.put(str_name, str_tel);
	}
	
	public String get(String query_name) {
		return (String) map.get(query_name);
	}
	
	
	Model(){
		
	}
}

/*

1、new hashmap
2、插入键值对数据
public V put(K key, V value)
3、 根据键值获取键值对值数据
public V get(Object key)
4、获取Map中键值对的个数
public int size()
5、判断Map集合中是否包含键为key的键值对
public boolean containsKey(Object key）
6、判断Map集合中是否包含值为value的键值对
boolean containsValue(Object value)
7、判断map集合是否为空
public boolean isEmpty()
8、根据键值删除Map中键值对
public V remove(Object key)
9、将Map中所有的键装到Set集合中返回
// public Set keySet();
Set set=map. keySet()
10、返回集合中所有的value的值的集合
// public Collection values();
Collection c=map.values()
11、将每个键值对封装到一个个Entry对象中,再把所有Entry的对象封装到Set集合中返回 public Set<Map.Entry<K,V>> entrtSet();
Set<Map.Entry<K,V>> entrys=map.entrySet()

*/