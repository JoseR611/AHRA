import java.util.Scanner;

public class mainFile{

  public static void main(String[] args){
    System.out.println("Input number of exercises and what exercise seperated by a space:");
    System.out.println("Avaliable exercises: " + "matchTheWord");
    Scanner typeOfGame = new Scanner(System.in);
    int num = typeOfGame.nextInt();
    String exercise = typeOfGame.nextLine();
    exercise = exercise.replace(" ", "");
    
    app a = new app(num, exercise);
    int counter = 0;
    for(Exercise e : a.getcurrentExer()) {
    	e.runExercise();
    	if(e.getCompleted()){
    	    counter++;
    	}
    }
    
    if(counter == a.getcurrentExer().size()){
        System.out.println("You got them all right!!!!!!!!!");
    }else if(counter > 0){
        System.out.println("You got " + counter + " right out of " + a.getcurrentExer().size());
    }else{
        System.out.println("You did not get any of them right, but you can do it if you keep trying!");
    }
  }

}
