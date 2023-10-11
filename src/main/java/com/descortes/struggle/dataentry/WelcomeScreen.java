package com.descortes.struggle.dataentry;

import com.descortes.struggle.enums.CharacterType;
import com.descortes.struggle.enums.StageType;
import com.descortes.struggle.enums.WeaponType;
import com.descortes.struggle.service.impl.StruggleServiceImpl;

import java.util.Arrays;

public class WelcomeScreen {

    StruggleServiceImpl struggleService = new StruggleServiceImpl();

    public boolean execute() {

        boolean run = true;
        char op;
        do{
            op = EntryOutpout.readChar(
                    "BIENVENIDO - STRUGGLE GAME\n\n"
                            + "[1] Enfrentar\n"
                            + "[2] Personajes specs\n"
                            + "[3] Armas specs\n"
                            + "[4] Escenarios\n"
                            + "[5] SALIR del juego\n");
        }while(op < '1' || op > '5');
        switch(op){
            case '1':
                struggleService.pedirDatos();
                break;
            case '2':
                EntryOutpout.showString(CharacterType.getCharacterTypes().toString());
                break;
            case '3':
                EntryOutpout.showString(WeaponType.getWeaponsTypes().toString());
                break;
            case '4':
                EntryOutpout.showString(Arrays.toString(StageType.values()));
                break;
            case '5':
                run = false;
        }

        return run;
    }

}
