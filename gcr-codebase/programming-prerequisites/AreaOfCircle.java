import java.util.Scanner;

class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius:");
		float radius = sc.nextFloat();
		float pi = 3.14f;
		float area = pi * (radius * radius);
		System.out.println("Area of Circle: "+ area);
	}
}	