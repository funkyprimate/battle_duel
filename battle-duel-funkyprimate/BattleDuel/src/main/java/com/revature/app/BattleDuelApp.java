package com.revature.app;

import java.util.Scanner;

import com.revature.entities.Enemy;
import com.revature.entities.Hero;

public class BattleDuelApp {
	public static Scanner scan;
	
	public static void main(String[] args) {
		// the scanner is what allows you to take input from the user
		scan = new Scanner(System.in);
		
		System.out.println("Welcome to Battle Duel!");
		
		boolean userWantsToPlay = true;
		
		while (userWantsToPlay) {
			userWantsToPlay = turnLoop();
		}
		
		System.out.println("Thanks for playing!");
		scan.close();
	}
	
	public static Hero setHero() {
		Hero hero = new Hero();
		boolean heroSet = false;
		
		while (!heroSet) {
			System.out.println("Create your hero:");
			System.out.println("Name: ");
			hero.setName(scan.nextLine());
			System.out.println("Health: ");
			hero.setMaxHealth(Integer.valueOf(scan.nextLine()));
			hero.setHealth(hero.getMaxHealth());
			System.out.println("Strength: ");
			hero.setStrength(Integer.valueOf(scan.nextLine()));
			System.out.println("Hero name: " + hero.getName() + ", health: "
					+ hero.getMaxHealth() + ", strength: " + hero.getStrength());
			System.out.println("Is this okay? Enter Y for yes, anything else for no");
			String choice = scan.nextLine();
			if (choice.equals("Y") || choice.equals("y")) {
				heroSet = true;
			}
		}
		System.out.println(hero);
		return hero;
	}
	
	public static boolean turnLoop() {
		// the setHero method has the user set their hero and then returns
		// the created hero
		Hero hero = setHero();
		System.out.println("Confirmed.");
		Enemy enemy = new Enemy();
		// TODO: set the enemy's values
		System.out.println("hold on, you didn't set up this part of the code yet - look for \"TODO: set the enemy's values\"");
		System.out.println("Enemy health: " + enemy.getHealth() + 
							", enemy strength: " + enemy.getStrength());
				
		boolean gameOver = false;
		
		turnLoop: while (!gameOver) {
			System.out.println("------------------");
			switch (playerTurn()) {
				case 1: // Attack
					System.out.println("------------------");
					System.out.println("You attack!");
					int atk = hero.attack();
					enemy.getAttacked(atk);
					System.out.println("Enemy took " + atk + " damage.");
					System.out.println("Enemy health: " + enemy.getHealth());
					break;
				case 2: // Heal
					System.out.println("------------------");
					System.out.println("You heal!");
					int health = hero.getHealth();
					hero.heal();
					System.out.println("You healed " + 
						(hero.getHealth() - health) + " health.");
					System.out.println("Your health: " + hero.getHealth());
					break;
				default:
					System.out.println("You didn't choose anything.");
					continue turnLoop;
			}
			if (enemy.getHealth() == 0) {
				System.out.println("You defeated the enemy!");
				System.out.println("------------------");
				System.out.println(hero.getName() + " wins!");
				System.out.println("------------------");
				gameOver = true;
			} else {
				enemyTurn();
				int atk = enemy.attack();
				hero.getAttacked(atk);
				System.out.println("You took " + atk + " damage.");
				System.out.println("Your health: " + hero.getHealth());
				if (hero.getHealth() == 0) {
					System.out.println("You were defeated!");
					System.out.println("------------------");
					System.out.println("Enemy wins!");
					System.out.println("------------------");
					gameOver = true;
				}
			}
			if (gameOver) {
				System.out.println("Play again? Enter Y for yes, anything else for no");
				String choice = scan.nextLine();
				if (choice.equals("Y") || choice.equals("y")) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static int playerTurn() {
		System.out.println("Your turn");
		System.out.println("Choose your move: ");
		System.out.println("1. Attack");
		System.out.println("2. Heal");
		return (Integer.valueOf(scan.nextLine()));
	}

	public static void enemyTurn() {
		System.out.println("------------------");
		System.out.println("Enemy turn");
		System.out.println("------------------");
		System.out.println("Enemy attacks!");
	}
}
