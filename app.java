import java.util.ArrayList;

public class app{

  int exercises;
  String exerciseName;

  public app(int numOfExer, String name){
    exercises = numOfExer;
    exerciseName = name;
    this.createExercises(exercises, exerciseName);
  }

  public ArrayList<Exercise> createExercises(int num, String type){
    ArrayList<Exercise> listOfExer = new ArrayList<>();

    if(type.equalsTo("matchTheWord")){
      for(int i = 0; i < num; i++){
        listOfExer.add(new matchTheWord(3));
      }
    }


  }
}
