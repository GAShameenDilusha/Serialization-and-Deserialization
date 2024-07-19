package com.example.serializationdeserialization;

import com.example.serializationdeserialization.GameState;

import java.io.*;

public class GameStateSerializer {
    public static void serialize(GameState gameState, String fileName) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(gameState);
            System.out.println("Game state saved successfully.");
        }
    }

    public static GameState deserialize(String fileName) throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            GameState loadedState = (GameState) in.readObject();
            System.out.println("Loaded game state: " + loadedState);
            return loadedState;
        }
    }
}