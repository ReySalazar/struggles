package com.descortes.struggle.enums;

import java.util.ArrayList;
import java.util.List;

public enum WeaponType {

    MANO("mano", 0),
    CUCHILLO("cuchillo", 2),
    ESPADA("espada", 2);

    private final String type;
    private final Integer score;

    WeaponType(String type, Integer score){
        this.type = type;
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public Integer getScore() {
        return score;
    }

    public static List<String> getWeaponsTypes(){
        List<String> types = new ArrayList<>();
        for (WeaponType type : WeaponType.values()) {
            types.add("Tipo: " + type.getType().toUpperCase() + " -> fuerza: +" + type.getScore());
        }
        return types;
    }
}
