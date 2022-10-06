package exercise;

class Time2 {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time2(){}
	
	public Time2(int hour, int minute, int second){
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
		if(hour>=0 && hour<24) {
			this.hour = hour;
		} else {
			System.out.println("잘못된 숫자를 입력했습니다.");
			return;
		}
	}
	
	public void setMinute(int minute) {
		if(minute>=0 && minute<60) {
			this.minute = minute;
		} else 
			System.out.println("잘못된 숫자를 입력했습니다.");
			return;
	}
	
	public void setSecond(int second) {
		if(second>=0 && second<60) {
			this.second = second;
		} else {
			System.out.println("잘못된 숫자를 입력했습니다.");
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
	
	public Time nextSecond() {
		
		Time tmp = new Time(getHour(), getMinute(), getSecond());
			
			int hour = getHour();
			int second = getSecond();
			int minute = getMinute();
			
			second++;
			if(second==60) {
				second = 0;
				minute++;
			} 	if(minute==60) {
					minute = 0;
					hour++;
			}		if(hour==24) {
						hour = 0;
				}
			
			tmp.setHour(hour);
			tmp.setMinute(minute);
			tmp.setSecond(second);
			
			return tmp;
			
	}
	

	
	
	
	
			
	}
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public class TimeTest2 {

	public static void main(String[] args) {


	}

}
