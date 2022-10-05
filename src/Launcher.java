import java.util.*;

public class Launcher {

	public static void main(String[] args) {
		// Titan tester = new Titan("Brandon");
		Item item = new Item("", 0);
		Item[][] inventory = { { item, item, item, item, item }, { item, item, item, item, item },
				{ item, item, item, item, item }, { item, item, item, item, item } };
		Character player = characterCreation(inventory);
		HealthPotion health = new HealthPotion("HealthPotion", 1000);
		// AttackPotion attack = new AttackPotion("AttackPotion", 100);
		Weapon death = new Weapon("Admin Weapon", 666);
		addItemToInventory(inventory, death, player);
		addItemToInventory(inventory, health, player);
		// addItemToInventory(inventory, attack,player);
		advent(4, player, inventory);

		// RPG(101, tester, inventory);
	}

	public static Character characterCreation(Item[][] inventory) {
		Character end = new Character("ringo");
		Scanner reader = new Scanner(System.in);
		String name = "";
		int counter = 0;
		int number_holder = 0;
		boolean checker = false;

		// SimpleAudioPlayer audioPlayer = new
		// SimpleAudioPlayer("C:\\Codename_Game\\Main_Game\\Personality Test Mystery
		// Dungeon.wav");
		// audioPlayer.play();
		text_manager(400, ".....");
		text_manager(5000);
		text_manager(65, "Welcome!");
		text_manager(2000);
		text_manager(65, "Before you start on your wonderful adventure,");
		text_manager(2000);
		text_manager(65, "You need to answer a few questions.");
		text_manager(2000);
		text_manager(65, "Are you ready?");
		text_manager(4000);
		// audioPlayer.setMusic("C:\\Codename_Game\\Main_Game\\009 - Guildmaster
		// Wigglytuff - (Pok�monMystery Dungeon - Explorers of Sky).wav");
		// audioPlayer.play();
		text_manager(65, "The better question is, who cares if you're ready!?");
		text_manager(1000);
		System.out.println("Let the questions begin!");
		text_manager(1000);
		text_manager(65, "You find it difficult to introduce yourself to other people.");
		System.out.println("1. Yes, most definitely.");
		System.out.println("3. Depends on the scenario.");
		System.out.println("5. No, I usually do well regardless.");
		System.out.println("Enter 1, 3, or 5: ");
		while (checker == false) {
			number_holder = reader.nextInt();
			if (number_holder == 1 || number_holder == 3 || number_holder == 5) {
				checker = true;
			} else {
				System.out.println("Enter 1, 3, or 5: ");

			}
		}
		counter = counter + number_holder;
		text_manager(65, "Great! Ok question 2:");
		text_manager(65, "You find that you are superior to others.");
		System.out.println("1. No I think everyone is equal in all aspects.");
		System.out.println("3. I'm definitely better than some people, however, I woudln't say I'm the best.");
		System.out.println("5. Yeah, I'm the greatest!");
		System.out.println("Enter 1, 3, or 5: ");
		checker = false;
		while (checker == false) {
			number_holder = reader.nextInt();
			if (number_holder == 1 || number_holder == 3 || number_holder == 5) {
				checker = true;
			} else {
				System.out.println("Enter 1, 3, or 5: ");

			}
		}
		counter = counter + number_holder;
		text_manager(65, "Ooh, Interesting. Question 3!");
		text_manager(65, "You are usually highly motivated and energetic.");
		System.out.println("1. No, I'd say I keep to myself more often than not.");
		// check comma usage on this one
		System.out.println("3. Depends on the day. Sometimes I energetic, other days, not so much.");
		System.out.println("5. Dude, I'm always energetic!");
		System.out.println("Enter 1, 3, or 5: ");
		checker = false;
		while (checker == false) {
			number_holder = reader.nextInt();
			if (number_holder == 1 || number_holder == 3 || number_holder == 5) {
				checker = true;
			} else {
				System.out.println("Enter 1, 3, or 5: ");
			}
		}
		counter = counter + number_holder;
		text_manager(65, "Ok ok. Question 4:");
		text_manager(65, "You rarely worry about how your actions affect other people.");
		System.out.println("1. No, whatever happens happens.");
		System.out.println("3. More or less. Really depends on the person.");
		System.out.println("5. I'm always checking to make sure I don't step on anybodies toes.");
		System.out.println("Enter 1, 3, or 5: ");
		checker = false;
		while (checker == false) {
			number_holder = reader.nextInt();
			if (number_holder == 1 || number_holder == 3 || number_holder == 5) {
				checker = true;
			} else {
				System.out.println("Enter 1, 3, or 5: ");
			}
		}
		counter = counter + number_holder;
		text_manager(65, "Hmm... Alright. Last question!");
		text_manager(65, "An interesting book or a video game is often better than a social event.");
		System.out.println("1. I'll go play the video game.");
		System.out.println("3. What's the name of the game and the event?");
		System.out.println("5. I'll go to the social event.");
		checker = false;
		while (checker == false) {
			number_holder = reader.nextInt();
			if (number_holder == 1 || number_holder == 3 || number_holder == 5) {
				checker = true;
			} else {
				System.out.println("Enter 1, 3, or 5: ");
			}
		}
		counter = counter + number_holder;
		text_manager(65, "Alright. One more thing, what is your name?");
		// This does not take output for some reason, check in with Mr Joyal.
		while (name.equals("")) {
			name = reader.nextLine();
		}
		if (counter >= 5 && counter <= 11) {
			Titan user_character = new Titan(name);
			user_character.setName(name);
			text_manager(65, "Congratulations " + user_character.getName() + "\nYou are a Titan!");
			text_manager(65, "Titans are known for their defense and being intellectual fighters.");
			// reader.close();
			// audioPlayer.stop();
			return user_character;
		}
		if (counter >= 19 && counter <= 25) {
			Rogue user_character = new Rogue(name);
			user_character.setName(name);
			text_manager(65, "Congratulations " + user_character.getName() + "\nYou are a Rogue!");
			text_manager(65, "Rogues are known for using their speed and quickness to get the job done.");
			// reader.close();
			// audioPlayer.stop();
			return user_character;
		}
		if (counter >= 12 && counter <= 18) {
			Brawler user_character = new Brawler(name);
			user_character.setName(name);
			text_manager(65, "Congratulations " + user_character.getName() + "\nYou are a Brawler!");
			text_manager(65, "Brawlers are known for their power and overall abilities.");
			// reader.close();
			// audioPlayer.stop();
			return user_character;

		}

		// reader.close();
		return end;
	}

	// Method that stops for the program for a certain
	// amount of time. Note: does not stop all operations
	// on the computer. Just waits for a certain amount
	// of time
	public static void text_manager(int num_manager) {
		// note, time is measured in milliseconds. 1000
		// milliseconds equals 1 second.
		long startTime = System.currentTimeMillis();
		long newTime = startTime;
		// Prints out start time
		// Will give an effect of creepiness because it is a
		// random assortment of numbers to the user. However,
		// it is actually the time the computer keeps track of.
		// System.out.println(startTime);
		while (newTime < startTime + num_manager) {
			newTime = System.currentTimeMillis();
		}
	}

	// Method that helps display text on the screen as if it's playing
	// in a video game.
	public static void text_manager(int num, String sentence) {
		// speed I generally like to use is 65. 70 works too.
		long startTime = System.currentTimeMillis();
		long newTime = startTime;
		for (int i = 0; i < sentence.length(); i++) {
			System.out.print(sentence.charAt(i));
			startTime = System.currentTimeMillis();
			while (newTime < startTime + num) {
				newTime = System.currentTimeMillis();
			}
		}
		System.out.println();

	}

	/////////////////////////////////////////////////////////////////////////////////

	public static void advent(int num, Character player, Item[][] inventory) {
		// num is adventure stage you are on
		AttackPotion attackPo = new AttackPotion("Attack Potion", 5);
		Scanner in = new Scanner(System.in);
		String str = "";
		String jk = "";
		int input = 0;
		if (num == 1) {

			text_manager(65, "\"Welcome to Crystal Cave!\"");
			text_manager(3000);
			text_manager(65, "\"My name is Alex, and I am one of the coders for this thing you are playing!\"");
			text_manager(65, "\"But I like to think my official title is writer of the game.\" ");
			text_manager(3000);
			text_manager(65, "\"To beat the game, you have to beat all three bosses, then you win!\" ");
			text_manager(3000);
			text_manager(65, "\"Simple enough, right? Ok. Also you need a weapon!\"");

			text_manager(65,
					"\"Let me see here..... I have a sword, bow and arrow, or some knives. Which one do you prefer?\" ");
			text_manager(1000);
			System.out.println("1. Sword");
			System.out.println("2. Bow and Arrows");
			System.out.println("3. Knives");
			input = in.nextInt();
			if (input == 1) {
				Weapon one = new Weapon("Sword", 9);
				addItemToInventory(inventory, one, player);
				player.setPlayerWeapon(one);
			}
			if (input == 2) {
				Weapon one = new Weapon("Bow", 8);
				addItemToInventory(inventory, one, player);
				player.setPlayerWeapon(one);
			}
			if (input == 3) {
				Weapon one = new Weapon("Knives", 10);
				addItemToInventory(inventory, one, player);
				player.setPlayerWeapon(one);
			}
			text_manager(65, "\"Oh ok, you choose the " + player.getPlayerWeapon().getName() + ". Good choice!\"");
			text_manager(3000);
			text_manager(65, "\"Anyway, in order to face me, you need to defeat some-\"");

			System.out.println("\"ROAR!\"");
			text_manager(3000);
			text_manager(65, "\"Enemies.\"");
			text_manager(3000);
			text_manager(65, "\"Anyway, I gotta go, gotta prepare for our fight, have fun!\"");
			text_manager(65, "....");
			text_manager(1000);
			text_manager(65, "....");
			text_manager(1000);
			text_manager(65, "....");
			text_manager(1000);
			text_manager(65, "A crystal pops out from in the ground, what do you do?");
			System.out.println("1. Go to the left of it \n2. Go to the right of it \n3. Break it with your "
					+ player.getPlayerWeapon().getName() + " \n4. Jump over it ");
			input = in.nextInt();
			if (input == 1) {
				// nothing
			}
			if (input == 2) {
				// nothing
			}
			if (input == 3) {
				HealthPotion soul = new HealthPotion("Healthy Brew", 15);
				text_manager(65, "You found a potion!");
				addItemToInventory(inventory, soul, player);

			}
			if (input == 4) {
				text_manager(65, "You took two damage trying to get over the crystal");
				player.removeHealth(2);
				urDead(1, player, inventory);
			}
			text_manager(65, "You are at a crossroad, you must go left or right, where do you go?");
			System.out.println("1. Go to the left of it \n2. Go to the right of it");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "You continue left done a downard sloping incline.");
				text_manager(65, "At the bottom you see a cracked hole in the wall with a strange glow.");
				text_manager(65, "You squeeze through the crack and look inside.");
				text_manager(65, "That was a mistake...");
				text_manager(65, "You are cornered by a giant wolf mother. \nWill you be victorious?");
				RPG(1, player, inventory);
			}
			if (input == 2) {
				text_manager(65, "You drag your hand along the cave wall as you continue forward.");
				text_manager(65, "Your hear a snap.");
				text_manager(65, "You turn your head and a giant wolf mother towers over you with it's jaws open.");
				text_manager(65, "Will you be victorious?");
				RPG(1, player, inventory);
			}
			advent(2, player, inventory);
		}
		if (num == 2) {
			text_manager(65, "You remove your " + player.getPlayerWeapon().getName()
					+ " from the enemy's corpse and continue on through the cave system.");
			text_manager(65, "...");
			text_manager(65, "...");
			text_manager(2000);
			text_manager(65, "You find a sauna cave, you decide to take a stop. It feels nice and warm.");
			text_manager(65, "Your health increases by 10");
			player.addHealth(10);

			text_manager(65, "After you gather your supplies you see a crystal to your right, you look at it.");
			text_manager(65,
					"It is a sky blue, you feel it, and it changes color, it now grass green, would you like to change it again?");
			System.out.println("1. Yes \n2. No");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "The crystal turns red, and a potion falls from the ground.");
				AttackPotion att = new AttackPotion("Blood Potion", 5);
				addItemToInventory(inventory, att, player);
			}
			if (input == 2) {
				text_manager(65, "You decide to move along.");
			}
			text_manager(65, "You go past the crystal and smoke fills the room.");
			text_manager(2000);
			text_manager(65, "You decide to ready your weapon.");
			// (Rogue Lion att 8 health 12)
			text_manager(65, "The smoke clears.");
			text_manager(65, "\"So you made it this far huh?\"");
			text_manager(65, "\"Well I'll make sure you don't go any further.... prepare yourself!\"");
			RPG(2, player, inventory);
			advent(3, player, inventory);
		}
		if (num == 3) {
			text_manager(65, "\"You beat me fair and square... you may pass.\"");
			text_manager(65, "You leave the Lion behind as you spare his life.");
			text_manager(65, "Many crystals block your path, where do you want to go?");
			// choice doesn't matter
			System.out.println("1. Left \n2. Right");
			input = in.nextInt();
			if (input == 1) {
				// nothing
			}
			if (input == 2) {
				// nothing
			}
			text_manager(65, "A deep lake blocks your path, what do you want to do?");
			System.out.println("1. Go around it \n2. Go through it");
			input = in.nextInt();
			if (input == 1) {
				// nothing
			}
			if (input == 2) {
				text_manager(65, "You found an old chest plate while you were walking in the lake!");
				Armor art = new Armor("Dead's Man's Plate", 15);
				addItemToInventory(inventory, art, player);
				text_manager(65, "You rip the armor off a skeleton and put it on.");
				player.setPlayerArmor(art);
				text_manager(3000);
			}

			text_manager(65, "You decided to move along.");

			// same sauna scene but full health
			text_manager(65, "\"So you finally reached me huh?\" "
					+ "\n\"Alright, I haven't fought in a while, but, no time like the present right?\"");
			text_manager(65,
					"Alex raises from a crystal throne, the throne is glistening, each crystal changing colors every second. "
							+ "\nHe raises his hand and a pencil arises from it. The pencil then grows to the length of a sword. ");
			text_manager(65, "\"Ok, " + player.getName() + ", let's do this!\"");
			RPG(3, player, inventory);
			advent(4, player, inventory);
		}
		if (num == 4) {
			text_manager(65, "\"So I lost huh? It's all good\"."
					+ "\n\"Anyway, you'll be facing two of the other developers' bosses of this game. I won't give you any spoilers but they're....\" \n\"interesting to say the very least."
					+ "\nBut don't let them know I said that. "
					+ "\nAlso, a word of advice kid, on this journey... stay true to yourself and don't let anyone change your choices,\n you�re the only person who knows which path they want to take. "
					+ "\nEnough waiting though, off to the next stage!\"");
			text_manager(65, "Alex waves his hand as the cave wall crumble around you. The fizz, hiss, and splatter.");
			text_manager(65, "You open your eyes to realize that Alex is gone, along with the rest of the cave.");
			text_manager(65, "Instead, you are standing in the middle of nowhere next to an abandoned gas station.");
			text_manager(65, "Do you enter the gas station?");
			text_manager(65, "1. Yes\n2. No");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "You push open the old creaky door to the gas station.");
				text_manager(65, "It's covered in cob webs.");
				text_manager(65, "You look around and see a rack of armor near the cash register.");
				text_manager(65, "Do you go for it?");
				text_manager(65, "1. Yea, duh!\n2. Not in this lifetime");
				input = in.nextInt();
				if (input == 1) {
					text_manager(65, "You push your way through the webs as you cross the room.");
					text_manager(65, "You accidentely trip over some useless junk and fall into a web!");
					text_manager(65, "You try to get up but you can't move...");
					text_manager(65, "\"Hello there deary, I think it's nearly lunch time? Care to join me?\"");
					text_manager(65, "You respond to the mysterious voice:");
					while (str.equals("")) {
						str = in.nextLine();
					}
					if (str.equals("no")) {
						text_manager(65, "\"But deary! Why would you want to miss out!\"");
						text_manager(65, "\"We are having freshly caught human!\"");
					} else {
						text_manager(65, "\"Well you are the guest of honor after all...\"");
						text_manager(2000);
						text_manager(65, "\"And also the final course....\"");
					}
					RPG(21, player, inventory);
					text_manager(65,
							"You thrust your " + player.getPlayerWeapon().getName() + " into the spider's abdonmen.");
					text_manager(65, "You crawl out of the web and over to the rack.");
					text_manager(65, "The rack has three pieces of armor that are all the same. ");
					text_manager(65, "You grab the first one you see, but before you put it on, you grab a sharpie");
					text_manager(65, "and write the name of the piece of armor on the side: ");
					str = "";
					while (str.equals("")) {
						str = in.nextLine();
					}
					Armor arm = new Armor(str, 20);
					addItemToInventory(inventory, arm, player);
					player.setPlayerArmor(arm);
					text_manager(65, "You put on your armor and exit the building.");

				}

			}
			if (input == 2) {
				text_manager(65,
						"You remember how tired you are from your travels and you decide it's probably for the best.");
				text_manager(65, "You continue down the endless hot road, questioning your existance.");
			}
			advent(5, player, inventory);
		}
		/////////////////////////////////////////

		if (num == 5) {
			text_manager(65,
					"So after everything that has happened, you continue on your adventure. \nWalking down a deserted road to nowhere. \nEventually you come across a traveling salesman who pulls up to you in his yellow Pinto.");
			text_manager(65, "\"Where're you heading in such a hurry?\"");
			str = in.nextLine();
			if (str.indexOf("home") >= 0)
				text_manager(65, "\"Well somebody must really like CCHS Theater productions...\"");
			text_manager(65, "\"" + str + "? Why it's early yet " + player.getName() + "!\"");
			text_manager(65, "You ask the strange salesman how he knew your name");
			text_manager(65, "\"I know lots of things about lots of people " + player.getName() + "\"");
			text_manager(65, "You feel that this guy is kinda creepy...you try to walk away");
			text_manager(65,
					"\"Alright let's skip the chit chat. I am no ordinary salesman. \nI am a salesman from the heavens! \nAnd I am here to offer you a deal you cannot refuse!\"");
			text_manager(65, "Curiously, you continue to listen");
			text_manager(65,
					"\"I have here with me a contract. Simply by signing below, you can become immortal! \nIsn't that amazing!! So, shall we proceed with the signature?\"");
			str = "";
			while (str.equals("")) {
				str = in.nextLine();
			}
			if (str.indexOf("no") >= 0) {
				text_manager(65,
						"\"What!? You think you can say no to me! Hah! Let me show you what happens when you refuse my offer!\"");
				RPG(666, player, inventory);
			} else {
				text_manager(65, "\"Excellent! Please sign your name below\"");
				str = in.nextLine();
				text_manager(65, "You are a little suspicious still, so you sign your name a lil differentely");
				text_manager(65, "\"Ok " + str + " Jr...you just made the biggest mistake of your life!\"");
			}
			text_manager(65, "\"My name is MF Stofoles, and prepare to die!\"");
			text_manager(65,
					"The salesman snaps his fingers and you feel your muscles instantly tighten. You can't even blink; you are completely frozen");
			text_manager(65,
					"\"What a shame...ya see. I have a buisness to run. And you decide it's ok to steal that buisness by playing this game!\"");
			text_manager(65, "I won't have it! So like how you killed my buisness, I, will, now, kill, YOU!");
			for (int i = 0; i < 50; i++) {
				text_manager(1,
						"66666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
			}
			advent(6, player, inventory);

		}
		if (num == 6) {
			text_manager(300, "loading...............");
			text_manager(65,
					"You slowly open your eyes as your body unstiffens from it's slumber.\nYou are dazed, confused and scared. You have no idea where you are.");
			text_manager(65,
					"With a dim red light coming in from the windows, you realize that you are laying in the middle of a wooden stage. ");
			text_manager(65, "You stand up.");
			text_manager(65, "You look around and decide to exlpore this place a bit...");
			text_manager(65,
					"1. Look in the utility closet\n2. Check the circuit breaker\n3. Curl up into a ball and cry");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65,
						"You walk over to the utility closet; it's locked. You try to pick it with a bobby pin.");
				if (chance(2)) {
					text_manager(65, "You pick the lock and inside a bucket you find a weird potion mixture");
					HealthPotion healthpotion = new HealthPotion("Toby's Special Mix", 15);
					addItemToInventory(inventory, healthpotion, player);
				} else {
					text_manager(65, "You remember you are a screw up, as the bobby pin snaps in half. Nice");
				}
			}
			if (input == 2) {
				text_manager(65,
						"You find the circuit breaker on the wall. You open it. \nYou mess with all the switches...but you ain't no electrician.");
				text_manager(65, "You accidentely push something you shouldn't have pushed an you get electricuited.");
				text_manager(65, "You lose one health");
				player.removeHealth(1);
				urDead(6, player, inventory);
			}
			if (input == 3) {
				text_manager(65, "Out of fear, you curl up and cry.");
			}

			text_manager(65, "You hear the sound of electricity, and promptly the spot lights on the stage turn on");
			text_manager(65,
					"You see a strange man under the lights, holding a swifter and a turkey sandwich. He takes a bite of it.");
			text_manager(65, "\"Who's there?!\"");
			text_manager(65, "1. Answer\n2. Don't Answer");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "You shout \"nobody!\"");
				text_manager(65, "\"Ahhh! Intruder!\"");
				text_manager(65, "He runs to the vintage phone sitting on his desk. He dials 666");
				text_manager(65, "\"666! Hi, there is nobody breaking into Persephone's Playhouse!\"");
				text_manager(65,
						"\"Wait listen! My name is Tobias C Barnes! \nI am the full time manager of Persephone's Playhouse! Nobody has broken in-damnit!\"");
			}
			if (input == 2) {
				text_manager(65, "You keep to the shadows and decide to keep quiet.");
			}
			text_manager(65, "\"I know you are there! Come out wherever you are! Come out and play!\"");
			text_manager(65, "\"There you are! This is what happens when you tussle with the muscle!\"");
			RPG(4, player, inventory);

		}
		if (num == 7) {
			Special_Item pen = new Special_Item("Toby's Lucky Pen", 71);
			text_manager(65,
					"As Toby lays lifeless on the creaky stage, you notice a pen that was in his ear fall out. \nIt rolls off his corpse and down stage to where you are standing.");
			addItemToInventory(inventory, pen, player);
			text_manager(65,
					"Curiously, you pick up the pen and stash it in your pocket. \nYou swear you could hear it buzz for a second but then you realize you must have just been imagining things...");
			text_manager(65,
					"You hear a screech and see some flashing red lights outside. It's probably time you leave.");
			text_manager(65,
					"You book it outside through the nearby backdoor and find yourself in a poorly lit ally. \nThe only light is the red light from...");
			text_manager(65, "You look around for where that red light came from. \nFinally you find it's source.");
			text_manager(65,
					"You look up into a blood red sky. \nYou hear a scream in the distantance. \nYou see winged creatures flying high above. \nAnd you smell something, something bad. ");
			text_manager(65, "The smell of death.");
			text_manager(65,
					"You know where you are. You've never been much of a believer in its existance but now you believe. \nFor you have entered the land of the dead, Hell.");
			text_manager(65, "Coincidentely you look to your right and see a \"Welcome To Hell\" sign...wow");
			text_manager(65,
					"You remember you should probably keep moving. The alley seemed well stocked with a variety of trash cans and dumpsters. \nLet's have a look!");
			text_manager(65,
					"1. Green Dumpster\n2. Blue Recycling Bin\n3. Brown Cardboard Boxes\n4. There ain't no way in hell I'm digging through garbage");
			input = in.nextInt();
			if (input == 1) {
				AttackPotion dump = new AttackPotion("Dumpster Mixture", -5);// lol
				text_manager(65,
						"You look through the green dumpster, and behind a rotten banana peel you find some weird potion.");
			}
			if (input == 2) {
				text_manager(65,
						"You look inside of the blue recycling bin. Inside a pizza box you find a modly falafel ball. Do you eat it?");
				str = "";
				while (str.equals("")) {
					str = in.nextLine();
				}

				if (str.equals("no")) {

				} else {
					text_manager(65, "Of course you would never pass down a snack! Yummm! You gain one health!");
					player.addHealth(1);
				}
			}
			if (input == 3) {
				text_manager(65, "You open up the box and find a dozen rats munching on some munchkins. Cool. ");

			}
			if (input == 4) {

				text_manager(65, "You realize that you aren't that desperate.");
			}

			text_manager(65, "Once again you hear a loud screech and decide it's time to go.");
			text_manager(65,
					"You grab your stuff and run out of the alley. \nYou run down a few twists and turns until you find yourself at a night club called Giggey's Get Down.");
			text_manager(65,
					"You hear the sound of some groovy music inside. \nYou peep through a little window and you see a full house filled with all types of lifeless people.\nYou could have sworn some guy looked like Napoleon, \nBut they were all listening to a woman on stage singing.");
			text_manager(65, "You lean closer to the window.....the music drawing you closer...");
			text_manager(65,
					"Out of your eye you see a big man with a slick suit eyeing you. He yells something to his body guards. ");
			text_manager(65,
					"You try to shake yourself out of your trance but before you know it, two meaty pairs of hands grab you and pull you into the club.");
			text_manager(65,
					"They drag you by your feet and toss you onto the floor. \nThe music stops and as you look up you see the man again, his suit looking like it was made out of the souls of the damned.");
			text_manager(65,
					"\"Nobody looks at my girl like that. Nobody. So gimme one one good reason I shouldn't kill you where you stand.\"");
			text_manager(65, "1. \"I'm Also A Singer Too!\"\n2. \"Uhhgh Hey Wanna Hear A Joke?\"");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "Really? Well, here's your second chance. Get up on that stage and impress me!");
				text_manager(65, "You get up on the stage and grab the mic as the woman walks off.");
				text_manager(65, "\"Sing me a song!\"");
				text_manager(65,
						"You grasp the mic as you start to sweat. You spew whatever song lyrics you can think of out of your mouth:");
				str = "";
				while (str.equals("")) {
					str = in.nextLine();
				}
				if (str.indexOf("Ringo") >= 0) {
					text_manager(65, "Hi Brandon!");
				}
				text_manager(65, "What the hell was that! That was atrocious! An obimination! AHHHHHHH!");
			}
			if (input == 2) {
				text_manager(65, "A fellow comedian eh? This better be the best joke of your life.");
				text_manager(65,
						"You start to sweat as you try to form a joke that doesn't involve a chicken crossing a road");
				text_manager(65, "You blurt out whatever comes to your head:");
				str = "";
				while (str.equals("")) {
					str = in.nextLine();
				}
				if (str.indexOf("Ringo") >= 0) {
					text_manager(65, "Hi Brandon!");
				}
				text_manager(65, "\"What the hell was that! That was atrocious! An obimination! AHHHHHHH!\"");
			}
			RPG(10, player, inventory);
			advent(8, player, inventory);
		}
		if (num == 8) {
			text_manager(65,
					"As the chaos of crowds cleared from the room, the lady who was singing earlier approaches you");
			text_manager(65,
					"\"Thank you so much! That man was just like my father. My physco-analyst says women always date men like their father,");
			text_manager(65,
					"But I think that's just stupid. I never knew my father. And I wish I never knew Curtis.\"");
			text_manager(65,
					"While you would love to stay and chat, you ask her about where you are and how to get back.");
			text_manager(65,
					"\"You're in hell baby! And it ain't easy getting out. In fact, I don't think you can...\"");
			text_manager(65, "You mention MF Stofoles.");
			text_manager(65,
					"\"Oh that rotten disgraceful reprobate! \nHe goes around the mortal world in search of souls to help them achieve their greatest dreams...\"");
			text_manager(65,
					"\"Of course, that doesn't happen. He ends up consuming your soul instead. \nBeing the Devil's right hand man it's not too suprising.\"");
			text_manager(65, "You ask her where you can find him");
			text_manager(65,
					"\"He precides over this part of hell in his penthouse in the Lucky 38 Casino. \nBe careful, that place has stollen more souls than Stofoles himself.\"");
			text_manager(65,
					"Here, take this to protect you. As thanks. It should protect you from the evils that have poisoned so many...\"");
			Special_Item thing = new Special_Item("Blue Fox Fur", 71);
			addItemToInventory(inventory, thing, player);
			text_manager(65,
					"\"Well I must be off, I have a singing gig at a church soon. Take care and be well stranger.\"");
			text_manager(65, "You put on the blue fox fur. It radiates with wamrth and edgey vibes. Groovy!");
			advent(9, player, inventory);
		}

		if (num == 9) {
			text_manager(65, "You leave the club and you head down the street to the casino.");
			text_manager(65, "It's impossible to miss, as giant neon signs lite up the entire building.");
			text_manager(65, "You appraoch the front door. Before you enter, an aged beggar appraoches you.");
			text_manager(65, "\"Spare change?\"");
			text_manager(65, "1. Give this poor sap some money\n2. Nah");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "God bless you! Here, have my lucky flask!");
				AttackPotion flask = new AttackPotion("Lucky Flask", 10);
				addItemToInventory(inventory, flask, player);
			}
			if (input == 2) {
				text_manager(65, "\"Screw you!\"");
				if (player.getSpeed() > 4) {
					text_manager(65, "The man throws a punch but due to your speed, you sidestep and trip him.");
				} else {
					text_manager(65,
							"The man throws a punch, you try to sidestep, but due to your lack of speed you trip over your shoelace.");
					text_manager(65, "The man takes your wallet and runs away.");
					text_manager(65, "You also scrape your knee and lose 3 health, and some of your pride too.");
					jk = "idiot";
					player.removeHealth(3);
					urDead(9, player, inventory);
				}
			}
			text_manager(65,
					"You enter walk into the casino and see endless rows of tables for all methods of gambling.");
			text_manager(65, "You have no idea where you could possibly find Stofoles.");
			text_manager(65, "Perhaps you do a lil gambling...");
			text_manager(65, "1. Sure\n2. Nah bruh ");
			input = in.nextInt();
			if (input == 1) {// if you select one and you didnt lose your wallet
				if (jk.equals("")) {
					int thanos = 0;
					text_manager(65, "You remember you have a little dinero left over");
					// text_manager(65,
					// "Be careful, many people have lost their souls to gambling. However, the pay
					// off is huge.");

					while (thanos != 1) {

						text_manager(65, "Which game do you want to do?");
						text_manager(65, "1. Black Jack\n2. 45's\n3. Russian Roulette\n4. Leave");
						input = in.nextInt();
						AttackPotion cocktail = new AttackPotion("Atomic Cocktail", 15);
						if (input == 1) {// Black Jack
							str = "";
							text_manager(65, "You appraoch the black jack table and take a seat.");
							text_manager(65,
									"\"Hey there sunny want me to deal ya in? It's gonna cost ya 1 health if you lose.");
							text_manager(65, "You have " + player.getHealth() + " health.");
							while (str.equals("")) {
								str = in.nextLine();
							}
							if (str.equals("no")) {
								text_manager(65, "Ok there sunny see ya next time");
							} else {
								if (chance(5)) {
									text_manager(65,
											"Congrats buckaroo! You've won! Here is your reward! An Atomic Cocktail.");
									addItemToInventory(inventory, cocktail, player);
								} else {
									text_manager(65,
											"Looks like ya lost sunny. Better luck next life time. Imma gonna take that one health now.");
									player.removeHealth(1);
									urDead(9, player, inventory);
								}
							}

							str = "";
						}
						if (input == 2) {// 45s
							str = "";
							HealthPotion heal = new HealthPotion("A Good Time", 50);
							text_manager(65, "You appraoch the 45's table and take a seat.");
							text_manager(65, "\"Arrr you ready for a good game? Penalty of course is two health..");
							text_manager(65, "You have " + player.getHealth() + " health.");
							while (str.equals("")) {
								str = in.nextLine();
							}
							if (str.equals("no")) {
								text_manager(65, "Fine be like that. See you later.");
							} else {
								if (chance(10)) {
									text_manager(65,
											"Congrats! You've won! Here is your reward! It's my special drink mix.");
									text_manager(65, "Trust me, you'll have a good time");
									addItemToInventory(inventory, heal, player);
								} else {
									text_manager(65, "Well you lost old sport. Cough up that two health now.");
									player.removeHealth(2);
									urDead(9, player, inventory);
								}
							}
							str = "";
						}
						if (input == 3 && player.getName().equals("John")) {// one in chance that you die
							text_manager(65, "John Matthews is a stupid name.");
							text_manager(65, "BANG!");
							player.removeHealth(666);
							urDead(9, player, inventory);
						}

						if (input == 3) {// Russian
							Weapon infinity = new Weapon("Infinity Gauntlet", 100);
							text_manager(65, "You appraoch the Russian Roulette table and take a seat.");
							text_manager(65,
									"Welcome to the best spot in all of the Lucky 38. My name is Zhirenkov, but my friends call me Big Brotha.");
							text_manager(65,
									"Wanna play a round? I have to warn you that I take this game very seriously. If you win, you are gonna make bank.");
							text_manager(65,
									"And if you lose, well, I won't deduct from your health. But there is a one in six chance of spontaneous combustion.");
							text_manager(65, "So, you ready to play?");
							text_manager(65, "You have " + player.getHealth() + " health.");
							while (str.equals("")) {
								str = in.nextLine();
							}
							if (str.equals("no")) {
								text_manager(65, "I'll see ya around kid.");
							} else {
								if (!chance(6)) {
									text_manager(65, "One spin and you're good.");
									if (!chance(6)) {
										text_manager(65, "Two spins and you're good");
										if (!chance(6)) {
											text_manager(65, "Three spins and...you're good!");
											if (!chance(6)) {
												text_manager(65, "Four spins and....you're good!");
												if (!chance(6)) {
													text_manager(65, "Five spins and.....you're good!");
													if (!chance(6)) {
														text_manager(65, "Six spins and.........you're GOOD!");
														text_manager(65,
																"Amazing. Simply amazing. Here ya go. This is tonights jackpot. The Infinity Gauntlet.");
														addItemToInventory(inventory, infinity, player);
													} else {
														text_manager(65, "Sorry kid.....BANG!");
														player.removeHealth(999);
														urDead(9, player, inventory);
													}
												} else {
													text_manager(65, "Sorry kid.....BANG!");
													player.removeHealth(999);
													urDead(9, player, inventory);
												}

											} else {
												text_manager(65, "Sorry kid.....BANG!");
												player.removeHealth(999);
												urDead(9, player, inventory);
											}

										} else {
											text_manager(65, "Sorry kid.....BANG!");
											player.removeHealth(999);
											urDead(9, player, inventory);
										}

									} else {

										text_manager(65, "Sorry kid.....BANG!");
										player.removeHealth(999);
										urDead(9, player, inventory);

									}
								} else {

									text_manager(65, "Sorry kid.....BANG!");
									player.removeHealth(999);
									urDead(9, player, inventory);

								}
								str = "";
							}

							str = "";
						}

						if (input == 4) {

							break;

						}
					}

				} else {
					text_manager(65, "You remember how that old guy stole your wallet...RIP");
				}
			}
			if (input == 2) {
				text_manager(65, "You remember that you have no money. RIP. ");
			}

			text_manager(65, "You continue to look around.");
			text_manager(65,
					"You notice a large crowd in front of a golden elevetor, with two guards flanking on each side.");
			text_manager(65, "You look up and notice a large glass penthouse. That must be it.");
			text_manager(65, "But how to get around the crowd...?");
			text_manager(65, "1. Yell \"Fire!\"\n2. Pull the fire alarm\n3. Push your way through the crowd");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65,
						"You yell \"fire\". Everybody freaks out and the crowd disperses, along with the rest of the casino.");
			}
			if (input == 2) {
				text_manager(65,
						"You pull the fire alarm. Everybody freaks out and the crowd dispereses, along with the rest of the casino");
			}
			if (input == 3) {
				if (player.getAttack() > 40) {

				} else {
					text_manager(65, "You shove the guy in front of you. Unfortunently, you aren't that strong.");
					text_manager(65, "He drop kicks you and you lose 5 health");
					player.removeHealth(5);
					urDead(9, player, inventory);
					text_manager(65, "However when the guy drop kicked you, he bumped into the guy next to him.");
					text_manager(65,
							"They start fighting, and before you know it, everybody in the line is tackling eachother.");
					text_manager(65, "Problem solved.");
				}
			}
			text_manager(65, "You slip by everybody and sneak by the guards as they try to control the crowd.");
			text_manager(65,
					"In the elevator you have three options, the floor you are on, the basment, and the penthouse.");
			int olga = 0;
			int ringo = 0;
			while (olga != 1) {
				text_manager(65, "1. Penthouse\n2. Lobby\n3. Basment");
				input = in.nextInt();
				if (input == 1) {
					text_manager(65, "You crack your knuckles and press the penthouse button. Here we go.");
					break;
				}
				if (input == 2) {
					text_manager(65, "That's probably a bad idea...");
				}
				if (input == 3) {
					if (ringo == 1) {
						text_manager(65, "You already went down there once, best not to do it again...");
					} else {
						text_manager(65, "You press the basement button and down you go.");
						for (int i = 65; i < 100; i++) {
							text_manager(i, ".");
						}

						text_manager(65, "You reach the basement. It's very dark and smells bad.");
						text_manager(65, "You look across the room and see a vault with all sorts of goodies. Yeet");
						text_manager(65, "\"RHUARAJHHDNSBA!\"");
						text_manager(65, "Three giant mole rats emerge from the darkness. Jinkies.");
						text_manager(65, "What do you want to do?");
						text_manager(65, "1. Fight\n2. Flee");
						input = in.nextInt();
						if (input == 1) {
							RPG(12, player, inventory);
							text_manager(65, "You smash the mole rat against the wall and move on to the next one.");
							RPG(12, player, inventory);
							text_manager(65, "You bop the mole rat on the head and continue to the last one.");
							RPG(12, player, inventory);
							text_manager(65, "You obliterate the last mole rat.");
							text_manager(65,
									"You appraoch the vault. Unfortenetely, it is mainly empty, but there is a few items left. Which one do you want?");
							text_manager(65, "You can only have one cuz I said so.");
							text_manager(65, "1. Storm Breaker\n2. Fat Boy\n3. A Rock");
							input = in.nextInt();
							Weapon breaker = new Weapon("Storm Breaker", 50);
							Weapon fat = new Weapon("Fat Boy", 50);
							Weapon rock = new Weapon("Rock", 55);

							if (input == 1) {
								addItemToInventory(inventory, breaker, player);
							}
							if (input == 2) {
								addItemToInventory(inventory, fat, player);
							}
							if (input == 3) {
								addItemToInventory(inventory, rock, player);
							}
							text_manager(65, "You take your new weapon and head back into the elevator");
							ringo = 1;
						} else {
							if (input == 2) {
								text_manager(65,
										"There is no shame in being a wimp. You run back into the elevator as the doors close behind you.");
							}
						}

					}

				}

			}
			for (int i = 65; i < 100; i++) {
				text_manager(i, ".");
			}
			text_manager(65, "The doors open as the vast penthouse comes into view");
			text_manager(65, "Stofoles has his legs on his desk as he sips a cup of coffee.");
			text_manager(65, "\"I've been expecting you. I didn't think it would take you this long though.\"");
			if (jk.equals("idiot")) {
				text_manager(65,
						"\"I watched you trip yourself outside when that guy stole your wallet. Quite ammusing.\"");
			}
			text_manager(65, "You tell him enough is enough, and that it is time you return home");
			text_manager(65, "\"Now why in the actual Hell would I want to do that?");
			text_manager(65,
					"1.\"Because the contract doesn't have my real name!\"\n2.\"I guess I will just have to fight you then!\"");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "\"Don't be foollish now, the contract clearly says " + player.getName() + " Jr!\"");
				text_manager(65, "You tell him that your real name is just " + player.getName());
				text_manager(65, "\"..........\"");
				text_manager(65, "\"Well in that case-\"");
				text_manager(65, "Stofoles takes the contract out of his pocket, and crumbles it into a ball");
				text_manager(65, "He snaps his fingers and it catches on fire.");
				text_manager(65, "He throws it at you.");
				text_manager(65, "The fireball hits you straight in the face. You scream in pain as your skin burns.");
				text_manager(65, "You now take fire damage for the rest of the battle.");
			}

			if (input == 2) {
				text_manager(65, "HAHAHA! Fight me? We all know what will happen if you try that.");
				text_manager(65, "I do need to get some cardio in....ok sure....YAHHHHHHHH!");
				text_manager(65, "Stofoles hurdles a fire ball at you!");
				text_manager(65, "You now take fire damage for the rest of the battle.");
			}
			
			Item empty = new Item("", 0);
			inventory[3][0] = empty;
			Weapon pen = new Weapon("Riptide", 20);
			addItemToInventory(inventory, pen, player);
			text_manager(65, "The pen you retrieved from Toby's body begins to vibrate...");
			text_manager(65, "You take it out of your pocket.");
			text_manager(65, "\"What in tarnation is that?!\"");
			text_manager(65, "You uncap the pen, and in doing so, it turns into a full length sword.");
			text_manager(65,
					"\"Impossible! Your patheic attempt at weakening me with that is only a foil for my anger!\"");
			text_manager(65, "\"You will die a thousand times!\"");
			RPG(13, player, inventory);
			text_manager(65, "\"Well here we are. Just do it. End me!\"");
			text_manager(65,
					"You tell him that you won't kill him, but in return he will return you to the mortal world.");
			text_manager(65, "\"Cough, it's a deal...");
			text_manager(65, "3000");
			text_manager(65, "\"Just remember kid, don't deal with the devil-HAHAHAH-\"");
			for (int y = 0; y < 66; y++) {
				text_manager(1,
						"66666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
			}

			advent(10, player, inventory);

		}

		if (num == 10) {
			text_manager(65, "loading........");
			text_manager(65, "You open your eyes.");
			text_manager(65, "It seems the bargain to return back to your normal world had one side of it fufilled.");
			text_manager(65, "This place is not home. It looks like home, but it's wrong.");
			text_manager(65, "You see a building labled \"Power\" nearby.");
			text_manager(65, "1. Go Explore \n2. Stay on your path");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65,
						"In the building you find a tri-prong of power streaming from waht seems like and endless void.");
				text_manager(65,
						"You touch it only to feel like the most powerful man in the universe while feeling like the most fragile.");
				text_manager(65, "Your attack has been doubled and your health has been halved.");
				player.setAttack(player.getAttack() * 2);
				player.setHealth(player.getHealth() / 2);
			} else {
				text_manager(65, "You countinue your journey in this mysterious place.");
			}
			text_manager(65, "You keep walking until you encounter what almost seems to be a robot police officer.");
			RPG(11, player, inventory);
			advent(11, player, inventory);

		}

		///////////////////////////////////
		Item empty = new Item("");
		if (num == 11) {
			text_manager(65,
					"After having faced such an odd encounter, you continue down teh street towards teh largest buidling you can see");
			text_manager(65, "The building seems to almost be connected to every other building in the area.");
			text_manager(65, "On the side of the road you encounter a beggar, and you're faced with a choice.");
			text_manager(65, "1. Donate the dollar that seems to be suddenly in your pocket\n2.Keep walking");
			input = in.nextInt();
			if (input == 1) {
				text_manager(65, "The beggar pulls out a knife and shanks you.");
				text_manager(65, "You lose one health and " + inventory[2][0].getName());
				player.removeHealth(1);
				inventory[2][0] = empty;
				urDead(11, player, inventory);
				// method for removing a potion, if too much can be removed
			} else {
				text_manager(65, "You continue on towards the tower as teh beggar gives you the dirty eye.");
			}
			text_manager(65, "At the door of the building you look up to notice the sign for it.");
			text_manager(65, "\"The Motherless Board\"");
			text_manager(65, "You walk in to see no reception desk, only wires everywhere");
			text_manager(65, "And a single elevator.");
			text_manager(65, "You walk into the elevator and see only one button.");
			text_manager(65, "Seeing only one option, you decide to hit it.");
			for (int i = 65; i < 100; i++) {
				text_manager(i, ".");
			}
			text_manager(65, "You reach the top floor, only to find a man sitting in a large throne");
			text_manager(65, "\"I am Pevin Karker, sad boi extrordinare, and adviser of this realm.\"");
			text_manager(65, "\"I don't know how you got here, but it doesn't matter. Prepare to be overwritten!\"");
			RPG(14, player, inventory);
			advent(12, player, inventory);
		}
		if (num == 12) {
			text_manager(65, "You find yourself far away from the tower, being flung away by Karker.");
			text_manager(65, "You crash land into a mound of wires which luckily breaks your fall.");
			text_manager(65, "You stand up and think about your next move.");
			text_manager(65,
					"You remember Pevin bragging about power and decide to venture towards The Forest of Memory, where the RAM is kept.");
			text_manager(65, "How do you know this? It's convenient for the plot.");
			text_manager(65,
					"Not only is that convenient, but it seems after looking around you're only a half mile from the forest.");
			text_manager(65, "You venture deeper and deeper until you come across a large clearing");
			text_manager(65, "And there it is.");
			text_manager(65, "The largest ram you've ever seen in your mostly ram-less life.");
			text_manager(65,
					"Taking advantage of these incredible coincendinces that have been happening, you decide to attempt to take down the ram for no reason whatsoever.");
			// queue RAM fight, a fight against a large ram whose only lines are "ram
			// noises"
			RPG(15, player, inventory);
			advent(13, player, inventory);
		}
		if (num == 13) {
			text_manager(65, "You feel a rift of power go through the air as you lay the finishing blow on the RAM.");
			text_manager(65,
					"You can't fully remember how you beat him, but luckily for you, your quest has already moved into long-term data storage.");
			text_manager(65,
					"You find a rather large bug in the forest that to be honest shoud have been dealt with earlier but for now you decide to ride to ride it back to the main city.");
			text_manager(65, "The bug brings you to the door of the tower, but that is as far as it can go.");
			text_manager(65, "You reach the top of the tower to see Pevin Karker noticebly weaker");
			text_manager(65, "He looks at you and asks \"Who sent you anyway!?\"");
			str = in.nextLine();
			if (str.indexOf("mom") > 0 || str.indexOf("mother") > 0) {
				text_manager(65, "\"oh god, i guess this is the end of the road for me.");
			} else {
				text_manager(65, "\"Your master is no one compared to me. Prepare to be killed. Permenentely.\"");
			}
			RPG(16, player, inventory);
			advent(14, player, inventory);
		}
		if (num == 14) {// credits with joyal pop up
			// text_manager(100,"Writer/Music: Alexander Vasquez\n" +
			// "Game Designer: Brandon Mills\n" +
			// "Programmer: Julian Mancini\n");
			text_manager(65, "You watch as Pevin stumbles and falls over, finally deafeated.");
			text_manager(2000);
			text_manager(65, "You have won.");
			text_manager(2000);
			text_manager(100, "At last. You finally rest, and watch the sunrise on a credit screen.\n");
			text_manager(100, "Producers\nBrandon Mills\nJulian Mancini\nAlexander Vasquez\n");
			text_manager(100, "Story Board Artist\nAlexander Vasquez\n");
			text_manager(100, "Coding Wizard\nBrandon Mills\n");
			text_manager(100, "Conceptual Help\nJulian Mancini\n");

			text_manager(2000);
			text_manager(65,
					"MEM: 35488\n" + "+/- Buffers/Cache SWAP: 7566584\n" + "475332 0\ntOtAl: 75666584" + "1592148");
			text_manager(65, "A:PID = PROCESS ID V:NDRT = COGETIVE.1 ACCESSED");
			text_manager(65, "D:VID = USER ID Y:WHCHAN = COGETIVE.2 ACCESSED");
			text_manager(65, "E:ADMIN = USER NAME Z:FLAGS = COGETIVE.3 ACCESSED");
			text_manager(65, "ACCESSED SYSTEM INITIALIZATION\n"
					+ "PROTOCOL DEEP_NET/SAT.ID2 SUCCESSFUL ECHOPACKE LOCAL RESTORE MKDIR BACKUP");
			text_manager(65, "Your reveling in victory is suddenly interrupted by a crack in the sky.");
			text_manager(65,
					"You believe yourself to be hallucinating but you see a gigantic hand reaching out towards you.");
			text_manager(65, "The hand nearly crushes you before you lose consciousness.");
			text_manager(65, "When you come to, you are faced with a giant man in a throne.");
			text_manager(65, "His look is a mixture of judgement and pity.");
			text_manager(65,
					"\"Aaannnnddd......\"\n" + "\"There we go. Hey, " + player.getName()
							+ ", can you hear me? Good.\"\n" + "\"My name is A. Joyal\"\n"
							+ "Character Mr Joyal = new Character;\n" + "\"Oh wait, forgot the right syntax...\"\n"
							+ "Character Joyal = new Character;\n" + "\"There we go!\"\n");
			text_manager(65, "\"You have disrupted this raelm in quite the fashion, mortel one.\"");
			text_manager(65,
					"\"But this is no time for contgratulatory speeches. Maybe in a better time you could've been on my side.\" ");
			text_manager(65,
					"\"I geuss this is the end of your tale. You fought well, But as a an old beatle once said,\" "
							+ "\n\"All things must pass.\""

							+ "\n\"And you are no exception.\"");
			text_manager(90, "\"Prepare to meat your end by syntax error.\"");

			RPG(101, player, inventory);
			text_manager(65, "NOOO! How it this possible! Oh I will show you!");
			text_manager(80, "for(int i=0;i<1;i+0){\nSystem.out.println(i cannot lose);");
			for (int i = 0; i < 30; i++) {
				text_manager(45, "i cannot lose");
			}
			text_manager(65, "UGH! This is getting boring...");
			text_manager(65, "I suppose this is the end of the game. I got nothing else.\n"
					+ "Hey kid, before you leave can I give you some advice?");
			text_manager(3000);
			text_manager(65, "Do what you love.\n" + "Simply put.\n" + "It doesn’t matter about the pay,\n"
					+ "It doesn’t matter about how long it takes to accomplish your dream. \nIt doesn’t matter what stands in your way to accomplish your dream Just do what you love and everything will follow.\n"
					+ "As someone who has accomplished this dream, I can attest to that.\n"
					+ "I have some of the best students the world could ever ask for,\n"
					+ "And I love the energy and fire they bring in class.\n"
					+ "And I couldn’t ask for anything more.\n" + "So make sure you figure out\n"
					+ "what makes you do anything in the first place.\n" + "If you do that, you’ll be forever happy.\n"
					+ "And with that I bid you adieu.\n" + "Joyal.delete();\n" + "CrystalCrossing.delete();\n"
					+ "Hell.delete();\n" + "MotherlessBoard.delete();\n" + "Player.delete();");
		}
	}

	public static void RPG(int num, Character player, Item[][] inventory) {// right now, all effect are perm. Idk how to
																			// go about fixing that
		// num is the stage/battle you are on

		// int temp=player.getAttack()+player.getPlayerWeapon().getWeaponAttack();

		int ringo = 0;
		int nummy = 0;
		Scanner in = new Scanner(System.in);

		if (num == 1) {// Alex: Wolf
			Enemy enemy = new Enemy("Wolf", 20, 150);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65, "The wolf rips you apart as you wonder why you ever came into this cave...");
					text_manager(65, "You have died.");
					urDead(1, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "\"Woof? Oof.\"");
			text_manager(65, "You have defeated the wolf.");

			return;// ends battle, therefore ending RPG method

		}
		if (num == 2) {// ALEX: Lion
			Enemy enemy = new Enemy("Lion", 8, 100);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"ROOOOOAR\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65,
							"You wonder why you listened to that weird guy talk you into entering the cave...");
					text_manager(65, "You have died.");
					urDead(1, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "ROOAR??");
			// text_manager(65, "");

			return;// ends battle, therefore ending RPG method

		}
		if (num == 3) {// ALEX
			Enemy enemy = new Enemy("Alex", 5, 50);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"EAT LEAD!\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, "Alex strikes you with his pencil for " + enemy.getAttack()
				// + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65, "\"Well I didn't expect this...I'm supposed to be easy!\"");
					text_manager(65, "\"Looks like I gotta change the code or something...\"");
					urDead(3, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "Well.....");

			return;// ends battle, therefore ending RPG method

		}

		if (num == 4) {
			Enemy enemy = new Enemy("Toby", 10, 100);
			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "Aloha...wait, you aren't Ringo...time to die I guess.");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {
				randomEnemyResponse();
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65, "You have died");
					urDead(1, player, inventory);
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();
					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;
					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();
						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it
							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one
						}
					}
					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}
				}

			}
			text_manager(65, "Wait, what?! You defeated me?? Even I know that's rubbish...oof");
			text_manager(65, "You have defeated " + enemy.getName());
			advent(7, player, inventory);
			return;// ends battle, therefore ending RPG method

		}

		if (num == 10) {// Curtis
			Enemy enemy = new Enemy("Curtis", 10, 150);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65,
					"Baby you move good, you feel good, you sound good, but it's time for your final curtin call...");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65,
							"Curtis smacks you across the face as you fall on the ground and the world spins around you. You died.");
					urDead(7, player, inventory);
					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65,
					"You yell BANG and Curtis jumps like a scared cat. You swipe his gun as his body guards flee.");
			text_manager(65,
					"\"Who do you think you are! You're nothing! You're nobody-\"you smash the gun into the side of his head as Curtis passes out on the floor.");

			return;// ends battle, therefore ending RPG method

		}
		if (num == 11) {// mCaFFEVIRUS
			Enemy enemy = new Enemy("McAfee Anti-Virus", 20, 150);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"Your system may be at risk!\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65, "McAfee has prevented a potentially unwanted program from running. Good bye...");
					text_manager(65, "You have died.");
					urDead(10, player, inventory);
					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "ERorRRRRRRRRRRRRRRR");

			return;// ends battle, therefore ending RPG method

		}
		if (num == 12) {// Mole Rats
			Enemy enemy = new Enemy("Mole Rat", 10, 50);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"SCREEEECH!\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65, "The mole rat jumps on your body and eats your face.");
					text_manager(65, "You have died.");
					urDead(9, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "You have killed the mole rat!");

			return;// ends battle, therefore ending RPG method

		}

		if (num == 13) {// MF Stofoles
			Enemy enemy = new Enemy("MF Stofoles", 15, 150);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"Welcome to Hell!\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {
				text_manager(65, "Your skin stings in agony as you take 2 fire damage");
				player.removeHealth(2);
				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				if (player.getHealth() <= 0) {
					text_manager(65,
							"Stofoles grabs you by the throat and looks into your eyes as the world around you ignites with fire and crumbles apart.");
					text_manager(65, "Your eyes burn shut. You try to force them open.");
					text_manager(65, "Once open, you see Stofoles in front of you once again....?");
					text_manager(65,
							"\"You thought you could die that easily? I will make sure you suffer before I end your puny suffering!\"");
					player.addHealth(100);
					RPG(13, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: preParE");
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: YoUrsELF");
						text_manager(65, "Nice: tO");
						text_manager(65, "Try: DiE");
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "\"NOOOOOOOOOOOO!\"");

			return;// ends battle, therefore ending RPG method

		}

		if (num == 666) {
			int x = player.getHealth();
			Enemy enemy = new Enemy("Salesman", 0, 666);

			// autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "I have 100% customer satisfaction!");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				enemy.addAttack(15);
				if (player.getHealth() <= 0) {
					text_manager(65, "You get roasted and you get thrown to the ground");
					player.setHealth(x);
					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();

						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.getName() + "'s Attack: ErROr");
						text_manager(65, enemy.getName() + "'s Health: ErROr");
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "You kick the salesman to the ground");
			text_manager(65, "Cough, cough, do you really think you have bested me???");
			player.setHealth(x);
			return;// ends battle, therefore ending RPG method

		}
		if (num == 14) {// Pevin OP
			Enemy enemy = new Enemy("Pevin", 100000, 666);
			int x = player.getHealth();
			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"Time to die sir!\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				player.removeHealth(enemy.getAttack());
				text_manager(65, enemy.getName() + " has attacked you for " + enemy.getAttack() + " damage");
				enemy.addAttack(100);
				if (player.getHealth() <= 0) {
					text_manager(65, "Wow");
					text_manager(65, "Pevin picks you up and throws you from the tower.");
					player.setHealth(x);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "You have destroyed Pevin!");

			return;// ends battle, therefore ending RPG method

		}
		if (num == 15) {// ram
			Enemy enemy = new Enemy("RAM", 15, 115);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"ram noises\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				enemy.addAttack(100);
				if (player.getHealth() <= 0) {
					text_manager(65, "The RAM rams you in the back and crushes you to death.");
					text_manager(65, "You have died.");
					urDead(12, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "You delete all the data in the RAM and yank it's cord from it's socket.");

			return;// ends battle, therefore ending RPG method
		}
		if (num == 16) {
			Enemy enemy = new Enemy("Pevin Karker", 15, 125);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"Your death is imimnent!\"");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				// enemy.addAttack(10);
				if (player.getHealth() <= 0) {
					text_manager(65, "Pevin waves his hand as you are thrown out the window...falling...falling...");
					for (int i = 65; i < 100; i++) {
						text_manager(i, ".");
					}
					text_manager(65, "You have died.");
					urDead(12, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "You delete all the data in the RAM and yank it's cord from it's socket.");

			return;// ends battle, therefore ending RPG method
		}
		if (num == 21) {
			Enemy enemy = new Enemy("Spider Queen", 20, 150);

			autoSort(inventory);
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				randomEnemyAction(player, enemy);
				text_manager(65, "You take poison damage and lose another health");
				player.removeHealth(1);
				if (player.getHealth() <= 0) {
					text_manager(65, "The spider cradles you in it's arms as it munches on your flesh covered limbs.");
					text_manager(65, "You have died.");
					urDead(4, player, inventory);

					return;
				}
				text_manager(65, enemy.getName() + " has " + enemy.getHealth() + " health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
																											// player
																											// base
																											// attack
																											// plus
																											// weapon
																											// attack
																											// for total
																											// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to heal yourself");
						player.addHealth(5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Row: ");
						int row = in.nextInt();
						text_manager(65, "Column: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, player.getName() + "'s Attack: " + why);
						int idk = +player.getHealth();
						text_manager(65, player.getName() + "'s Health: " + idk);
						text_manager(65, enemy.toString());
					}
					if (nummy == 6) {// nothing
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "\"JAAAAAA! It stings! IT STINGS! JAAAAAA-\"");
			text_manager(65, "You have defeated the Spider Queen.");

			return;// ends battle, therefore ending
		}
		if (num == 101) {// JOYAL
			Enemy enemy = new Enemy("Joyal", 20, 200);

			text_manager(65, "Your inventory has been hacked. You're welcome!");
			// autoEquip(player,inventory);
			player.addHealth(player.getPlayerArmor().getArmorHealth());// adds armor health to player's base health to
																		// get total health. Makes it so chaning armor
																		// during battle doesnt add back your health.
																		// tHAT WOULD be cheating..
			text_manager(65, "\"73% " + "of STEM jobs in 2020 will be in Computer Science!\"\n");
			while (enemy.getHealth() > 0 && player.getHealth() > 0) {

				// player.removeHealth(enemy.getAttack());
				// text_manager(65, enemy.getName() + " has attacked you for " +
				// enemy.getAttack() + " damage");
				joyalRand(player, enemy, inventory);
				if (player.getHealth() <= 0) {
					text_manager(65,
							"So I guess I outcoded you. \nAlright then put your stuff away and take out a pencil./n We are going to take a graded AP test....without a scale! HAHAH!");
					text_manager(65, "player.delete();");
					text_manager(65, "You have been deleted.");
					urDead(14, player, inventory);

					return;
				}
				text_manager(65, "Joyal has infinite health");
				text_manager(65, "What do you want to do?");
				while (ringo != 1) {// keeps looping through options in case player decides to display stats or
									// inventory. This doesn't count as a move
					text_manager(15,
							"1. Attack\n2. Heal\n3. Use Item\n4. Display Inventory\n5. Display Stats\n6. Nothing");
					nummy = in.nextInt();

					if (nummy == 1) {
						int why = player.getAttack() + player.getPlayerWeapon().getWeaponAttack();
						text_manager(65, "You attacked " + enemy.getName() + " for " + why + " damage");
						text_manager(65, "Part of the damage is reflected back at you for " + why / 6 + " damage");
						enemy.removeHealth(player.getAttack() + player.getPlayerWeapon().getWeaponAttack());// adds
						text_manager(65, "You lose 1 health because Joyal is better at coding then you"); // player
						player.removeHealth(1); // base
						// attack
						// plus
						// weapon
						// attack
						// for total
						// attack

						break;
					}
					if (nummy == 2) {
						text_manager(65, "You wait and decide to stab yourself");
						player.addHealth(-5);

						break;

					}
					if (nummy == 3) {
						Item empty = new Item("");
						text_manager(65, "Which item inventory slot would you like to use?");
						inventoryToString(inventory, player);
						text_manager(65, "Pizza: ");
						int row = in.nextInt();
						text_manager(65, "Ball: ");
						int col = in.nextInt();

						if (useItem(inventory[row][col], player)) {// if this returns true, which means you actually
																	// used something, then you do the check to see if
																	// you need to remove it

							if (inventory[row][col].getUI().equals("POTION")
									|| inventory[row][col].getUI().equals("HEALTH_POTION")
									|| inventory[row][col].getUI().equals("ATTACK_POTION"))
								inventory[row][col] = empty;// removes used item and replaces it with an empty one

						}
					}

					if (nummy == 4) {
						inventoryToString(inventory, player);
					}
					if (nummy == 5) {

						text_manager(10,
								"Advanced Placement Computer Science A is designed to prepare you for the AP Computer Science A Exam. \nThe course is a project-oriented study of computer science using the Java programming language. \nEach student should be prepared to function as a logical thinker \nwith a willingness to devote ample time to developing solutions to complex challenges. \nProjects in the course demand a thoughtful and organized approach to problem solving as well as a strong attention to precise detail \nand the time necessary to experiment with possible solutions.");
					}
					if (nummy == 6) {// nothing
						text_manager(65, "\"DETENTION!\"");
						if (chance(10) == true) {
							enemy.removeHealth(666);
							text_manager(5,
									"________$$$$_______________\n" + "_______$$__$_______________\n"
											+ "_______$___$$______________\n" + "_______$___$$______________\n"
											+ "_______$$___$$_____________\n" + "________$____$$____________\n"
											+ "________$$____$$$__________\n" + "_________$$_____$$_________\n"
											+ "_________$$______$$________\n" + "__________$_______$$_______\n"
											+ "____$$$$$$$________$$______\n" + "__$$$_______________$$$$$$\n"
											+ "_$$____$$$$____________$$$\n" + "_$___$$$__$$$____________$$\n"
											+ "_$$________$$$____________$\n" + "__$$____$$$$$$____________$\n"
											+ "__$$$$$$$____$$___________$\n" + "__$$_______$$$$___________$\n"
											+ "___$$$$$$$$$__$$_________$$\n" + "____$________$$$$_____$$$$\n"
											+ "____$$____$$$$$$____$$$$$$\n" + "_____$$$$$$____$$__$$\n"
											+ "_______$_____$$$_$$$\n" + "________$$$$$$$$$$\n" + "");
							text_manager(65,
									"BOOOOOM!......by doing nothing, you accidentely set off an atomic explosion that roasted "
											+ enemy.getName() + "!");
						}

						break;
					}

				}

			}

			text_manager(65, "");
			text_manager(65, "");

			return;// ends battle, therefore ending RPG method
		}
	}

	public static void randomEnemyResponse() {
		String[] tobyRandResponse = { "\"May The Force Be With You...\"", "\"Do you have a pen?\"",
				"\"Not in this lifetime!\"", "\"Aloha Madem Moiselle\"", "\"I'm having a vision!\"" };
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < tobyRandResponse.length; i++) {
			list.add(tobyRandResponse[i]);
		}

		int x = getRandInt(0, 4);
		text_manager(65, list.get(x));

	}

	public static void randomEnemyAction(Character player, Enemy enemy) {
		int rand = getRandInt(1, 3);

		if (rand == 1 || rand == 2) {// enemy attacks player
			player.removeHealth(enemy.getAttack());
			text_manager(65, enemy.getName() + " has attacked you for " + enemy.getAttack() + " damage");

		} else {
			if (rand == 3) {// enemy heals
				enemy.addHealth(10);
				text_manager(65, enemy.getName() + " has healed");
			}
		}

	}

	public static int getRandInt(int min, int max) {// returns random int
		return (int) (Math.random() * ((max - min) + 1)) + min;
	}

	public static void autoSort(Item[][] Inventory) {// auto sorts inventory,puts best items in decending order,and auto
														// equips the item in the first slot

		text_manager(40, "Your inventory has been auto sorted. You're welcome.");
		int n = 5;
		for (int x = 0; x < 4; x++)
			for (int i = 0; i < n - 1; i++)
				for (int j = 0; j < n - i - 1; j++)
					if (Inventory[x][j + 1].getBuff() > Inventory[x][j].getBuff()) {
						// swap temp and arr[i]
						Item max = Inventory[0][j + 1];
						Inventory[x][j + 1] = Inventory[x][j];
						Inventory[x][j] = max;
					}

	}

	public static void inventoryToString(Item[][] inventory, Character player) {// not done yet
		System.out.println("Equiped Armor: " + player.getPlayerArmor().getName());
		System.out.println("Equiped Weapon: " + player.getPlayerWeapon().getWeaponName());

		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Armor:   |     " + inventory[0][0].getName() + "[0,0]     |     "
				+ inventory[0][1].getName() + "[0,1]     |     " + inventory[0][2].getName() + "[0,2]     |     "
				+ inventory[0][3].getName() + "[0,3]     |     " + inventory[0][4].getName() + "[0,4]     |");// weapons
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Weapons: |     " + inventory[1][0].getName() + "[1,0]     |     "
				+ inventory[1][1].getName() + "[1,1]     |     " + inventory[1][2].getName() + "[1,2]     |     "
				+ inventory[1][3].getName() + "[1,3]     |     " + inventory[1][4].getName() + "[1,4]     |");// armor
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Potions: |     " + inventory[2][0].getName() + "[2,0]     |     "
				+ inventory[2][1].getName() + "[2,1]     |     " + inventory[2][2].getName() + "[2,2]     |     "
				+ inventory[2][3].getName() + "[2,3]     |     " + inventory[2][4].getName() + "[2,4]     |");// potions
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Special: |     " + inventory[3][0].getName() + "[3,0]     |     "
				+ inventory[3][1].getName() + "[3,1]     |     " + inventory[3][2].getName() + "[3,2]     |     "
				+ inventory[3][3].getName() + "[3,3]     |     " + inventory[3][4].getName() + "[3,4]     |");// special
																												// items
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public static boolean useItem(Item item, Character player) {
		Item empty = new Item("", 0);
		if (item.getName().equals("")) {
			text_manager(65, "Inventory slot empty");
			return false;
		}

		if (item.getUI().equals("POTION") || item.getUI().equals("HEALTH_POTION")
				|| item.getUI().equals("ATTACK_POTION")) {
			Scanner in = new Scanner(System.in);
			String str = "";
			text_manager(65,
					"This " + item.getUI() + " has a buff of " + item.getBuff() + "\nAre you sure you want to use it?");
			str = in.nextLine().toLowerCase();
			if (str.equals("no")) {
				return false;
			} else {

				if (item.getUI().equals("HEALTH_POTION")) {
					player.addHealth(item.getBuff());
					text_manager(65, "Your health has increased by " + item.getBuff());
				}
				if (item.getUI().equals("ATTACK_POTION")) {
					player.addAttack(item.getBuff());
					text_manager(65, "Your attack has increased by " + item.getBuff());
				}
			}

			return true;
		}
		if (item.getUI().equals("ARMOR")) {
			player.setPlayerArmor((Armor) item);
			text_manager(65, "You have equppied " + item.getName());
			text_manager(65, "It has " + item.getBuff() + " defense");
			return true;
		}
		if (item.getUI().equals("WEAPON")) {
			player.setPlayerWeapon((Weapon) item);
			text_manager(65, "You have equppied " + item.getName());
			text_manager(65, "It has " + item.getBuff() + " attack");
			return true;
		}
		if (item.getUI().equals("SPECIAL_ITEM")) {

			text_manager(65, "You can't use that here.");
			return true;
		}

		return false;

	}

	public static void autoEquip(Character player, Item[][] inventory) {// auto equips best weapon and armor, which
																		// should be in the first slot because the
																		// inventory should have just been sorted
		// if the first place is empty, just do nothing, this eliminates any errors

		// player.setPlayerArmor(inventory[1][0]);
		// player.setPlayerWeapon(inventory[0][0]);
	}

	public static void addItemToInventory(Item[][] inventory, Item item, Character player) {// tries to place item in
																							// inventory.First it
		// checks what kind of item it is, and
		// places it accordinly in the proper
		// row.2nd, if a spot is taken, it cotinues
		// to the right is search of an empty spot,
		// we know if it is empty by checking it's
		// name. If there is no spots left, the
		// player will be prompted with the
		// question, would you like to remove your
		// weakest item in order to place a new one.
		// If so, the method will place the new item
		// at the end.Now this weapon might now
		// belong there becuase it may have good
		// stats. So the method auto short should
		// always be called right after adding an
		// item...thank you
		int num = 0;
		int que = 0;
		Scanner in = new Scanner(System.in);
		if (item.getUI().equals("ARMOR")) {// ARMOR ROW
			num = 0;
		}
		if (item.getUI().equals("WEAPON")) {// WEAPON ROW
			num = 1;
		}
		if (item.getUI().equals("POTION") || item.getUI().equals("HEALTH_POTION")
				|| item.getUI().equals("ATTACK_POTION")) {// POTION ROW
			num = 2;
		}
		if (item.getUI().equals("SPECIAL_ITEM")) {
			num = 3;
		}
		for (int i = 0; i < 5; i++) {
			if (inventory[num][i].getName().equals("")) {
				inventory[num][i] = item;
				return;
			}
		}
		text_manager(65, "Unfortunetely, your inventory is full...do you want to remove an item?");
		String str = in.nextLine();
		if (str.toLowerCase().equals("no")) {
			text_manager(65, "ok...");
			return;
		} else {
			text_manager(65, "Which inventory slot would you like to place your new item in?");
			inventoryToString(inventory, player);
			text_manager(65, "Column: ");
			que = in.nextInt();
			inventory[num][que] = item;
			text_manager(65, "Congrats, you got a thing! yay!");
		}

	}

	public static boolean chance(int num) {
		int thing = getRandInt(1, num);
		if (thing == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void urDead(int num, Character player, Item[][] inventory) {
		String str = "";
		Scanner in = new Scanner(System.in);
		int death = 0;
		if (player.getHealth() <= 0) {
			player.addDeath(1);

			text_manager(65, "\"Looks like you died in this very simple game. Very patheic.\"");

			if (player.getDeath() == 1) {
				text_manager(65,
						"Being the master code designer, I Brandon Mills could hypothetically \"code\" you back into the game...");
				text_manager(65, "Alright, I will do it just this once alright! Hang tight. You're in for a ride");
			}
			if (player.getDeath() == 2) {
				text_manager(65, "Again. Really?");
				text_manager(65,
						"\"Sigh, I do feel a little pity.You really do suck at this " + player.getName() + "\"");
				text_manager(65, "\"I swear, no more after this. Buckle up!");
			}
			if (player.getDeath() == 3) {
				text_manager(65, "And so we are here once again...");
				text_manager(65, "Life is all about choices " + player.getName() + "\"");
				text_manager(65, "You've died, like, a lot.");
				text_manager(65, "Do you even want to go back at this point?");
				str = in.nextLine();
				if (str.equals("no")) {
					text_manager(65, "Ok, well, go have fun in this infinite loop I guess.");
					while (death != 1) {
						text_manager(100, "1110001000101");
					}
				} else {
					text_manager(65, "Alrighty. I guess we all deserve second chanc - I mean, third chances....");
					text_manager(65, "Prepare yourself.");
				}
			}
			if (player.getDeath() > 3) {
				String[] toby = new String[6];
				text_manager(65, "So. Here we are. Man, idk how you've died this much.");
				text_manager(65, "Honestly, this game isn't even that hard.");
				text_manager(65,
						"You ain't going back. Ur character is stupid. Ur inventory is stupid. Ur stats are stupid.");
				text_manager(65, "I think it's time for a little revitilzation...");
				main(toby);
			}
			player.setHealth(100);
			int sir = 50;
			text_manager(3000);
			for (int i = 0; i < 66; i++) {
				text_manager(sir, "1");
				text_manager(sir, "0");
				text_manager(sir, "1");
				text_manager(sir, "1");
				text_manager(sir, "0");
			}
			text_manager(3000);
			advent(num, player, inventory);
		}
	}

	public static void joyalRand(Character player, Enemy enemy, Item[][] inventory) {
		int rand = getRandInt(1, 3);
		Item empty = new Item("");
		int r3 = getRandInt(1, 50);
		if (rand == 1 || rand == 2) {// enemy attacks player
			player.removeHealth(enemy.getAttack() + r3);
			int dam = enemy.getAttack() + r3;
			text_manager(65, enemy.getName() + " has attacked you for " + dam + " damage");

		} else {
			if (rand == 3) {// enemy heals
				enemy.addHealth(r3);
				text_manager(65, "Joyal.addHealth(getRandInt(1,50));");
			}
		}
		if (chance(5)) {// removes a random item
			int bing = 0;
			text_manager(65, "Joyal codes a binary sort algorithim and erases a random inventory slot!");
			int r1 = getRandInt(0, 3);
			int r2 = getRandInt(0, 3);

			inventory[r1][r2] = empty;
		}

		if (chance(10)) {// changes every items name
			text_manager(65, "Joyal creates a null pointer exception and nulls every item's name in your inventory");
			for (int x = 0; x < inventory.length; x++) {
				for (int y = 0; y < inventory[0].length; y++) {
					inventory[x][y].setName("null");
				}

			}
		}
		if (chance(6)) {
			text_manager(65, "Joyal.addAttack(10);");
			enemy.addAttack(10);
		}

	}
}
