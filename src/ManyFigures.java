
public class ManyFigures extends MyFrame{
	public void run() {
		//first(); // 4-1
		//second(); // 4-2
		//third(); // 4-3
		EX(); // 4-EX
	}
	public void first(){
		setColor(0,128,0);
		int i;
		for(i=0; i<10; i++) {
			fillRect(i*20+30,i*20+20,10,100);
		}
	}
	public void second(){
		setColor(0,128,0);
		int i;
		for(i=0; i<10; i++) {
			fillRect(i*20+30,75,10,i*20+10);
		}
	}
	public void third(){
		int i;
		for(i=0; i<10; i++) {
			setColor(i*25,i*25,i*25);
			fillRect(i*20+30,75,10,100);
		}
	}
	public void EX(){
		int i;
		for(i=0; i<20; i++) {
			if(i<10) {
				setColor(i*15+15,i*15+15,i*15+15);
				fillRect(i*20+30,75,10,100);
			}
			else {
				setColor(150-15*(i-9),150-15*(i-9),150-15*(i-9));
				fillRect(i*20+30,75,10,100);
			}
		}
	}
}
