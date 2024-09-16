package dad.codewars;

public class RockPaperScissors {

	public static String rps(String player1, String player2) {

        if (player1.equals(player2)) {
            return "Draw!";
        }

        switch (player1) {
            case "rock":
                return (player2.equals("scissors")) ? "Player 1 won!" : "Player 2 won!";
            case "paper":
                return (player2.equals("rock")) ? "Player 1 won!" : "Player 2 won!";
            case "scissors":
                return (player2.equals("paper")) ? "Player 1 won!" : "Player 2 won!";
            default:
                return "Invalid choice!";
        }
	}
	
}
