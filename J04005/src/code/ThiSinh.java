package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThiSinh {
	private String Name;
	private Date Birth;
	private double Subject1,Subject2,Subject3,Total;
	public ThiSinh(String name, Date birth, double subject1, double subject2, double subject3, double total) {
		super();
		Name = name;
		Birth = birth;
		Subject1 = subject1;
		Subject2 = subject2;
		Subject3 = subject3;
		Total = Subject1+Subject2+Subject3;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBirth() {
		return Birth;
	}
	public void setBirth(Date birth) {
		Birth = birth;
	}
	public double getSubject1() {
		return Subject1;
	}
	public void setSubject1(double subject1) {
		Subject1 = subject1;
	}
	public double getSubject2() {
		return Subject2;
	}
	public void setSubject2(double subject2) {
		Subject2 = subject2;
	}
	public double getSubject3() {
		return Subject3;
	}
	public void setSubject3(double subject3) {
		Subject3 = subject3;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	@Override
	public String toString() {
		return getName() + " " + getBirth().getDate() +"/"+ (getBirth().getMonth()+1)+"/"+(getBirth().getYear()+1900)+" "+ getTotal();
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(sc.nextLine());
		double sb1,sb2,sb3;
		sb1 = sc.nextDouble();
		sb2 = sc.nextDouble();
		sb3 = sc.nextDouble();
		ThiSinh ts = new ThiSinh(name, date, sb3, sb1, sb2, sb3);
		System.out.println(ts.toString());
	}
	
}
