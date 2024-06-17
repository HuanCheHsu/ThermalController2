package itec3030.assignments.a2;

public class Humidifier extends OurFurnaceDecorator {

	Humidifier(OurFurnace b) {
		// TODO Auto-generated constructor stub
		 super.b = b;
	}
	public void display()
	{
		System.out.println("Humidifier: On");
	}
}
