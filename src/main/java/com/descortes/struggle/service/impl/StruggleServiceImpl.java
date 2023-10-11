package com.descortes.struggle.service.impl;

import com.descortes.struggle.StruggleApp;
import com.descortes.struggle.dataentry.EntryOutpout;
import com.descortes.struggle.dataentry.LoadFeatures;
import com.descortes.struggle.enums.CharacterType;
import com.descortes.struggle.enums.StageType;
import com.descortes.struggle.enums.WeaponType;
import com.descortes.struggle.factory.CharacterFactory;
import com.descortes.struggle.model.Character;
import com.descortes.struggle.service.StruggleService;

import javax.xml.stream.events.Characters;
import java.util.Arrays;

public class StruggleServiceImpl implements StruggleService {

    private final CharacterFactory characterFactory = new CharacterFactory();
    private final LoadFeatures loadFeatures = new LoadFeatures();

    @Override
    public void pedirDatos(){

        EntryOutpout.showString("Personaje 1");
        Character character1 = characterFactory.getCharacter();
        EntryOutpout.showString("Personaje 2");
        Character character2 = characterFactory.getCharacter();
        EntryOutpout.showString("Elegir Escenario");
        StageType stageType = loadFeatures.getStageType();

        StruggleApp.run(stageType.name(), character1.getCharacterType().name(), character1.getWeaponType().name(),
                character2.getCharacterType().name(), character2.getWeaponType().name());

    }
    @Override
    public String enfrentar(String estadio, String humano1, String espada1, String humano2, String espada2) {
        int scorePersonaje1 = calculateScore(humano1, espada1, estadio);
        if (scorePersonaje1 < 0) return "error: escenario desconocido";
        int scorePersonaje2 = calculateScore(humano2,espada2, estadio);
        if (scorePersonaje1 > scorePersonaje2) {
            String resultado = "Resultado: gana 1";
            EntryOutpout.showString(resultado);
            return resultado;
        } else if (scorePersonaje2 > scorePersonaje1) {
            String resultado = "Resultado: gana 2";
            EntryOutpout.showString(resultado);
            return resultado;
        } else {
            String resultado = "Resultado: empate";
            EntryOutpout.showString(resultado);
            return resultado;
        }

    }

    private Integer calculateScore(String personaje, String arma, String estadio) {
        CharacterType characterType = CharacterType.valueOf(personaje.toUpperCase());
        WeaponType weaponType = WeaponType.valueOf(arma.toUpperCase());
        int stageScore = getStageScore(estadio, characterType);
        if (stageScore < 0) return stageScore;
        int characterScore = characterType.getScore();
        if (WeaponType.ESPADA.equals(weaponType)) {
            characterScore *= 2;
        } else {
            characterScore += weaponType.getScore();
        }

        return characterScore + stageScore;
    }

    public int getStageScore(String stage, CharacterType character) {
        stage = stage.toUpperCase();
        if (!StageType.isValidStage(stage)) {
            return -1;
        }
        switch (stage) {
            case "NOCHE" : if (CharacterType.VAMPIRO.equals(character)) return character.getScore() * 2;
                break;
            case "LLUVIA" : if (CharacterType.VAMPIRO.equals(character)) return character.getScore() - 1;
                break;
            case "BOSQUE" : if (CharacterType.LOBO.equals(character)) return character.getScore() * 3;
                break;
            case "CIUDAD" : if (CharacterType.HUMANO.equals(character)) return character.getScore() * 2;
                break;
        }

        return 0;
    }

}
