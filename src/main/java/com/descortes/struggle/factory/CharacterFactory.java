package com.descortes.struggle.factory;

import com.descortes.struggle.dataentry.LoadFeatures;
import com.descortes.struggle.model.Character;

public class CharacterFactory {

    private final LoadFeatures loadFeatures = new LoadFeatures();

    public Character getCharacter() {
        return buildCharacter();
    }

    private Character buildCharacter(){
        Character character = new Character();
        character.setCharacterType(loadFeatures.setCharacterType());
        character.setWeaponType(loadFeatures.setWeaponType());

        return character;
    }

}
