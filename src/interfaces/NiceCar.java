package interfaces;

public class NiceCar {
	private Engine engine;
	private Media media = new CDPlayer();
	
	public NiceCar() {
		engine = new PowerEngine();
	}
	
	public NiceCar(Engine engine) {
		this.engine = engine;
	}
	
	public void start () {
		engine.start();
	}
	
	public void stop () {
		engine.start();
	}
	
	public void startMusic() {
		media.start();
	}
	
	public void stopMusic() {
		media.stop();
	}
}
