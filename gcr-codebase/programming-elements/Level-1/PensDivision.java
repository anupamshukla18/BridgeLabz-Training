public class PensDivision {
    public static void main(String[] args) {
		//Initializing total pen
        int totalPens = 14;
		
		//Initializing students
        int students = 3;

		//Calculating pens per student 
        int pensPerStudent = totalPens / students;
		
		//Calculating remaining pens 
        int remainingPens = totalPens % students;

		//Displaying the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
