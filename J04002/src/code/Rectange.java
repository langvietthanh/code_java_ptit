package code;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Rectange {
	private double width,height;
	private String color;
	public Rectange(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color =  color.substring(0,1).toUpperCase() + ( color.length()>1 ? color.substring(1).toLowerCase():"");
	}
	public Rectange() {
		this.width = 1;
		this.height = 1;
		this.color = "White";
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color.substring(0,1).toUpperCase() + ( color.length()>1 ? color.substring(1).toLowerCase():"");
	}
	public double findArea() {
		return width*height;
	}
	public double findPerimeter() {
		return 2*(width+height);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		if(st.countTokens()!=3) {
			System.out.println("INVALID");
			return;
		}
		double a,b;
		String s;
		a = Double.parseDouble(st.nextToken()) ;
		b = Double.parseDouble(st.nextToken());
		s = st.nextToken();
		if(a<0 || b<0) {
			System.out.println("INVALID");
			return;
		}
		Rectange r = new Rectange(a,b,s);
		System.out.printf("%.0f %.0f %s\n",r.findPerimeter(),r.findArea(), r.getColor());
	}
}
