package de.tom.vektorlib;

public class VektorLib {

	public static void main(String[] args) {
		
		Vektor unten = new Vektor(0, 0 , 0);
		Vektor oben = new Vektor(2, 2 , 2);

		for(int x = unten.getX(); x <= oben.getX(); x++) {
			for(int y = unten.getY(); y <= oben.getY(); y++) {
				for(int z = unten.getZ(); z <= oben.getZ(); z++) {
					System.out.println(x + ";" + y + ";"+ z);
				}	
			}	
		}
		
	}
	
}
