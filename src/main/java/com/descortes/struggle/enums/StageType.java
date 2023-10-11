package com.descortes.struggle.enums;

import java.util.Arrays;

public enum StageType {
    ESTADIO,
    NOCHE,
    LLUVIA,
    BOSQUE,
    CIUDAD;

    public static boolean isValidStage(String nombre) {
        return Arrays.stream(StageType.values())
                .anyMatch(stage -> stage.name().equalsIgnoreCase(nombre));
    }

}
