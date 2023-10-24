package com.main;

import com.model.Character;
import com.model.Medicine;
import com.model.Palace;
import com.model.Persona;
import com.model.Weapon;

public class Main {

	public static void main(String[] args) {
		// CHARACTERS
		Character Joker = new Character("Ren", "Amamiya", 17);
		Character Violet = new Character("Sumire", "Yoshizawa", 16);
		Character Queen = new Character("Makoto", "Nijima", 18);
		Character Mona = new Character("Morgana", null, 1);

		// PERSONAE
		Persona Arsene = new Persona("Arséne", "Fool");
		Persona Cinderella = new Persona("Cinderella", "Faith");
		Persona Johanna = new Persona("Johanna", "Papesse");
		Persona Zorro = new Persona("Zorro", "Magician");

		// PALACES
		Palace Kamoshida = new Palace("Kamoshida", "Shujin Academy", "Castle");
		Palace Sae = new Palace("Sae Nijima", "Corthouse", "Casinò");
		Palace Maruki = new Palace("Maruki", "Stadium", "Reflection");

		// the rest...
		Weapon ArseneCane = new Weapon("Arséne's Cane", "Blade", 160, 99);

		Medicine Caffe = new Medicine("Caffè", "Cures 20 SP");

	}
}
