
import javax.swing *;
import java.until*;
public class Guess
{
    // instance variables - replace the example below with your own
    private String playerName;
    private String gameChoice;
    private int randomNumber;
    private int guess;
    Random randomGenerator = new Random();
    public Guess()
    {
        playername = "";
    }

    
    public void display_message()
    {
        System.out.println("Welcome to the number guessing game")
    }
    
    public void play_game()
    {
        //3.1   	Display Menu
        
        //3.2   	If option is equal to play then
        
        //3.3               	Enter player name
        
        //3.4               	Generate random number
       
        //3.4.1	Computer generates a number between 1 and 50       	
        
        //3.5               	While found equals false do
        
        //3.6   	        	        	enter lucky guess from player
        
        //3.7               	        	if guess equals random number then
        
        //3.8                           	        	set found to true
        
        //3.9               	        	else if guess is less than random number then
        
        //3.10             	        	        	display a less than message
        
        //3.11 	        	        	else
        
        //3.12             	        	        	display a more than message
        
        //3.13             	        	end if
        
        //3.14 	        	end while
        
        //3.15             	Display results
        
        //3.16 	else
        
        //3.17             	quit game
        
        //3.18 	end if

    }
    
    public void display_message()
    {
        System.out.println("Thanks for playing")
    }
}
