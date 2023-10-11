package com.descortes.struggle.enums;

import java.util.*;


public enum CharacterType {

    HUMANO("humano", 1),
    VAMPIRO("vampiro", 2),
    LOBO("lobo", 3);

    private final String type;
    private final int score;

    CharacterType(String type, int score) {
        this.type = type;
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public int getScore() {
        return score;
    }

    public static List<String> getCharacterTypes(){
    List<String> types = new ArrayList<>();
        for (CharacterType type : CharacterType.values()) {
            types.add("Tipo: " + type.getType().toUpperCase() + " -> fuerza: " + type.getScore());
        }
        return types;
    }

}
