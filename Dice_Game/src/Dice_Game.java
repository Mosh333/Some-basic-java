import java.io.InputStream;
import java.util.Scanner;

public class Dice_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner game_scanner = new Scanner( System.in );
		Player_Class compare1;
		Player_Class compare2;
		int[] score_order_num = new int[3];
		String[] score_order_name = new String[3];
		//Create four players:
		System.out.print( "Welcome Player A, please roll your dice! (Hit Enter): " );
		String input = game_scanner.nextLine();
		Player_Class player_a = new Player_Class("player_a");
		//player_a.roll_dice();
		System.out.print( "Welcome Player B, please roll your dice! (Hit Enter): " );
		input = game_scanner.nextLine();
		Player_Class player_b = new Player_Class("player_b");
		//player_b.roll_dice();
		System.out.print( "Welcome Player C, please roll your dice! (Hit Enter): " );
		input = game_scanner.nextLine();
		Player_Class player_c = new Player_Class("player_c");
		//player_c.roll_dice();
		System.out.print( "Welcome Player D, please roll your dice! (Hit Enter): " );
		input = game_scanner.nextLine();
		Player_Class player_d = new Player_Class("player_d");
		//player_d.roll_dice();
		//Main Game loop
		//We will simply automate the simulation
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("**************** Starting Game Now ***********************");
		for(int i=0; i<20; i++) {
			System.out.print( "Player A's turn, Hit Enter to roll your dice: " );
			input = game_scanner.nextLine();
			player_a.roll_dice();
			System.out.print( "Player B's turn, Hit Enter to roll your dice: " );
			input = game_scanner.nextLine();
			player_b.roll_dice();
			System.out.print( "Player C's turn, Hit Enter to roll your dice: " );
			input = game_scanner.nextLine();
			player_c.roll_dice();
			System.out.print( "Player D's turn, Hit Enter to roll your dice: " );
			input = game_scanner.nextLine();
			player_d.roll_dice();
			
			if(i == 19) {
				player_a.total_pts_accum -= (player_a.my_dice.player_roll_history[0] + player_a.my_dice.player_roll_history[1]);
				player_b.total_pts_accum -= (player_b.my_dice.player_roll_history[0] + player_b.my_dice.player_roll_history[1]);
				player_c.total_pts_accum -= (player_c.my_dice.player_roll_history[0] + player_c.my_dice.player_roll_history[1]);
				player_d.total_pts_accum -= (player_d.my_dice.player_roll_history[0] + player_d.my_dice.player_roll_history[1]);
				
				if(player_a.total_pts_accum > player_b.total_pts_accum) {
					compare1 = player_a;
//					score_order_num[3] = player_b.total_pts_accum; if you wanted to sort it
//					score_order_name[3] = player_b.player_name;
//					score_order_num[0] = player_a.total_pts_accum;
//					score_order_name[0] = player_a.player_name;
				}else {
					compare1 = player_b;
//					score_order_num[3] = player_a.total_pts_accum;
//					score_order_name[3] = player_a.player_name;
//					score_order_num[0] = player_b.total_pts_accum;
//					score_order_name[0] = player_b.player_name;
				}
				
				if(player_c.total_pts_accum > player_d.total_pts_accum) {
					compare2 = player_c;
//					score_order_num[3] = player_b.total_pts_accum;
//					score_order_name[3] = player_b.player_name;
				}else {
					compare2 = player_d;
//					score_order_num[3] = player_b.total_pts_accum;
//					score_order_name[3] = player_b.player_name;
				}
				
				if(compare1.total_pts_accum > compare2.total_pts_accum) {
					System.out.println("The winner is: "+compare1.player_name);
				}else {
					System.out.println("The winner is: "+compare2.player_name);
				}
				
				System.out.println("The Scoreboard (unsorted): ");
				System.out.println(player_a.player_name+ "'s score: "+ player_a.total_pts_accum);
				System.out.println(player_b.player_name+ "'s score: "+ player_b.total_pts_accum);
				System.out.println(player_c.player_name+ "'s score: "+ player_c.total_pts_accum);
				System.out.println(player_d.player_name+ "'s score: "+ player_d.total_pts_accum);
						
			}
		}
		/*while(true) {
			
			System.out.print( "Type some data for the program: " );
			input = game_scanner.nextLine();
			System.out.println( "input = " + input );
			game_turn++;
			if(game_turn == 20) {
				break;
			}
		}*/

	}

}
