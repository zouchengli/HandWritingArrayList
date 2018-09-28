package site.clzblog.customize.arraylist;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(6);
		arrayList.add("zhangsan");
		arrayList.add("zhangsan");
		System.out.println(arrayList.get(0));
		CustomizeArrayList<String> customizeArrayList = new CustomizeArrayList<>(2);
		customizeArrayList.add("张三");
		customizeArrayList.add("王五");
		customizeArrayList.add("赵六");
		System.out.println(customizeArrayList.get(0));
		
		System.out.println(2 + (2 >> 1));
	}
	
}
