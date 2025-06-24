
public class Animation extends MyFrame{
	public void run() {
		//first(); // 5-1
		//second(); // 5-2
		//third(); // 5-3
		//EX1();
		EX2();
		}
	public void first() {
		int y=200;
		int x=30;
		int i;
		for(i=0; i<200; i++) {
			if(y>50) {
				clear();
				fillRect(x,y,10,100);
				y-=5;
			}
			else {
				clear();
				fillRect(x,y,10,100);
				x+=5;
			}
			sleep(0.01);
		}
	}
	public void second() {
		int y=50;
		int x=50;
		int i;
		for(i=0; i<200; i++) {
			if(i<30) {
				clear();
				fillRect(x,y,10,100);	
				x+=5;
				y+=5;
			}
			else if(i<60){
				clear();
				fillRect(x,y,10,100);
				x-=5;
			}
			else if(i<90) {
				clear();
				fillRect(x,y,10,100);
				x+=5;
				y-=5;
			}
			sleep(0.01);
		}
	}
	public void third() {
		int x=50;
		int i;
		for(i=0; i<3; i++) {
			while(x<=200){
				clear();
				fillRect(x,50,10,100);
				x+=5;
				sleep(0.01);
			}
			while(x>=50) {
				clear();
				fillRect(x,50,10,100);
				x-=5;
				sleep(0.01);
			}
		}
	}
	public void EX1() {
		int y=50;
		int x=50;
		int i;
		while(true) {
			if(x<200 && y==50) {
				clear();
				fillRect(x,y,10,100);	
				x+=5;
			}
			else if(x==200 && y<200){
				clear();
				fillRect(x,y,10,100);
				y+=5;
			}
			else if(y==200 && x>50) {
				clear();
				fillRect(x,y,10,100);
				x-=5;
			}
			else if(x==50 && y>50){
				clear();
				fillRect(x,y,10,100);
				y-=5;
			}
			sleep(0.01);
		}
	}
	public void EX2() {
		int y=50;
		int x=50;
		int i;
		while(true) {
			if(x<100 && y%100==50) {
				clear();
				fillRect(x,y,10,100);	
				x+=5;
			}
			else if(x==100 && y%100>=50){
				clear();
				fillRect(x,y,10,100);
				y+=5;
			}
			else if(y%100==0 && x>50) {
				clear();
				fillRect(x,y,10,100);
				x-=5;
			}
			else if(x==50 && y%100<50){
				clear();
				fillRect(x,y,10,100);
				y+=5;
			}
//			else if (x==50 && y==150) {
//				x=50;
//				y=50;
//			}
			sleep(0.01);
		}
	}
}
