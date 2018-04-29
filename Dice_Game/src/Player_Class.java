
public class Player_Class {
	
	String player_name;
	private int player_type;
	int total_pts_accum;
	Dice_Class my_dice = new Dice_Class(this.player_name);
	
	public Player_Class(String player_name){
		this.player_name = player_name;
		total_pts_accum = 0;
		this.roll_dice();	//roll dice to determine player type
		//odd or even
		if((my_dice.current_num[0] + my_dice.current_num[1])%2 == 0) {
			this.player_type = 2; //even
		}else if((my_dice.current_num[0] + my_dice.current_num[1])%2 == 1) {
			this.player_type = 1; //odd
		}
	}
	
	public void roll_dice() {
		int roll_sum;
		System.out.print(this.player_name + " rolled: ");
		my_dice.roll_dice();
		roll_sum = my_dice.current_num[0] + my_dice.current_num[1];
		if(player_type == 1) {
			if(roll_sum == 5 || roll_sum == 7 || roll_sum == 11) {
				this.total_pts_accum += roll_sum;
			}
		}else if(player_type == 2) {
			if(roll_sum == 3 || roll_sum == 9 || roll_sum == 12) {
				this.total_pts_accum += roll_sum;
			}
		}
	}
	
}
