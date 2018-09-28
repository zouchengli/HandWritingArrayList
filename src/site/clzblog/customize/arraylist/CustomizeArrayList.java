package site.clzblog.customize.arraylist;

import java.util.Arrays;

public class CustomizeArrayList<E> implements CustomizeList<E>{
	// ArrayList 底层采用数组存放
	private Object[] elementData;

	// 默认数组容量
	private static final int DEFAULT_CAPACITY = 10;

	// 实际ArrayList大小
	private int size;

	// ArrayList 指定数组初始的容量
	public CustomizeArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			throw new IllegalArgumentException("初始容量不能小于零");
		}
		elementData = new Object[initialCapacity];
	}

	// 默认初始化容量为10
	public CustomizeArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public void add(E object) {
		// 1.判断实际存放的数据容量是否大于elementData容量
		ensureExplicitCapacity(size + 1);
		// 2.使用下标进行赋值
		elementData[size++] = object;
	}

	public void add(int index, E object) {
		// 1.判断实际存放的数据容量是否大于elementData容量
		ensureExplicitCapacity(size + 1);
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = object;
		size++;
	}

	private void ensureExplicitCapacity(int minCapacity) {
		// 1.判断实际存放的数据容量是否大于elementData
		if (size == elementData.length) {
			// 新数组容量大小
			// int newCapacity = 2 * size;
			// 原来本身elementData容量大小
			int oldCapacity = elementData.length;
			// 新容量大小(oldCapacity >> 1) = oldCapacity
			int newCapacity = oldCapacity + (oldCapacity >> 1);

			if (newCapacity - minCapacity < 0)
				newCapacity = minCapacity;// 最少保证容量和minCapacity一样
			// 将老数组的值赋值到新数组里面去
			/*
			 * Object[] newObjects = new Object[newCapacity]; for (int i = 0; i <
			 * elementData.length; i++) { newObjects[i] = elementData[i]; } elementData =
			 * newObjects;
			 */
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		rangeCheck(index);
		return (E) elementData[index];
	}

	public E remove(int index) {
		rangeCheck(index);
		// 1.使用下标查询该值是否存在
		E object = get(index);
		// 计算删除元素后面的长度
		int numMoved = size - index - 1;
		// 2.删除原理分析:使用arraycopy往前移动数据，将最后一个元素置空
		if (numMoved > 0)
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		elementData[--size] = null;
		return object;
	}

	public boolean remove(E object) {
		for (int i = 0; i < elementData.length; i++) {
			Object value = elementData[i];
			if (value.equals(object)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	private void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException("数组越界了");
	}

	public int size() {
		return size;
	}
}
