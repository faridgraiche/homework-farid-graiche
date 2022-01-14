package enheritance;

public class TestMouse {

	public static void main(String[] args) {
		
		Mouse1 M1 = new Mouse1();
		M1.model("apple");
		M1.color("grey");
		M1.rightClick();
	
		
		
		
		Mouse2 M2 =  new Mouse2();
		M2.color("black");
		M2.model("sumsung");
		M2.leftClick();
		M2.rightClick();
	}

}
