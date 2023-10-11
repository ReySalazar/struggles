package com.descortes.struggle.model;

import com.descortes.struggle.enums.CharacterType;
import com.descortes.struggle.enums.WeaponType;

public class Character {

    private CharacterType characterType;
    private WeaponType weaponType;

    public Character() {
    }

    public Character(CharacterType characterType, WeaponType weaponType) {
        this.characterType = characterType;
        this.weaponType = weaponType;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
