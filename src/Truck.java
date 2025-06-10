public class Truck extends Vehicle {
	public Truck(int x,int y,int vx,int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+60, y   , 20, 30);
		frame.fillRect(x   , y+15, 80, 15);
		frame.fillOval(x+5, y+30, 10, 10);
		frame.fillOval(x+15, y+30, 10, 10);
		frame.fillOval(x+65, y+30, 10, 10);
	}
 }
