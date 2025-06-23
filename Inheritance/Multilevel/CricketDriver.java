class Game {
    String nameOfGame;
    
    Game(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    void displayGame() {
        System.out.println("Name of the Game: " + this.nameOfGame);
    }
}

class OutdoorGame extends Game {
    String location;
    int size;

    OutdoorGame(String nameOfGame, String location, int size) {
        super(nameOfGame);
        this.location = location;
        this.size = size;
    }

    void displayOutdoorGame() {
        super.displayGame();
        System.out.println();
        System.out.println("Location: " + this.location);
        System.out.println("Size of players: " + this.size);
    }
}

class TeamGame extends OutdoorGame {
    String TeamName;

    TeamGame(String nameOfGame, String location, int size, String TeamName) {
        super(nameOfGame, location, size);
        this.TeamName = TeamName;
    }

    void displayTeamGame() {
        super.displayOutdoorGame();
        System.out.println();
        System.out.println("Name of the team: " + this.TeamName);
    }
}

class CricketDriver {
    public static void main(String[] args) {
        TeamGame cricket = new TeamGame("Cricket", "Outdoor", 12, "Team India");
        cricket.displayTeamGame();
    }
}
