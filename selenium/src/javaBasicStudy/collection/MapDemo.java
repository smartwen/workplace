package com.javaBasicStudy.collection;

import java.util.Map;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "apple");
		map.put("2","pear");
		map.put("3", "orange");
		for(int i=1;i<=3;i++){
			//�Ƿ�����key������ΪString
			System.out.println("��"+i+"Ԫ���ǣ�"+map.get(""+i+""));
			
		}
		
	}
	public MapDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}

}
