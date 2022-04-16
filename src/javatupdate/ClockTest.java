package javatupdate;

public class ClockTest {
	public static void main(String[] args) {
		Clock c1 = new Clock();
		c1.setSec(20);
		c1.setMin(30);
		c1.setHour(10);
		c1.disPlay();
		c1.addSec(40);
		c1.disPlay();
		c1.addSec(130);
		c1.disPlay();
	}
}

class Clock {
	//对象
	private int sec;
	private int min;
	private int hour;

	public Clock() {
	}

	public Clock(int sec, int min, int hour) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	//展示方法
	public void disPlay() {
		System.out.println(this.getHour() + "时" + this.getMin() + "分" + this.getSec() + "秒");
	}
	//秒数++
	public void addSec(int addsec){
		int oldsec=this.getSec();
		int newsec =oldsec+addsec;
		if(newsec<60){
			this.setSec(this.getSec()+addsec);
		}else if(newsec==60){
			this.addMin(1);
			this.setSec(0);
		}else{
			int newmin=newsec/60;
			this.addMin(newmin);
			this.addSec(newsec%60);
		}
			
			
			
	}
	//分钟++
	public void addMin(int addmin){
		this.setMin(this.getMin()+addmin);
		
	}
	//小时++
	public void addHour(int addhour){
		this.setHour(this.getHour()+addhour);
	}
}






















