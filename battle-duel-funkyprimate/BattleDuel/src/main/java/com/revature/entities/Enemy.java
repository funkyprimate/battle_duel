package com.revature.entities;

import java.util.Random;

public class Enemy extends Combatant {
	private Integer health;
	private Integer strength;
	
	public Enemy() {
		health = 100;
		strength = 20;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	@Override
	public Integer attack() {
		// TODO
	}

	@Override
	public void getAttacked(Integer atkStrength) {
		// TODO
	}

}
