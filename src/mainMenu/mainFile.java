package mainMenu;

public class mainFile{

  public static void main(String[] args){
    System.out.println("Input number of exercises and what exercise seperated by a space:");
    Scanner typeOfGame = new Scanner(System.in);
    String[] response = typeOfGame.next().split(",");
    app a = new app(5, typeOfGame.next());
    for(Exercise e : a.getcurrentExer()) {
    	e.runExercise();
    }
  }

}
