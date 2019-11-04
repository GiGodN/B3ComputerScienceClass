package module3.RPS;

import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner key = new Scanner(System.in);
		boolean replay = true;
		while(replay) {
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			String pI = key.nextLine();
			pI = pI.strip();
			String cI;
			switch(r.nextInt(3)) {
			case(0) : 
				cI = "R";
				break;
			case(1) : 
				cI = "P";
				break;
			case(2) :
				cI = "S";
				break;
			default :
				cI = "R";
				break;
			}
			System.out.println("player had " + pI);
			System.out.println("computer had " + cI);
			if((pI.equals("R") && cI.equals("S")) || (pI.equals("S") && cI.equals("P")) || (pI.equals("P") && cI.equals("R"))) {
				if(pI.equals("R")) System.out.println("!Player wins <<Rock Breaks Scissors>>!");
				else if(pI.equals("p")) System.out.println("!Player wins <<Paper Covers Rock>>!");
				else if(pI.equals("s")) System.out.println("!Player wins <<Scissors Cuts Paper>>!");
			}
			else if (pI.equals(cI)) {
				System.out.println("!Draw Game!");
			}
			else {
				if(cI.equals("R")) System.out.println("!Computer wins <<Rock Breaks Scissors>>!");
				else if(cI.equals("P")) System.out.println("!Computer wins <<Paper Covers Rock>>!");
				else if(cI.equals("S")) System.out.println("!Computer wins <<Scissors Cuts Paper>>!");
			}
			System.out.print("Do you want to play again? ");
			if(!key.nextLine().strip().equals("y")) replay = false;
		}
	}

}
