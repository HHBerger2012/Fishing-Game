import java.util.ArrayList;
import java.util.Scanner;
public class FishingGame
	{
		static String username;
		String castRod;
		String difficultyChoice;
		static String area;
		static int sum = 0;
		static int cast = 0;
		static int areaFish = 0;
		static int fishDefense;
		static int rodStrength = 50;
		static ArrayList<FishingGameStats>listOfFish;
		public static void main(String[] args)
			{
				doGreeting();
				createFish();
				inputUserName();
				decideArea();
				teachFishing();
				castRod();
			}
		public static void getHawaiiFish()
		{
			for (int i = 0; i<listOfFish.size(); i++)
				{
					fishDefense = (int)(Math.random()*65); 
					listOfFish.get(i).setDefense(fishDefense);
				}
			int rand1 = (int)(Math.random()*listOfFish.size());
			if (listOfFish.get(rand1).getOrigin() != "Hawaii")
				{
					getHawaiiFish();
				}
			else
				{
					if (fishDefense>rodStrength)
						{
							System.out.println("The Fish was too strong! It broke your line...");
							castRod();
						}
					else 
						{
					sum = sum + 1;
					if (sum == 5||sum== 10||sum==15||sum==20||sum==25||sum==30)
						{
							rodStrength = rodStrength + 3;
						}
					System.out.println("You caught a " + listOfFish.get(rand1).getSpecialty() + " " + listOfFish.get(rand1).getName() + " with a defense of level " + listOfFish.get(rand1).getDefense() + "");
					System.out.println();
					System.out.println("You have caught " + sum + " fish today so far!!");
					System.out.println();
					System.out.println("Your Rod Strength is " + rodStrength);
					System.out.println();
					System.out.println("Cast Again to get more fish");
						}
				}
			castRod();
		}
		public static void getAmazonFish()
		{	
			
			
			
			for (int i = 0; i<listOfFish.size(); i++)
				{
					fishDefense = (int)(Math.random()*55); 
					listOfFish.get(i).setDefense(fishDefense);
				}
			int rand2 = (int)(Math.random()*listOfFish.size());
				if (listOfFish.get(rand2).getOrigin() != "The Amazon River")
					{
						getAmazonFish();
					}
				else
					{
						if (fishDefense>rodStrength)
							{
								System.out.println("The Fish was too strong! It broke your line...");
								castRod();
							}
								else
									{
						sum = sum + 1;
						if (sum == 5||sum==10||sum==15||sum==20)
							{
								rodStrength = rodStrength + 3;
							}
						System.out.println("You caught a " + listOfFish.get(rand2).getSpecialty() + " " + listOfFish.get(rand2).getName() + " with a defense of level " + listOfFish.get(rand2).getDefense() + "");
						System.out.println();
						System.out.println("You have caught " + sum + " fish today so far!!");
						System.out.println();
						System.out.println("Your Rod Strength is " + rodStrength);
						System.out.println();
						System.out.println("Cast Again to get more fish!!");
							}
					}
				castRod();
			}
		public static void getReefFish()
			{
				for (int i = 0; i<listOfFish.size(); i++)
					{
						fishDefense = (int)(Math.random()*75); 
						listOfFish.get(i).setDefense(fishDefense);
					}
				int rand3 = (int)(Math.random()*listOfFish.size());
				if (listOfFish.get(rand3).getOrigin() != "The Great Barrier Reef")
					{
						getReefFish();
					}
				else
					{
						if (fishDefense>rodStrength)
							{
								System.out.println("The Fish was too strong! It broke your line...");
								castRod();	
							}
						else
							{
						sum = sum + 1;
						if (sum == 5||sum==10||sum==15||sum==20)
							{
								rodStrength = rodStrength + 3;
							}
						System.out.println("You caught a " + listOfFish.get(rand3).getSpecialty() + " " + listOfFish.get(rand3).getName() + " with a defense of level " + listOfFish.get(rand3).getDefense() + "");
						System.out.println();
						System.out.println("You have caught " + sum + " fish today so far!!");
						System.out.println();
						System.out.println("Your Rod Strength is " + rodStrength);
						System.out.println();
						System.out.println("Cast Again to get more fish!!");
							}
					} 
				castRod();
			}
		public static void doGreeting()
		{
			System.out.println("                                   _...----.");
			System.out.println("                       _,      _,-'_...--'`/");
			System.out.println("                     ,^__\\__ ,'  ,'     /(");
			System.out.println("                 _,.'  |  | `-._;        \\/");
			System.out.println("              ,-'  |  /  /   \\  \\-.     \\");
			System.out.println("            ,'   \\  \\   \\ < /  <  \\    ,:");
			System.out.println("           /     | <   `.\\  >  /   \\ ,' |    _,-'/");
			System.out.println("          /      /  \\       \\ \\   \\/ _; ,-'   ;");
			System.out.println("         /       `.  \\      /   \\  /`<__,' \\  /|");
			System.out.println("        ; (O)      > |     >   <   \\ \\`^.  /   :|");
			System.out.println("       /         :\\ |_.--. <    ,`  / /  (  >   :|");
			System.out.println("       >)        ;/,='   `.\\ \\ |  / / __/  \\  ;|");
			System.out.println("       \\     ,' |)     ,'/ /   |  ) |/-.`. /  \\|");
			System.out.println("        `.   ,'   | `--=='`  >   |  `./`-.\\`-._  :");
			System.out.println("          `.      / /        \\  \\  ;`.__/     `-.\\");
			System.out.println("            `-._  \\ |_      :   < _;    <      ");
			System.out.println("                ``'.:``-._____\\_,-'-..___,\\");
			System.out.println("                    \\`.|`._\\ `--..__     `._");
			System.out.println("                     `-'             `````````");
			System.out.println("");
			System.out.println("=================================");
			System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("|~~~WELCOME TO FISHING FIESTA~~~|");
			System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
			System.out.println("=================================");
			System.out.println();
			System.out.println("What is the username you would like to use?!");
	}
		public static void createFish()
		{
			listOfFish = new ArrayList<FishingGameStats>();
			listOfFish.add(new FishingGameStats("Piranha","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Piranha","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Piranha","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Piranha","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Piranha","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Piranha","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Sting Ray","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Sting Ray","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Sting Ray","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Sting Ray","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Sting Ray","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Sting Ray","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Alligator Gar","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Alligator Gar","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Alligator Gar","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Alligator Gar","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Alligator Gar","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Alligator Gar","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Redtail Catfish","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Redtail Catfish","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Redtail Catfish","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Redtail Catfish","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Redtail Catfish","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Redtail Catfish","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Needle Jaw","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Needle Jaw","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Needle Jaw","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Needle Jaw","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Needle Jaw","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Needle Jaw","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Peacock Bass","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Peacock Bass","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Peacock Bass","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Peacock Bass","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Peacock Bass","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Peacock Bass","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Aruana","The Amazon River",0, "Fire"));
			listOfFish.add(new FishingGameStats("Aruana","The Amazon River",0, "Ice"));
			listOfFish.add(new FishingGameStats("Aruana","The Amazon River",0, "Electric"));
			listOfFish.add(new FishingGameStats("Aruana","The Amazon River",0, "Dark"));
			listOfFish.add(new FishingGameStats("Aruana","The Amazon River",0, "Light"));
			listOfFish.add(new FishingGameStats("Aruana","The Amazon River",0, ""));
			listOfFish.add(new FishingGameStats("Great White Shark","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Great White Shark","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Great White Shark","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Great White Shark","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Great White Shark","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Great White Shark","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Clownfish","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Clownfish","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Clownfish","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Clownfish","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Clownfish","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Clownfish","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Hammerhead Shark","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Hammerhead Shark","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Hammerhead Shark","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Hammerhead Shark","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Hammerhead Shark","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Hammerhead Shark","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Blue Whale","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Blue Whale","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Blue Whale","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Blue Whale","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Blue Whale","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Blue Whale","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Angel Fish","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Angel Fish","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Angel Fish","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Angel Fish","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Angel Fish","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Angel Fish","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Parrot Fish","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Parrot Fish","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Parrot Fish","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Parrot Fish","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Parrot Fish","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Parrot Fish","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Trout","The Great Barrier Reef",0, "Fire"));
			listOfFish.add(new FishingGameStats("Trout","The Great Barrier Reef",0, "Ice"));
			listOfFish.add(new FishingGameStats("Trout","The Great Barrier Reef",0, "Electric"));
			listOfFish.add(new FishingGameStats("Trout","The Great Barrier Reef",0, "Dark"));
			listOfFish.add(new FishingGameStats("Trout","The Great Barrier Reef",0, "Light"));
			listOfFish.add(new FishingGameStats("Trout","The Great Barrier Reef",0, ""));
			listOfFish.add(new FishingGameStats("Pufferfish","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Pufferfish","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Pufferfish","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Pufferfish","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Pufferfish","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Pufferfish","Hawaii",0, ""));
			listOfFish.add(new FishingGameStats("Blue Tang Fish","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Blue Tang Fish","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Blue Tang Fish","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Blue Tang Fish","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Blue Tang Fish","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Blue Tang Fish","Hawaii",0, ""));
			listOfFish.add(new FishingGameStats("Electric Eel","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Electric Eel","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Electric Eel","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Electric Eel","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Electric Eel","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Electric Eel","Hawaii",0, ""));
			listOfFish.add(new FishingGameStats("Sea Turtle","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Sea Turtle","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Sea Turtle","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Sea Turtle","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Sea Turtle","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Sea Turtle","Hawaii",0, ""));
			listOfFish.add(new FishingGameStats("Hawaiin Bigeye","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Hawaiin Bigeye","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Hawaiin Bigeye","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Hawaiin Bigeye","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Hawaiin Bigeye","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Hawaiin Bigeye","Hawaii",0, ""));
			listOfFish.add(new FishingGameStats("Hawaiin Filefish","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Hawaiin Filefish","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Hawaiin Filefish","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Hawaiin Filefish","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Hawaiin Filefish","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Hawaiin Filefish","Hawaii",0, ""));
			listOfFish.add(new FishingGameStats("Grouper","Hawaii",0, "Fire"));
			listOfFish.add(new FishingGameStats("Grouper","Hawaii",0, "Ice"));
			listOfFish.add(new FishingGameStats("Grouper","Hawaii",0, "Electric"));
			listOfFish.add(new FishingGameStats("Grouper","Hawaii",0, "Dark"));
			listOfFish.add(new FishingGameStats("Grouper","Hawaii",0, "Light"));
			listOfFish.add(new FishingGameStats("Grouper","Hawaii",0, ""));
		}
		public static void inputUserName()
		{
			Scanner userInput = new Scanner(System.in);
			String username = userInput.nextLine();
			System.out.println("Alright " + username + " Now the real question is... Where would you like to fish? Type the letter of the area!");
		}
		public static void decideArea()
		{
			System.out.println();
			System.out.println("(A) The Amazon River (Easiest Difficulty)");
			System.out.println("(B) Hawaii (Medium Difficulty)");
			System.out.println("(C) The Great Barrier Reef (Hardest Difficulty)");
			Scanner userInput3 = new Scanner(System.in);
			String area = userInput3.nextLine();
			switch(area)
			{   
				case "a":
				case "A":
							areaFish = 1;
							System.out.println("The Amazing River eh? Not too difficult but watch out for the Pirhanas!!!");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println(".");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("..");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("...");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("....");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println(".....");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("......");
							try
								{
									Thread.sleep(2000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("                  ~;");
							System.out.println("                  ,/|\\");
							System.out.println("                ,/' | \\ ,");
							System.out.println("              ,/'   | |\\ ");
							System.out.println("            ,/'     | |   |");
							System.out.println("          ,/'       |    |");
							System.out.println("        ,/__________|-----' ,");
							System.out.println("       ___.....-----''-----/");
							System.out.println("       \\                  /");
							System.out.println("  ~~-~^~^~`~^~`~^^~^~-^~^~^~-~^~^");
							System.out.println("    ~-^~^-`~^~-^~^`^~^-^~^`^~^-~^");
							System.out.println("");
							System.out.println("We've arived at the Amazon River... Now let's learn how to fish!");
							break;
				case "b":
				case "B":
						{
							areaFish = 2;
							System.out.println("Probably the most beautiful place to go fishing! Let's go!!!");
							System.out.println(".");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("..");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("...");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("....");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println(".....");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("......");
							try
								{
									Thread.sleep(2000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("                  ~;");
							System.out.println("                  ,/|`");
							System.out.println("                ,/' | ` ,");
							System.out.println("              ,/'   | | ` ");
							System.out.println("            ,/'     | |   |");
							System.out.println("          ,/'       |    |");
							System.out.println("        ,/__________|-----' ,");
							System.out.println("       ___.....-----''-----/");
							System.out.println("       `                  /");
							System.out.println("  ~~-~^~^~`~^~`~^^~^~-^~^~^~-~^~^");
							System.out.println("    ~-^~^-`~^~-^~^`^~^-^~^`^~^-~^");
							System.out.println("");
							System.out.println("We've arived at Hawaii... Now let's learn how to fish!");
							break;
						}
				case "c":
				case "C":
						{
							areaFish = 3;
							System.out.println("The fish here are real big! Prepare yourself...");
							System.out.println(".");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("..");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("...");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("....");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println(".....");
							try
								{
									Thread.sleep(1000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("......");
							try
								{
									Thread.sleep(2000);
								} catch (InterruptedException e)
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							System.out.println("                  ~;");
							System.out.println("                  ,/|`");
							System.out.println("                ,/' | ` ,");
							System.out.println("              ,/'   | | ` ");
							System.out.println("            ,/'     | |   |");
							System.out.println("          ,/'       |    |");
							System.out.println("        ,/__________|-----' ,");
							System.out.println("       ___.....-----''-----/");
							System.out.println("       `                  /");
							System.out.println("  ~~-~^~^~`~^~`~^^~^~-^~^~^~-~^~^");
							System.out.println("    ~-^~^-`~^~-^~^`^~^-^~^`^~^-~^");
							System.out.println("");
							System.out.println("We've arived at the Great Barrier Reef... Now let's learn how to fish!");
							break;
						}
						default:
						{
							System.out.println("    _   __      __     ___    ____                       __");
							System.out.println("   / | / /___  / /_   /   |  / / /___ _      _____  ____/ /");
							System.out.println("  /  |/ / __\\/ __/  / \\/| / / / __ \\| /| / / _ \\/__  / ");
							System.out.println(" / /|  / /_/ / /_   / ___ |/ / / /_/ / |/ |/ /  __/ /_/ /  ");
							System.out.println("/_/ |_/\\___/\\_/  /_/  |_/_/_/\\___/|__/|__/\\__/\\_,_/   ");
							System.out.println();
							System.out.println("Please only input A or B or C");
							decideArea();
						}
			}
		}			
		public static void teachFishing()
		{
			try
				{
					Thread.sleep(1500);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println();
			System.out.println("Now... to cast your rod, press the space bar then the enter key! Try it out now");
			try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Then once you cast, you have to wait for a fish to bite your line!");
			System.out.println();
			System.out.println("Also, your Rod Strength is 50, if a Fish's defense is greater than 50, it will break your line...");
			System.out.println();
			System.out.println("Every 5 fish you catch will strengthen your Rod by 3 points!");
		}
		public static void castRod()
		{
			Scanner userInput4 = new Scanner(System.in);
			String rodCast = userInput4.nextLine();
			if (areaFish == 1)
			{
				switch (rodCast)
				{
							case " ":
									{
										if (rodCast != " ")
											{
												System.out.println("    _   __      __     ___    ____                       __");
												System.out.println("   / | / /___  / /_   /   |  / / /___ _      _____  ____/ /");
												System.out.println("  /  |/ / __\\/ __/  / \\/| / / / __ \\| /| / / _ \\/__  / ");
												System.out.println(" / /|  / /_/ / /_   / ___ |/ / / /_/ / |/ |/ /  __/ /_/ /  ");
												System.out.println("/_/ |_/\\___/\\_/  /_/  |_/_/_/\\___/|__/|__/\\__/\\_,_/   ");
												System.out.println();
												System.out.println("You need to type the Space Bar then Enter Key to cast...");
												castRod();
											}
										System.out.println(".");
										try
											{
												Thread.sleep(1000);
											} catch (InterruptedException e)
											{
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										System.out.println("..");
										try
											{
												Thread.sleep(1000);
											} catch (InterruptedException e)
											{
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										System.out.println("...");
										try
											{
												Thread.sleep(1000);
											} catch (InterruptedException e)
											{
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										System.out.println("....");
										try
											{
												Thread.sleep(800);
											} catch (InterruptedException e)
											{
												// TODO Auto-generated catch block
												e.printStackTrace();
											}
										cast = (int)(Math.random()*8+1);
									
										if (cast <= 7)
											{
												System.out.println("A Bite!");
												getAmazonFish();
													}
										else 
											{
												System.out.println("No bite on that line... Cast again");
												castRod();
											}
									}
						}
			}
			if (areaFish == 2)
				{
					switch (rodCast)
					{
								case " ":
										{
											System.out.println(".");
											try
												{
													Thread.sleep(1000);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											System.out.println("..");
											try
												{
													Thread.sleep(1000);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											System.out.println("...");
											try
												{
													Thread.sleep(1000);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											System.out.println("....");
											try
												{
													Thread.sleep(800);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											cast = (int)(Math.random()*8+1);
											
											if (cast <= 7)
												{
													System.out.println("A Bite!");
													getHawaiiFish();	
												}
											else 
												{
													System.out.println("No bite on that line... Cast again");
													castRod();
												}	
										}
							}
				}
			if (areaFish == 3)
				{
					switch (rodCast)
					{
								case " ":
										{
											System.out.println(".");
											try
												{
													Thread.sleep(1000);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											System.out.println("..");
											try
												{
													Thread.sleep(1000);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											System.out.println("...");
											try
												{
													Thread.sleep(1000);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											System.out.println("....");
											try
												{
													Thread.sleep(800);
												} catch (InterruptedException e)
												{
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											cast = (int)(Math.random()*8+1);
											
											if (cast <= 7)
												{
													System.out.println("A Bite!");
													getReefFish();
												}
											else 
												{
													System.out.println("No bite on that line... Cast again");
													castRod();
												}	
										}
							}
				}
		}
	}