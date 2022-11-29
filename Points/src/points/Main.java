package points;

public class Main {

	public static void main(String[] args) {
		
Points firstOne= new Points();
firstOne.setX(3);	
firstOne.setY(4);
firstOne.translate();
firstOne.scale();

	System.out.println("x= "+firstOne.getX()+" y= "+firstOne.getY());
	}

}
