import java.util.Scanner;
public class RockPaperScissorsGame {
    // Method to get computer choice using Math.random()
    public static String getComputerChoice() {
        int num = (int) (Math.random() * 3); // 0,1,2

        if (num == 0)
            return "Rock";
        else if (num == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to decide winner
    public static String getWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if (user.equalsIgnoreCase("Rock")) {
            return (computer.equals("Scissors")) ? "User" : "Computer";
        }

        if (user.equalsIgnoreCase("Paper")) {
            return (computer.equals("Rock")) ? "User" : "Computer";
        }

        if (user.equalsIgnoreCase("Scissors")) {
            return (computer.equals("Paper")) ? "User" : "Computer";
        }

        return "Invalid";
    }

    // Method to calculate total and percentage wins
    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] result = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        result[0][0] = "User";
        result[0][1] = String.valueOf(userWins);
        result[0][2] = String.format("%.2f", userPercent) + "%";

        result[1][0] = "Computer";
        result[1][1] = String.valueOf(compWins);
        result[1][2] = String.format("%.2f", compPercent) + "%";

        return result;
    }

    // Method to display round results and final stats
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\n----- GAME RESULTS -----");
        System.out.printf("%-10s %-12s %-12s %-10s\n", "Game", "User", "Computer", "Winner");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10d %-12s %-12s %-10s\n",
                    (i + 1),
                    gameResults[i][0],
                    gameResults[i][1],
                    gameResults[i][2]);
        }

        System.out.println("\n----- OVERALL STATS -----");
        System.out.printf("%-12s %-12s %-15s\n", "Player", "Wins", "Win %");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-12s %-12s %-15s\n",
                    stats[i][0],
                    stats[i][1],
                    stats[i][2]);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int games = sc.nextInt();

        String[][] results = new String[games][3];

        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("\nEnter your choice (Rock / Paper / Scissors): ");
            String userChoice = sc.next();

            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            results[i][0] = userChoice;
            results[i][1] = compChoice;
            results[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);

        displayResults(results, stats);
    }
}
