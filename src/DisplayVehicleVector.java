import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
public void run()
{
	Vector<Vehicle> vehicles=new Vector<Vehicle>();
	vehicles.add(new Car(10,30,4,0));
	vehicles.add(new Car(10,80,-5,0));
	vehicles.add(new Train(10,150,7,0));
	vehicles.add(new Train(10,210,-8,0));
	vehicles.add(new Truck(10,260,6,0));
	vehicles.add(new Truck(10,310,7,0));
	
	for(int i=0;i<6000;i++) {
		clear();
		for(int j=0;j<vehicles.size();j++) {
			vehicles.get(j).draw(this);
			vehicles.get(j).move(this);
		}
		sleep(0.01);
	}
	}
}
