
public class Vehicle {
int x,y,vx,vy;

public Vehicle(int x,int y,int vx,int vy) {
	this.x=x;
	this.y=y;
	this.vx=vx;
	this.vy=vy;
}
public void draw(MyFrame f) {
}
public void move(MyFrame f) {
	x+=vx;
	y+=vy;
	int width = f.getWidth();
	int height = f.getHeight();
	
	if(x<-80)
	{
		x += width+160;
	}
	else if(x>width+80) 
	{
		x-=width+160;
	}
	if(y<-60)
	{
		y += height+120;
	}
	else if(y>height+60) 
	{
		y-=height+120;
	}
}
}
