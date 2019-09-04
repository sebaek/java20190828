package chapter07;

public class Car {
	
	private Tire tire;
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void stop() {
		tire.stop();
	}

}
