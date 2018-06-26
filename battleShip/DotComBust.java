import java.util.*;
public class DotComBust{
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        // first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        System.out.println("Choices are a-g and 0-6, for example b0, c3, g6");

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }// end of for loop
    } // end setUpGame method

    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }//end of while
        finishGame();
    }//end of startPlaying method

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for(int x = 0; x < dotComsList.size(); x++){
            result = dotComsList.get(x).checkYourself(userGuess);
            if(result.equals("hit")){
                break;  // if user guess is a hit then break out of loop and ask for a new location to check
            }
            if (result.equals("kill")){
                dotComsList.remove(x);
                break; // if user guess is a kill remove the Com from the list
            }
        }//end of for loop

        System.out.println(result);
    }//end of checkUserGuess method

    private void finishGame(){
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println(" You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }// end of finsihGame method

    public static void main (String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }// end of main

}//end of DotComBust
