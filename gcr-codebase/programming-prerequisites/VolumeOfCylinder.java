import java.util.Scanner;

class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float radius = sc.nextFloat();
		System.out.print("Enter the height: ");
		float height = sc.nextFloat();
		float pi = 3.14f;
		float volume = pi*(radius*radius)*height;
		System.out.println("Volume of Cylinder: "+ volume);
	}
}