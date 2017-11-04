package wordPlay;

import exercise.Exercise;

public class matchTheWord extends Exercise{

	//between 3-6 letters
	private int numOfLetters;
	private String word;

	public matchTheWord(int letterNum){
		numOfLetters = letterNum;
		completed = false;
	}

	public void runExercise(){
		System.out.println("The word is: " + "testing");
	}
}
