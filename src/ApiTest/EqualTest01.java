package ApiTest;

public class EqualTest01 {
	public static void main(String[] args) {
		MyTime t = new MyTime(2022, 3, 14);
		System.out.println(t);
		MyTime t2 = new MyTime(2022, 3, 14);
		System.out.println(t.equals(t2));
		
		MyTime t3 = new MyTime();
		System.out.println(t3.equals(t));
		
	}
}

class MyTime  {
	private int year;
	private int month;
	private int day;

	public MyTime() {
		// TODO Auto-generated constructor stub
	}

	public MyTime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "MyTime [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyTime other = (MyTime) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	 
/*	public String toString() {
		return this.year + "/" + this.month + "/" + this.day;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof MyTime)||obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		MyTime t =(MyTime)obj;
		return this.year==t.year&&this.month==t.month&&this.day==t.day;
	}*/
	

}
