package com.descortes.struggle.dataentry;

import com.descortes.struggle.enums.CharacterType;
import com.descortes.struggle.enums.StageType;
import com.descortes.struggle.enums.WeaponType;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class LoadFeatures {

    public CharacterType setCharacterType() {
        char op;
        do{
            op = EntryOutpout.readChar(
                    "Elegir Personaje\n\n"
                            + "[1] Humano\n"
                            + "[2] Vampiro\n"
                            + "[3] Lobo\n");
        }while(op < '1' || op > '3');
        switch(op){
            case '1':
                return CharacterType.HUMANO;
            case '2':
                return CharacterType.VAMPIRO;
            case '3':
                return CharacterType.LOBO;
        }
        return null;
    }

    public WeaponType setWeaponType() {
        char op;
        do{
            op = EntryOutpout.readChar(
                    "Elegir Arma\n\n"
                            + "[1] Mano\n"
                            + "[2] Cuchillo\n"
                            + "[3] Espada\n");
        }while(op < '1' || op > '3');
        switch(op){
            case '1':
                return WeaponType.MANO;
            case '2':
                return WeaponType.CUCHILLO;
            case '3':
                return WeaponType.ESPADA;
        }
        return null;
    }

    public StageType getStageType() {
        char op;
        do{
            op = EntryOutpout.readChar(
                    "Elegir Escenario\n\n"
                            + "[1] Estadio\n"
                            + "[2] Noche\n"
                            + "[3] Lluvia\n"
                            + "[4] Bosque\n"
                            + "[5] Ciudad\n"
                            + "[6] Aleatorio\n");
        }while(op < '1' || op > '6');
        switch(op){
            case '1':
                return StageType.ESTADIO;
            case '2':
                return StageType.NOCHE;
            case '3':
                return StageType.LLUVIA;
            case '4':
                return StageType.BOSQUE;
            case '5':
                return StageType.CIUDAD;
            case '6':
                return ramdomStage();
        }
        return null;
    }

    private StageType ramdomStage(){
        int currentElement = ThreadLocalRandom.current().nextInt(1, 5);
        List<StageType> stageTypeList = Arrays.asList(StageType.values());
        return stageTypeList.get(currentElement);
    }
}
