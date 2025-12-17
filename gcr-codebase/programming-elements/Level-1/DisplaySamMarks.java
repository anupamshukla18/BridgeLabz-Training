class DisplaySamMarks{
	public static void main(String[] args){
		//person's name
		String name = "Sam";
		
		//Maths marks of the person
		float mathsMarks = 94;
		
		//Physics marks of the person
		float physicsMarks = 95;
		
		//Chemistry marks of the person
		float chemistryMarks = 96;
		
		//Calculating Average marks 
		float averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3;
		
		//Displaying the result
		System.out.println(name + "'s average mark in PCM is " + averageMarks);
	}
}
	