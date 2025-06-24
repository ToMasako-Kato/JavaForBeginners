import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	int n=1;
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		for (n=1; n<30; n++) 
		{
			cars.add(new Car(50,25,n,0));
			
			cars.add(new Car(50,100,n+1,0));
		
			cars.add(new Car(50,175,n+2,0));
			
			cars.add(new Car(50,250,n+3,0));
		
			cars.add(new Car(50,325,n+4,0));//ここでnは5
			for(int i=0; i<751; i++) {
				clear();
				for(int j=0; j<cars.size(); j++) {
					cars.get(j).draw(this);
					cars.get(j).move(this);
				}
				sleep(0.005);			
			}
			cars.clear();
		}
		
	}
}
