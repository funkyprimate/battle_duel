package com.revature.entities;

import java.util.Random;

public class Hero extends Combatant implements Healer, Attacker {
	private String name;
	private Integer maxHealth;
	private Integer health;
	private Integer strength;
	private String specialPower;
	
	public Hero() {
		name = "Hero";
		maxHealth = 100;
		health = 100;
		strength = 20;
		specialPower = "Fireball";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getMaxHealth() {
		return maxHealth;
	}
	
	public void setMaxHealth(Integer maxHealth) {
		this.maxHealth = maxHealth;
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
	
	public String getSpecialPower() {
		return specialPower;
	}

	public void setSpecialPower(String specialPower) {
		this.specialPower = specialPower;
	}
	
	public void heal() {
		// TODO
	}

	@Override
	public Integer attack() {
		// TODO
	}

	@Override
	public void getAttacked(Integer atkStrength) {
		// TODO
	}
	
	@Override
	public Integer specialAttack() {
		// TODO
	}
	
	@Override
	public String toString() {
		return "Hero [name=" + name + ", maxHealth=" + maxHealth + ", health=" + health + ", strength=" + strength
				+ "]";
	}
	
}
