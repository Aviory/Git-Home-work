package collection;

import java.util.ArrayList;
import java.util.Random;



//import

public class Main {
	private static ArrayList <Mob> mobiles = new ArrayList<Mob>();
	private static Random r = new Random();

	public static void main(String[] args) {
		for (int i=0;i<300;i++){
			mobiles.add(new Mob(r.nextInt(999999), "safasf"));
			
			
		}
		for (Mob m: mobiles){
			System.out.println(m.getNumber()+" "+m.getName());
		}
	}

}
