
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() {
		return ("("+this.x+","+this.y+")");
	}
	
	public void print() {
		//System.out.println("("+this.getX()+","+this.getY()+")");
		System.out.println("("+this.x+","+this.y+")");
	}
	
	
	
	public double distance() { 
 		//반환할 결과 선언 
 		double result;//지역 변수의 유효범위는 메소드 내부이다. 
 
 
 		//거리 계산 
 		result = Math.sqrt(x*x+y*y); 
 
 
 		//거리 반환 
 		return result; 
	} 
 
	//method overloading
	public double distance(Point p) { 
		return Math.sqrt( (this.x-p.getX() )*( this.x-p.getX() )+
				( this.y-p.getY() )*( this.y-p.getY() ) );
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
	

}
