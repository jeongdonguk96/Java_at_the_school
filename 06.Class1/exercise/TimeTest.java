package exercise;

class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(){}
	
	public Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		if(hour>=0 && hour<=23) {
			this.hour = hour;
		} else {
			System.out.println("hour의 값이 0~23사이가 아닙니다.");
			return;
		}
	}
	
	public void setMinute(int minute) {
		if(minute>=0 && minute<=60) {
			this.minute = minute;
		} else {
			System.out.println("minute의 값이 0~59사이가 아닙니다.");
			return;
		}
	}
	
	public void setSecond(int second) {
		if(second>=0 && second<=60) {
			this.second = second;
		} else {
			System.out.println("second의 값이 0~59사이가 아닙니다.");
			return;
		}
	}
	
	public String getTime() {		
		// System.out.println(hour + ":" + minute + ":" + second);
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString() {
		return "Time[hour = " + hour + ", minute = " + minute + ", second = " + second + "]";
	}
	
	//현재 시각에 +1초를 계산하여 Time객체로 반환
	public Time nextSecond() {
		
		Time tmp = new Time(getHour(), getMinute(), getSecond());
		
		int hour = getHour();
		int minute = getMinute();
		int second = getSecond();
		
		second++;
		if(second==60) {
			second = 0;
			minute++;
			if(minute==60) {
				minute = 0;
				hour++;
				if(hour==24){
					hour = 0;
				}
			}
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
		tmp.setHour(hour);
		tmp.setMinute(minute);
		tmp.setSecond(second);
	
		return tmp;
		
	}
	
	//현재 시각에 -1초를 계산하여 Time객체로 반환
	public Time previousSecond() {
		
		Time tmp = new Time(getHour(), getMinute(), getSecond());
		
		int hour = getHour();
		int minute = getMinute();
		int second = getSecond();
		
		second--;
		if(second<0) {
			second = 59;
			minute--;
			if(minute<0) {
				minute = 59;
				hour--;
				if(hour<0){
					hour = 23;
				}
			}
		}
		tmp.setHour(hour);
		tmp.setMinute(minute);
		tmp.setSecond(second);
	
		return tmp;
		
	}
	
}

public class TimeTest {

	public static void main(String[] args) {
		Time t1 = new Time();
		Time t2 = new Time(16, 49, 23);
		Time t3 = new Time(23, 59, 59);
		Time t4 = new Time(00, 00, 00);
		
		System.out.println("현재 시각은 " + t2.getTime());
		System.out.println(t3);
		System.out.println("nextSecond() 실행 후 " + t3.nextSecond());
		System.out.println(t4);
		System.out.println("previousSecond() 실행 후 " + t4.previousSecond());
				
	}

}
