package site.clzblog.customize.arraylist;

public class Test03 {

	public static void main(String[] args) {
		CustomizeArrayList<String> customizeArrayList = new CustomizeArrayList<>(3);
		customizeArrayList.add("a");
		customizeArrayList.add("b");
		customizeArrayList.add("c");
		customizeArrayList.remove(0);
		customizeArrayList.remove("c");
		customizeArrayList.add(0, "a");
		for (int i = 0; i < customizeArrayList.size(); i++) {
			System.out.println(customizeArrayList.get(i));
		}
	}

}
