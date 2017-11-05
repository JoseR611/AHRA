import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class matchTheWord extends Exercise{

    //between 3-6 letters
    private int numOfLetters;   
    private String word;
    private ArrayList<String> listOfWords;
    
    public matchTheWord(int letterNum){
        numOfLetters = letterNum;
        completed = false;
        listOfWords = new ArrayList<>();
        if(numOfLetters == 3){
            this.readCSVFile("matchTheWord3.csv");
        }
    }

    public void runExercise(){
        Random r = new Random();
        String wordSpelling = listOfWords.get(r.nextInt(listOfWords.size()));
        System.out.println("The word is: " + wordSpelling);
        /*
        Scanner ans = new Scanner(System.in);
        if(ans.nextLine().equals(wordSpelling)){
            completed = true;
            System.out.println("You got it right!!!!!");
        }else{
            System.out.println("Sorry, try again another time!");
        }
        */
    }
    
    
    public void readCSVFile(String filename){
        try{
            for(String line : Files.readAllLines(Paths.get(filename))){
                line = line.replace("\"", ""); 
                
                if(!line.equals("")){
                    System.out.println("*"+line+"*");
                    listOfWords.add(line);
                }

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public boolean getCompleted(){
        return completed;
    }
}
