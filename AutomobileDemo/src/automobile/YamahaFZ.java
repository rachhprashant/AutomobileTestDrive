package automobile;

public class YamahaFZ extends TwoWheeler {

	private boolean running = false;
	private String model = "Yamaha FZ";

	public String getModel() {
		return model;
	}

	@Override
	public boolean start() {
		running = true;
		System.out.println("Starting bike : Yamaha FZ");
		return true;
	}

	@Override
	public boolean stop() {
		running = false;
		System.out.println("Stopping bike : Yamaha FZ");
		return false;
	}

	@Override
	public boolean isRunning() {
		System.out.println("Bike " + ((running == true) ? "is running!" : "has stopped!"));
		return running;
	}

}
