package site.clzblog.customize.arraylist;

/**
 * 自定义List接口
 * 
 * @author root
 *
 */
public interface CustomizeList<E> {
	void add(E e);
	
	void add(int index, E e);
	
	E get(int index);
	
	boolean remove(E e);
	
	E remove(int index);
	
	int size();
}
