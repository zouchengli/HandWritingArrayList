package site.clzblog.customize.arraylist;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		Object[] objs = { 1, 2 };
		System.out.println(objs.length);
		for (int i = 0; i < objs.length; i++) {
			System.out.print(objs[i] + "\t");
		}
		Object[] objects = Arrays.copyOf(objs, 10);
		System.out.println(objects.length);
		for (int i = 0; i < objects.length; i++) {
			System.out.print(objects[i] + "\t");
		}
		System.out.println();
		int[] fun = { 0, 1, 2, 3, 4, 5, 6 };

		int[] fun1 = { 0, 0, 0, 0, 0, 0, 0 };
		System.arraycopy(fun, 1, fun1, 1, 2);
		for (int i = 0; i < fun1.length; i++) {
			System.out.print(fun1[i] + "\t");
		}

	}

}
