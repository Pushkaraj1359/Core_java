class Player{
    private String name;
    private int runs;

    Player(String name){
        this.name=name;
        this.runs=0;
    }

    void addRuns(int r){
        runs +=r;
    }
}

class Team {
    String name;
    int totalRuns;
    int wickets;
    int overs;

    Team(String name){
        this.name = name;
        totalRuns = 0;
        wickets = 0;
        overs = 0;
    }

    void addRuns(int runs){
        totalRuns += runs;
    }

    void addWicket(){
        wickets++;
    }

    void addOver(){
        overs++;
    }
}

class ScoreBoard {

    void displayScore(Team team) {
        System.out.println("Team: " + team.name);
        System.out.println("Score: " + team.totalRuns + "/" + team.wickets);
        System.out.println("Overs: " + team.overs);
        System.out.println("----------------------");
    }
}
public class G_match {
    public static void main(String[] args) {
        Team india = new Team("India");
        ScoreBoard board = new ScoreBoard();

    
        india.addRuns(4);
        india.addRuns(2);
        india.addWicket();
        india.addOver();

        board.displayScore(india);

        india.addRuns(6);
        india.addRuns(1);

        board.displayScore(india);
    }
}
