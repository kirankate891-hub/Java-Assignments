class Player {
    private String name;
    private int age;
    private String country;
    private int matchesPlayed;
    private int jerseyNumber;

    public Player(String name, int age, String country, int matchesPlayed, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public int getMatchesPlayed() { return matchesPlayed; }
    public int getJerseyNumber() { return jerseyNumber; }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country
                + ", Matches: " + matchesPlayed + ", Jersey No: " + jerseyNumber);
    }
}

class CricketPlayer extends Player {
    private int totalRuns;
    private int totalWickets;
    private String battingStyle;
    private String bowlingStyle;

    public CricketPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber,
                         int totalRuns, int totalWickets, String battingStyle, String bowlingStyle) {
        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
    }

    public int getTotalRuns() { return totalRuns; }
    public int getTotalWickets() { return totalWickets; }
    public String getBattingStyle() { return battingStyle; }
    public String getBowlingStyle() { return bowlingStyle; }

    @Override
    public void display() {
        super.display();
        System.out.println("Runs: " + totalRuns + ", Wickets: " + totalWickets
                + ", Batting: " + battingStyle + ", Bowling: " + bowlingStyle);
    }
}

class FootballPlayer extends Player {
    private int totalGoals;
    private String playingPosition;

    public FootballPlayer(String name, int age, String country, int matchesPlayed, int jerseyNumber,
                          int totalGoals, String playingPosition) {
        super(name, age, country, matchesPlayed, jerseyNumber);
        this.totalGoals = totalGoals;
        this.playingPosition = playingPosition;
    }

    public int getTotalGoals() { return totalGoals; }
    public String getPlayingPosition() { return playingPosition; }

    @Override
    public void display() {
        super.display();
        System.out.println("Goals: " + totalGoals + ", Position: " + playingPosition);
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        Player[] players = {
            new CricketPlayer("Virat Kohli", 36, "India", 300, 18, 14000, 4, "Right-hand", "Right-arm medium"),
            new FootballPlayer("Sunil Chhetri", 42, "India", 150, 11, 94, "Forward")
        };
        for (Player p : players) {
            p.display();
            System.out.println("----------");
        }
    }
}
