package com.example.serializationdeserialization;

import java.io.Serializable;

public class GameState implements Serializable {
    private static final long serialVersionUID = 1L;
    private int score;
    private String playerName;
    private int level;

    public GameState(String playerName, int score, int level) {
        this.playerName = playerName;
        this.score = score;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player: " + playerName + ", Score: " + score + ", Level: " + level;
    }
}