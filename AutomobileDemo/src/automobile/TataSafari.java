package automobile;

public class TataSafari extends Car {

	private boolean running = false;
	private String model = "Tata Safari";

	public String getModel() {
		return model;
	}

	@Override
	public boolean start() {
		running = true;
		System.out.println("Starting car : Tata Safari");
		return true;
	}

	@Override
	public boolean stop() {
		running = false;
		System.out.println("Stopping car : Tata Safari");
		return false;
	}

	@Override
	public boolean isRunning() {
		System.out.println("Car " + ((running == true) ? "is running!" : "has stopped!"));
		return running;
	}

}
