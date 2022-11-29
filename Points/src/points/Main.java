package points;

public class Main {

	public static void main(String[] args) {
		
Points firstOne= new Points();
firstOne.setX(3);	
firstOne.setY(4);
firstOne.translate(1,3);
firstOne.scale(2);

	System.out.println("x= "+firstOne.getX()+" y= "+firstOne.getY());
	}

}
