package homeworkChapter7;

public class Homework4 {

	public static void main(String[] args) {
		double result = 0.0;
		for(String string : args)
		{
			result += Double.parseDouble(string); 
		}
		System.out.println(result);

	}

}


//7.16 (Using the Enhanced for Statement) Write an application that uses an enhanced 
//for statement to sum the double values passed by the command-line arguments. 
//[Hint: Use the static method parseDouble of class Double to convert a String to a double value.]