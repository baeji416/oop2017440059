
public class Point {
	
	//�ʵ��� scope(��ȿ ����)��  Ŭ�� �����̴�. 
	private double x; 
	private double y; 
 
	 
 	 
	public double getX() { 
			return x; 
	 	} 
	 
	 
	 	public double getY() { 
	 		return y; 
	 	} 
	 	 
	 	public void setX(double xx) { 
	 		this.x=xx; 
	 		xx=100.0; 
	 	} 
	 
	 
	
	 
	public void setY(double yy) { 
			this.y=yy;	 
	 		yy=100.0; 
	 	} 
	 
	 
	 
	 
	 	public double distance() { 
	 		//��ȯ�� ��� ���� 
	 		double result;//���� ������ ��ȿ������ �޼ҵ� �����̴�. 
	 
	 
	 		//�Ÿ� ��� 
	 		result = Math.sqrt(x*x+y*y); 
	 
	 
	 		//�Ÿ� ��ȯ 
	 		return result; 
		} 
	 
	  	public Point move(Point p) {//�Ű����� p�� ��ȿ������ �޼ҵ� �����̴�. 
	 
	 
	 		//temp ���� ���� 
	 		double a; 
	 		double b; 
	 
	 
	 		//����Ʈ p ��ŭ �̵� 
	 		b= this.y + p.y; 
	 
	 
	 		//���ο� ����Ʈ ���� 
	 		Point pnt = new Point(); 
	 		pnt.x=a; 
	 		pnt.y=b; 
	 
	 
	 		//���ο� ����Ʈ ��ȯ 
	 		return pnt; 

	 	} 
	 } 

}
