import java.util.ArrayList;

public class app{
      private int exercises;
      private String exerciseName;
      private ArrayList<Exercise> currentExer;
    
      public app(int numOfExer, String name){
          exercises = numOfExer;
          exerciseName = name;
          currentExer = new ArrayList<>();
          this.createExercises(exercises, exerciseName);
      }
    
      public void createExercises(int num, String type){
          if(type.equals("matchTheWord")){
              for(int i = 0; i < num; i++){
                  currentExer.add(new matchTheWord(3));
                  //matchTheWord of words 3 characters long
              }
          }
      }
    
      public ArrayList<Exercise> getcurrentExer(){
          return currentExer;
      }

}
