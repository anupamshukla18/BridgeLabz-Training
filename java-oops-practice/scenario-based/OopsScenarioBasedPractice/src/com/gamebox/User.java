package com.gamebox;
// User class
class User {
    private String name;
    private Game[] ownedGames;
    private int count;

    User(String name) {
        this.name = name;
        ownedGames = new Game[10];
        count = 0;
    }

    // Encapsulation: games cannot be modified directly
    void buyGame(Game g) {
        ownedGames[count++] = g;
        System.out.println(g.title + " added to your library.");
    }

    void showLibrary() {
        System.out.println("\n--- " + name + "'s Games ---");
        if (count == 0) {
            System.out.println("No games owned.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println("- " + ownedGames[i].title);
        }
    }
}
