import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	
	//The colors
	ArrayList<Color> C =new ArrayList<Color>();
	int color; //2: snake , 1: food, 0:empty 
	SquarePanel square;
	public DataOfSquare(int col){
		
		
		C.add(Color.darkGray);
		C.add(Color.RED);    
		C.add(Color.white);   
		color=col;
		square = new SquarePanel(C.get(color));
	}
	public void lightMeUp(int c){
		square.ChangeColor(C.get(c));
	}
}
