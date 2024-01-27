package generics;

public class CustomArrayList {
	private int[] data;
	private static int DEFAULT_SIZE = 5;
	private int size = 0;
	
	public CustomArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	
	public void add(int num) {
		if(isFull()) {
			resize();
		}
		data[size++] = num;
	}
	
	public int remove() {
		int retnum =  data[--size];
		return retnum;
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
	public void set (int ind, int num) {
		data[ind] = num;
	}

	private void resize() {
//		System.out.println("resize called");
		int[] temp = new int[data.length*2];
		for (int i=0; i<data.length;i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	private boolean isFull() {
		return size==data.length;
	}
	
	public static void main(String[] args) {
		CustomArrayList n = new CustomArrayList();
		
		n.add(3);
		n.add(13);
		n.add(23);
		n.add(33);
		n.add(43);
		
		System.out.println(n.get(2));
		n.add(43);
		System.out.println(n.size());
		
		System.out.println(n.remove());
		n.add(43);
		
		n.set(3, 25);
		
		System.out.println(n.get(2));
		
		
	}
}
