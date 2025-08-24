package code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhanVien {
	private String Name,Sex,Address,IDTax;
	private Date Birth,ContractDate;
	public NhanVien(String name, String sex, String address, String iDTax, Date birth, Date contractDate) {
		super();
		Name = name;
		Sex = sex;
		Address = address;
		IDTax = iDTax;
		Birth = birth;
		ContractDate = contractDate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getIDTax() {
		return IDTax;
	}
	public void setIDTax(String iDTax) {
		IDTax = iDTax;
	}
	public Date getBirth() {
		return Birth;
	}
	public void setBirth(Date birth) {
		Birth = birth;
	}
	public Date getContractDate() {
		return ContractDate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d1,d2;
		d1 = sdf.format(Birth);
		d2 = sdf.format(ContractDate);
		return "00001 "+ getName() + " " + getSex() + " " + d1 + " " + getAddress() + " " + getIDTax() + " " + d2;
	}
	public void setContractDate(Date contractDate) {
		ContractDate = contractDate;
	}
	public static void main(String[] args) throws ParseException {
		Scanner sc = new  Scanner(System.in);
		String name,sex,address,idtax;
		Date birth,contractdate;
		name = sc.nextLine();
		sex = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		birth = sdf.parse(sc.nextLine());
		address = sc.nextLine();
		idtax = sc.nextLine();
		contractdate = sdf.parse(sc.nextLine());
		NhanVien nv = new NhanVien(name, sex, address, idtax, birth, contractdate);
		System.out.println(nv.toString());
	}
}

