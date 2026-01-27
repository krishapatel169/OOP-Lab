import java.util.Scanner;
class Time
{
	int hours,minutes;
	void setTime(int h, int m)
	{
		hours=h;
		minutes=m;
	}
	void displayTime()
	{
		System.out.println("Time:"+hours+":"+minutes);
	} 
	void addTime(Time t1, Time t2)
	{
		hours=t1.hours+t2.hours;
		minutes=t1.minutes+t2.minutes;
		displayTime();
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Time t1=new Time();
		System.out.println("Enter time in hours:"); 
		int h=sc.nextInt();
		System.out.println("Enter time in minutes:"); 
		int m=sc.nextInt();
		Time t2=new Time();
		System.out.println("Enter time in hours:"); 
		int hour=sc.nextInt();
		System.out.println("Enter time in minutes:"); 
		int minute=sc.nextInt();
		t1.setTime(h,m);
		t2.setTime(hour,minute);
		t1.displayTime();
		t2.displayTime();
		Time t3=new Time();
		t3.addTime(t1,t2);
	
	}
}