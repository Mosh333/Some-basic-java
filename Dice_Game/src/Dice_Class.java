import java.util.Random;

public class Dice_Class {

	String player_name;
	int[] current_num = new int[2];
	int[] player_roll_history = new int[42];
	int player_roll_history_size;
	Random rn = new Random();

	
	public Dice_Class(String player_name){
		this.player_name = player_name;
		this.current_num = new int[2];
		this.player_roll_history_size = 0;
	}
	
	public void roll_dice() {
		int result1 = this.rn.nextInt(6 - 1 + 1) + 1;
		int result2 = this.rn.nextInt(6 - 1 + 1) + 1;
		System.out.println(result1 + " and " + result2);
		this.current_num[0] = result1;
		this.current_num[1] = result2;
		this.player_roll_history[this.player_roll_history_size] = result1;
		this.player_roll_history[this.player_roll_history_size+1] = result2;
		this.player_roll_history_size = this.player_roll_history_size + 2;
	}
}
