package code;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ThiSinh {
	private String Name,ID;
	private Date Birth;
	private double Subject;

		public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public Date getBirth() {
		return Birth;
	}

	public void setBirth(Date birth) {
		Birth = birth;
	}

	public double getSubject() {
		return Subject;
	}

	public void setSubject(double subject) {
		Subject = subject;
	}

	public ThiSinh(String name, String iD, Date birth, double subject) {
		super();
		Name = name;
		ID = iD;
		Birth = birth;
		Subject = subject;
	}
	public ThiSinh() {
	}

		@Override
	public String toString() {
		String res = String.format("%.2f",getSubject());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(getBirth());
		return "B20DCCN001 "  + getName() + " "+getID()+ " " +date+" "+ res;
	}
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String id = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(sc.nextLine());
		double sb1;
		sb1 = sc.nextDouble();
		ThiSinh ts = new ThiSinh(name,id,date,sb1);
		System.out.println(ts.toString());
	}
	
}
