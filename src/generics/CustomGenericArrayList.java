package generics;

import java.util.Arrays;

public class CustomGenericArrayList <T> {
	
	private Object[] data;
	private static int DEFAULT_SIZE = 5;
	private int size = 0;
	
	public CustomGenericArrayList() {
		this.data = new Object[DEFAULT_SIZE];
	}
	
	public void add(T num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	public T remove() {
		T retnum = (T) data[--size];
		return retnum;
	}
	
	public T get(int index) {
		return (T) data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set (int ind, T num) {
		data[ind] = num;
	}

	private void resize() {
		Object[] temp = new Object[data.length*2];
		for (int i=0; i<data.length;i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	private boolean isFull() {
		return size==data.length;
	}
	
	public String toString() {
		return "Data is " +  Arrays.toString(data);
	}
	
	public static void main(String[] args) {
		CustomGenericArrayList<Integer> n = new CustomGenericArrayList<>();
		
		n.add(3);
		n.add(13);
		n.add(23);
		n.set(2, 25);
		n.set(3, 25);
		n.set(4, 25);
		
		System.out.println(n);
	}
}
