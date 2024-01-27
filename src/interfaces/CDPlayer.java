package interfaces;

public class CDPlayer implements Media{

	@Override
	public void start() {
		System.out.println("normal Music start");
	}

	@Override
	public void stop() {
		System.out.println("normal Music stop");
	}
	
}
