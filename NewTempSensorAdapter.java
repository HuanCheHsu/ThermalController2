package itec3030.assignments.a2;

import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, TemperatureSensor, Observer{

	private NewTempSensorDriver sensorDriver;
	private ControllerInterface controllerInterface;
	 private String ID;
	private int temperature;
	private boolean enable;
	
	public NewTempSensorAdapter()
	{
		sensorDriver = new NewTempSensorDriver();
	}
	
	@Override
	public NewTempSensorDriver getAdatptee() {
		// TODO Auto-generated method stub
		return this.sensorDriver;
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		this.enable = false;
		
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		this.enable = true;
	}

	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return enable;
	}

	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		 return this.controllerInterface;
	}	

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	@Override
	public void setController(ControllerInterface arg0) {
		// TODO Auto-generated method stub
		this.controllerInterface = arg0;
	}

	@Override
	public void setID(String arg0) {
		// TODO Auto-generated method stub
		this.ID = arg0;
	}

	@Override
	public int getReading() {
		// TODO Auto-generated method stub
		return this.temperature;
	}

	@Override
	public void newTemperature(int arg0) {
		// TODO Auto-generated method stub
		this.temperature = arg0;
		System.out.println("Sensor("+this.ID+")receiving new temperature:" + this .getReading());
	}
	
	@Override
	public void update(int temperature) {
        this.temperature = temperature;
        System.out.println("Sensor (" + this.ID + ") receiving new temperature: " + this.getReading());
    }

}
