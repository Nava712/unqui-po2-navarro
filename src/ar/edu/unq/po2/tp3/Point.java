package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Point() {
		this.setPoint(0, 0);
	}
	
	public int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sumarPoint(Point punto) {
		int sumaX = this.x + punto.getx();
		int sumaY = this.y + punto.gety();
		
		Point p = new Point(sumaX, sumaY);
		return p;
	}
}
