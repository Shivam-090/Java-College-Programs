import java.util.*;

class MinorQ5{
	public static void main(String []args){
		Time time1 = new Time();
		Time ti = new Time();
		ti.display();
		Time ti1 = new Time(3, 28, 10);
		ti1.display();
		time1 = ti.addTime(ti);
	}
}

class Time{
	int hour, min, sec;
	Time(){
		hour = 0;
		min = 0;
		sec = 0;
	}
	Time(int hour, int min, int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	void display(){
		System.out.println(hour + ":" + min + ":" + sec);
	}

	Time addTime(Time time){
		Time t = new Time();
		t.hour = this.hour + time.hour;
		t.min = this.min + time.min;
		t.sec = this.sec + time.sec;
		return t;
	}
}