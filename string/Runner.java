package javabootcamp.oop.string;

import java.util.Random;
import java.util.Scanner;

import javabootcamp.oop.player.Player;

public class Runner {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String sentence, word;
		int chosen;

		printMenu();
		chosen = scanner.nextInt();

		do {
			switch (chosen) {
			case 1: {
			}
			case 2: {
				word = getUserInput("Please enter a word: ");
				isPalindrom(word);
				break;
			}
			case 3: {
				sentence = getUserInput("Please enter a sentence: ");
				word = getUserInput("Please enter a word: ");
				sentence = removeWordFromSentence(word, sentence);
				System.out.println(sentence);
				break;
			}
			case 4: {
				sentence = getUserInput("Please enter a sentence: ");
				sentence = capitalizeTheBeginningOfEachWord(sentence);
				System.out.println(sentence);
				break;
			}
			case 5: {
			}
			case 6: {

			}
			}
			printMenu();
			chosen = scanner.nextInt();

		} while (chosen != 7);

		// Class Player exercise
//		Random rand = new Random();
//		int randPlayer, randAction;
//		Player player;
//		Player player1 = new Player();
//		Player player2 = new Player();
//
//		player1.printPlayer();
//		player2.printPlayer();
//
//		for (int i = 0; i < 3; i++) {
//			randPlayer = rand.nextInt(2) + 1;
//			randAction = rand.nextInt(2) + 1;
//
//			if (randPlayer == 1) // Player 1
//				player = player1;
//			else // Player 2
//				player = player2;
//
//			if (randAction == 1) // eatBonus()
//				player.eatBonus();
//			else // hitObstacle()
//				player.hitObstacle();
//
//			player1.printPlayer();
//			player2.printPlayer();
//		}
//
//		System.out.println("Number of players: " + Player.numOfPlayers);
//		System.out.println("Total points: " + Player.totalPoints);

		scanner.close();
	}

	public static void isPalindrom(String word) {
		String reversed = "", tmp, res;
		tmp = word;

		for (int i = tmp.length() - 1; i >= 0; i--) {
			reversed += tmp.charAt(i);
			tmp = tmp.substring(0, i);
		}

		word = word.toLowerCase();
		reversed = reversed.toLowerCase();

		res = word.equals(reversed) ? "Palindrom" : "Not palindrom";
		System.out.println(res);
	}

	public static String capitalizeTheBeginningOfEachWord(String sentence) {
		sentence = (sentence.charAt(0) + "").toUpperCase() + sentence.substring(1);
		for (int i = 1; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				sentence = sentence.substring(0, i + 1) + (sentence.charAt(++i) + "").toUpperCase()
						+ sentence.substring(i + 1);
			}
		}
		return sentence;
	}

	public static String removeWordFromSentence(String word, String sentence) {
		if (sentence.contains(word))
			sentence = sentence.replace(word, "");
		if (sentence.charAt(0) == ' ')
			sentence = sentence.substring(1);

		return sentence;
	}

	public static String getUserInput(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}

	public static void printMenu() {
		String menuText = "Please enter the number of your selection from the following options:\r\n";
		menuText += "1. Enter 2 sentences and I’ll tell you if one is the other written backwards:\r\n";
		menuText += "2. Enter a word and I’ll tell you if it is a palindrome.\r\n";
		menuText += "3. Enter a sentence and a word and I’ll remove that word from anywhere in the sentence for you.\r\n";
		menuText += "4. Enter a sentence and I’ll capitalize the beginning of each word in it.\r\n";
		menuText += "5. Enter a sentence and 2 words and I’ll replace that first word with the second from everywhere in the sentence for you.\r\n";
		menuText += "6. Enter a sentence and a letter and I’ll print all the words that start with that letter.\r\n";
		menuText += "7. Exit.\r\n";
		System.out.println(menuText);
	}
}
