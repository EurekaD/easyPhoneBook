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

1��new hashmap
2�������ֵ������
public V put(K key, V value)
3�� ���ݼ�ֵ��ȡ��ֵ��ֵ����
public V get(Object key)
4����ȡMap�м�ֵ�Եĸ���
public int size()
5���ж�Map�������Ƿ������Ϊkey�ļ�ֵ��
public boolean containsKey(Object key��
6���ж�Map�������Ƿ����ֵΪvalue�ļ�ֵ��
boolean containsValue(Object value)
7���ж�map�����Ƿ�Ϊ��
public boolean isEmpty()
8�����ݼ�ֵɾ��Map�м�ֵ��
public V remove(Object key)
9����Map�����еļ�װ��Set�����з���
// public Set keySet();
Set set=map. keySet()
10�����ؼ��������е�value��ֵ�ļ���
// public Collection values();
Collection c=map.values()
11����ÿ����ֵ�Է�װ��һ����Entry������,�ٰ�����Entry�Ķ����װ��Set�����з��� public Set<Map.Entry<K,V>> entrtSet();
Set<Map.Entry<K,V>> entrys=map.entrySet()

*/