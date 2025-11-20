package nov19;
public class OMRKing {
	public static void main(String[] args) {
		Father f= new Father();
		f.oldBike();	
	}
}
class GrandFather{
	void OldBike(){
		System.out.println("Royal Enfield 1983");
	}
}

class Father extends GrandFather{
	void oldBike(){
		super.OldBike();
		System.out.println("Royal Enfield 2002");
	}
}




