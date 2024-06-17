package itec3030.assignments.a2;

import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;

public class OldTempSensorAdapter implements TemperatureSensor {

	   private OldTempSensor oldTempsensor = new OldTempSensor();
       private ControllerInterface controllerInterface;
       private String ID;
       private int temperature;
       private boolean enable;
	
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
		this.temperature =  (int) this.oldTempsensor.getTemperature();
        return temperature;
	}

	@Override
	public void newTemperature(int arg0) {
		// TODO Auto-generated method stub
		 this.oldTempsensor.newTemperature(arg0);
	}

}
