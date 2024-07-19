package com.example.serializationdeserialization;

import com.example.serializationdeserialization.GameState;

import java.io.IOException;

public class GameStateSerialization {
    public static void main(String[] args) {
        GameState gameState = new GameState("Alice", 1000, 5);
        String fileName = "gamestate.ser";

        try {
            // Serialization
            GameStateSerializer.serialize(gameState, fileName);

            // Deserialization
            GameState loadedState = GameStateSerializer.deserialize(fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}