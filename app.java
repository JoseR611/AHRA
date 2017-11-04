import java.util.ArrayList;

public class app{

  private int exercises;
  private String exerciseName;
  private ArrayList<Exercise> currentExer;

  public app(int numOfExer, String name){
    exercises = numOfExer;
    exerciseName = name;
    currentExer = this.createExercises(exercises, exerciseName);
  }

  public ArrayList<Exercise> createExercises(int num, String type){
    ArrayList<Exercise> listOfExer = new ArrayList<>();

    if(type.equalsTo("matchTheWord")){
      for(int i = 0; i < num; i++){
        listOfExer.add(new matchTheWord(3));
        //matchTheWord of words 3 characters long
      }
    }
    
    return listOfExer;
   }
    
    public ArrayList<Exercise> getcurrentExer(){
    	return currentExer;
    }

}
