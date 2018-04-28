import java.io.InputStream;
import java.util.Scanner;

public class Test_Dice_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner game_scanner = new Scanner( System.in );
		int game_turn = 0;
		//Create four players:
		System.out.print( "Welcome Player A, please roll your dice! (Hit Enter): " );
		String input = game_scanner.nextLine();
		Player_Class player_a = new Player_Class();
		System.out.print( "Welcome Player B, please roll your dice! (Hit Enter): " );
		String input = game_scanner.nextLine();
		Player_Class player_b = new Player_Class();
		Player_Class player_c = new Player_Class();
		Player_Class player_d = new Player_Class();
		//Main Game loop
		while(true) {
			
			System.out.print( "Type some data for the program: " );
			input = game_scanner.nextLine();
			System.out.println( "input = " + input );
			game_turn++;
			if(game_turn == 20) {
				break;
			}
		}

	}

}
