package exceptions;

public class Main {

	public static void main(String[] args) {
		
		try {
			//divide(5, 0);
			String m = "Somename";
			if (m.equals("Somename")) {
				throw new MyCustomException("Custom Exception");
			}
		}
		catch (MyCustomException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Always run");
		}
	}
	
	static int divide(int a, int b) throws ArithmeticException {
		if (b==0) {
			throw new ArithmeticException("Dont divide by zero");
		}
		return a / b ;
	}

}
