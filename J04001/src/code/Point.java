package code;

import java.util.Scanner;

public class Point {
	private double x,y;
	public Point() {
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		super();
		this.x = p.getX();
		this.y = p.getY();
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double distance (Point p1,Point p2) {
		double dx,dy;
		dx = (double)Math.abs(p1.getX() - p2.getX());
		dy = (double)Math.abs(p1.getY() - p2.getY());
		double res = (double) Math.sqrt(dx*dx + dy*dy);
		return res;
	}
	public double distance (Point secondPoint) {
		double dx,dy;
		dx = (double)Math.abs(getX() - secondPoint.getX());
		dy = (double)Math.abs(getY() - secondPoint.getY());
		double res = (double) Math.sqrt(dx*dx + dy*dy);
		return res;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			Point p1,p2;
			p1 = new Point(sc.nextDouble(),sc.nextDouble());
			p2 = new Point(sc.nextDouble(),sc.nextDouble());
			Double res = p1.distance(p2);
			System.out.println(String.format("%.4f", res));
		}
	}
}
