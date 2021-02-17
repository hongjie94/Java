import javax.swing.*;

public class GuessingGame {

	public static void main(String[] args) {
		
		// Generate random answer 1-100
		int answer = (int) (Math.random()*100 + 1);
		
        int userInput = 0;
        System.out.println("The Correct Answer is " + answer);
        
        // Constant guessing chances
        int totalCount = 10;
        
        // Number of guessing chances
        int count = 10;
        
 
        while (userInput != answer && count != 0)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100.\nYou have " + count + " Chances", "Guessing Game", 3);
            userInput = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ userGuesses(userInput, answer, count, totalCount));
            count--;
        }  
    }

    public static String userGuesses(int userInput, int answer, int count, int totalCount){
        if (userInput <=0 || userInput >100) {
            return "Your guess is invalid.\nYou have " + (count-1) + " Chances";
        }
        
        else if (count == 1 ) {
            return "You Lost!\nThe Correct Answer is " + answer;
        }
        else if (userInput == answer ){
            return "You Won!\nNumber of Tries: " +(totalCount -(count-1));
        }
        else if (userInput > answer) {
            return "Less than "+ userInput + "\nTry again!\nYou have " + (count-1) + " Chances";
        }
        else if (userInput < answer) {
            return "Greater than "+ userInput +"\nTry again!\nYou have " + (count-1) + " Chances";
        }
        else {
            return "Your guess is incorrect\nYou have " + (count-1) + " Chances";
        }

	}

}
