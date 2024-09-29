package example;

public class Tester {
	public static void f1(int[][] matrix) {
		int i,j;
		
		for(i=0; i<matrix.length; i++) {
			for(j=0; j<matrix[i].length; j++) {
				System.out.println(matrix[i][j]);
			}
		}
	}
	public static boolean f2(int[][] matrix, int row, int col) {
		int i,j;
		
		for(i=0; i<row-1; i++) {
			for(j=0; j<col-1; j++) {
				if(matrix[row][col] > matrix[row+1][col+1])
					return false;
			}
		}
		return true;
	}
	public static int f3(int[][] matrix) {
		return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
		
	}
	public static void main(String[] args) {

	}
}
--------------------------------------------------------------------------------
package example;

public class Car {
	private String _modle;
	private String _color;
	private double _speed;
	
	public Car(String modle, String color, double speed) {
		_modle = modle;
		_color = color;
		_speed = speed;
	}
	public Car(double speed) {
		_modle = "Ferrari 458";
		_color = "red";
		_speed = speed;
	}
	public Car(Car other) {
		_modle = other._modle;
		_color = other._color;
		_speed = other._speed; 
	}
	
	public void toStop() {
		while(_speed > 0)
			_speed--;
	}
	public void paintToBlack() {
		_color = "black";
	}
	public boolean isBlack() {
		if(_color.equals("black"))
			return true;
		else
			return false;
	}
	public void addToSpeed(int n) {
		if(_speed + n > 90)
			_speed = 90;
		else
			_speed += n;
	}
	public void toSting() {
		System.out.println("modle: "+_modle+"\ncolor: "+_color+"\nspeed: "+_speed);
	}
	// get and set functions
	public String getModle() {
		return _modle;
	}
	public String getColor() {
		return _color;
	}
	public double getSpeed() {
		return _speed;
	}
	public void setModle(String modle) {
		_modle = modle;
	}
	public void setColor(String color) {
		_color = color;
	}
	public void setSpeed(double speed) {
		if(speed > 0)
			_speed = speed;
	}
}
--------------------------------------
