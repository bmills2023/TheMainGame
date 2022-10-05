import java.util.Scanner;
public class Character_Creation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String name = "";
		int counter = 0;
		int number_holder = 0;
		boolean checker = false;
		 {
		        try
		        {
		  
		            SimpleAudioPlayer audioPlayer = 
		                            new SimpleAudioPlayer("C:\\Codename_Game\\Main_Game\\Personality Test Mystery Dungeon.wav");
		        	audioPlayer.play();
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
		    		audioPlayer.setMusic("C:\\Codename_Game\\Main_Game\\009 - Guildmaster Wigglytuff - (Pokémon Mystery Dungeon - Explorers of Sky).wav");
		    		audioPlayer.play();
		    		text_manager(65, "The better question is, who cares if you're ready!?");
		    		text_manager(1000);
		    		System.out.println("Let the questions begin!");
		    		text_manager(1000);
		    		text_manager(65, "You find it difficult to introduce yourself to other people.");
		    		System.out.println("1. Yes, most definitely.");
		    		System.out.println("3. Depends on the scenario.");
		    		System.out.println("5. No, I usually do well regardless.");
		    		System.out.println("Enter 1, 3, or 5: ");
		    		while(checker == false) {
		    			number_holder = reader.nextInt();
		    			if(number_holder == 1 || number_holder == 3 || number_holder == 5) {
		    				checker = true;
		    			}
		    			else {
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
		    		while(checker == false) {
		    			number_holder = reader.nextInt();
		    			if(number_holder == 1 || number_holder == 3 || number_holder == 5) {
		    				checker = true;
		    			}
		    			else {
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
		    		while(checker == false) {
		    			number_holder = reader.nextInt();
		    			if(number_holder == 1 || number_holder == 3 || number_holder == 5) {
		    				checker = true;
		    			}
		    			else {
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
		    		while(checker == false) {
		    			number_holder = reader.nextInt();
		    			if(number_holder == 1 || number_holder == 3 || number_holder == 5) {
		    				checker = true;
		    			}
		    			else {
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
		    		while(checker == false) {
		    			number_holder = reader.nextInt();
		    			if(number_holder == 1 || number_holder == 3 || number_holder == 5) {
		    				checker = true;
		    			}
		    			else {
		    				System.out.println("Enter 1, 3, or 5: ");
		    			}
		    		}
		    		counter = counter + number_holder;
		    		text_manager(65, "Alright. One more thing, what is your name?");
		    		// This does not take output for some reason, check in with Mr Joyal.
		    		name = reader.nextLine();
		    		if(counter >= 5 && counter <=  11) {
		    			Titan user_character = new Titan(name);
		    			user_character.setName(name);
		    			text_manager(65, "Congratulations " + user_character.getName() + "You are a Titan.");
		    			text_manager(65, "Titans are known for their defense and being intellectual fighters.");
		    			
		    		}
		    		if(counter >= 19 && counter <=  25) {
		    		Rogue user_character = new Rogue(name);
		    		user_character.setName(name);
		    		text_manager(65, "Congratulations " + user_character.getName() + "You are a Rogue.");
		    		text_manager(65, "Rogues are known for using their speed and quickness to get the job done.");
		    		}
		    		if(counter >= 12 && counter <= 18) {
		    			Brawler user_character = new Brawler(name);
		    			user_character.setName(name);
		    			text_manager(65, "Congratulations " + user_character.getName() + "You are a Rogue.");
		    			text_manager(65, "Brawlers are known for their power and overall abilities.");
		    			
		    		}
		    		reader.close();
		    		audioPlayer.stop();
		        }
		        
		        catch (Exception ex) 
	            {
	                System.out.println("Error with playing sound.");
	                ex.printStackTrace();
	             
	              }
		 }

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
					//System.out.println(startTime);
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
}