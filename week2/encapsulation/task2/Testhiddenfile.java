package encapsulation;

public class Testhiddenfile {

	public static void main(String[] args) {
		
	File doc = new File();
	doc.sethiddenfile("Document");
	doc.gethiddenfile();
	System.out.println(doc.gethiddenfile());
	
	


	}

}
