package generics;

import java.util.Arrays;

public class WildCardExample <T extends Number> {
	private Object[] data;
	private static int DEFAULT_SIZE = 5;
	private int size = 0;
	
	public WildCardExample() {
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
		WildCardExample<Integer> n = new WildCardExample<>();
		
		n.add(23);
		n.add(83);
		n.add(93);
		n.add(73);
		n.set(4, 25);
		
		System.out.println(n);
	}
}
