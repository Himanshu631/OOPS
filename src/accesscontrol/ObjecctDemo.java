package accesscontrol;

public class ObjecctDemo {
	int num;
	
	public ObjecctDemo(int num) {
		this.num = num;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		ObjecctDemo obj1 = new ObjecctDemo(25);
		ObjecctDemo obj2 = new ObjecctDemo(22);
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 is greater");
		}
	}
}
