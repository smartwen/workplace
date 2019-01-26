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
			//是否由于key的类型为String
			System.out.println("第"+i+"元素是："+map.get(""+i+""));
			
		}
		
	}
	public MapDemo() {
		// TODO 自动生成的构造函数存根
	}

}
