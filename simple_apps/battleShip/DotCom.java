import java.util.*;

public class DotCom{
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }// end of setLocationCells

    public void setName(String n){
        name = n;
    }// end of setName

    public String checkYourself(String userInput){
        String result = "miss";
        /*the ArrayList indexOf() method in
         * action!  If the user guess is one of the 
         * entries in the ArrayList, indexOf()
         * will return its ArrayList location.  If
         * not, indexOf() will return -1.
         * */
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "  : ( ");
            }else {
                result = "hit";
            }  // close if
        } // close if

        return result;
    }// end of checkYourself
}// end of DotCom class
