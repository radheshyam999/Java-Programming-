package problemSloving;
//36) Java Program to Display Alternate Prime Numbers
public class ThirtySix {
    
    int numberOfBook = 4;
    int []earned = {3,4,2};
    int []cost = {5,3,4};

    public int amountToTakeLoan(int[] earned, int[] cost) {
        int totalEarned = 0;
        int totalCost = 0;
        for (int c : cost)
            totalCost += c;
        
        for (int e : earned) 
            totalEarned +=e;    
        if (totalCost -  totalEarned > 0) {
            return totalCost -  totalEarned; // if cost is more than earned amount the he has to take loan otherwise not 
        } else {
            return 0; // in case of earned amount is morethan cost the he has to take nothing 
        }
         // returning last person
    }
    
}
