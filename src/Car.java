
public class Car {
int x,y,vx,vy;
public Car(int x,int y, int vx,int vy) {
	this.x=x;
	this.y=y;
	this.vx=vx;
	this.vy=vy;
}
public void draw(MyFrame frame) {
	frame.fillRect(x+18.75, y, 37.5, 25);
	frame.fillRect(x, y+25, 75, 25);
	frame.fillOval(x+6.25, y+50, 25, 25);
	frame.fillOval(x+43.75, y+50, 25, 25);
}
public void move() {
	x+=vx;
	y+=vy;
	//位置を判断させ、場所変える
	if(x>400) 
	{
		x=0;
	}
}
}
