package javabootcamp.oop.player;

import java.util.Random;

public class Player {
	public static int totalPoints;
	public static int numOfPlayers;

	private final int BONUS_POINTS_100 = 100;
	private final int BONUS_POINTS_150 = 150;
	private final int OBSTACLE_POINTS_100 = 100;
	private final int OBSTACLE_POINTS_200 = 200;
	private int points;
	private int lives;
	private Random rand = new Random();

	static {
		totalPoints = 0;
		numOfPlayers = 1;
	}

	public Player() {
		this.points = 0;
		this.lives = 3;
		numOfPlayers++;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	private void setLives(int lives) {
		if (lives == 0) {
			numOfPlayers--;
		}
		this.lives = lives;
	}

	private int getPoints() {
		return points;
	}

	private int getLives() {
		return lives;
	}

	public void eatBonus() {
		int randBonusPonits = rand.nextBoolean() ? BONUS_POINTS_100 : BONUS_POINTS_150;
		addPoints(randBonusPonits);
	}

	public void hitObstacle() {
		int randObstaclePonits = rand.nextBoolean() ? OBSTACLE_POINTS_100 : OBSTACLE_POINTS_200;
		subtractPoints(randObstaclePonits);
	}

	private void addPoints(int numOfPoints) {
		setPoints(getPoints() + numOfPoints);
		totalPoints += numOfPoints;

		if (numOfPoints > 150)
			setLives(getLives() + 1);
	}

	private void subtractPoints(int numOfPoints) {
		setPoints(getPoints() - numOfPoints);
		totalPoints -= numOfPoints;

		if (numOfPoints > 100)
			setLives(getLives() - 1);
	}
	
	public void printPlayer() {
		System.out.printf("Lives: %d, Points: %d\n", lives, points);
	}
}
