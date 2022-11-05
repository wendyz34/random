public class Game {
    private String userChoice;
    private String computerChoice;

public Game(String computerChoice){
        int num = (int)(Math.random()*3);
        if (num==0)
            computerChoice = "rock";
        if (num==1)
            computerChoice = "paper";
        if(num==2)
                computerChoice="scissor";


    }
public String getUserChoice(){
    return userChoice;
}
public String getComputerChoice(){
    return computerChoice;
}
    public String userWinStatus() {
        if (userChoice.equals("paper")) {
            if (computerChoice.equals("rock")) return "Win";
            if (computerChoice.equals("scissors")) return "Lose";
        }else{
            return "tie";
        }
        if (userChoice.equals("scissors")) {
            if (computerChoice.equals("rock")) return "Lose";
            if (computerChoice.equals("paper")) return "Win";
        }else{
            return "tie";
        }
        if (userChoice.equals("rock")) {
            if (computerChoice.equals("scissor")) return "Win";
            if (computerChoice.equals("paper")) return "Lose";
        }else{
            return "tie";
        }
        return "if this gets returned something went wrong";
    }
}
