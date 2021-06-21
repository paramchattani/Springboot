package firstproject;
class position{
	int x,y;
	Piece p;
	public position(int x,int y,Piece p) {
		this.x=x;
		this.y=y;
		this.p=p;
	}
	public void getName() {
System.out.println(	""+p.name());
	}
}
abstract class Piece{
	public abstract String name();
}
class Rook extends Piece {
	public String name() {
		return "rook";
	}
}

class Pawn extends Piece{
	public String name() {
		return "Pawn";
	}
}

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piece rook=new Rook();
		Piece pawn=new Pawn();
		position p[][]=new position[8][8];
				
		p[0][0]=new position(0,0,rook);
		p[0][1]=new position(0,1,pawn);
		
		p[0][0].getName();
	}

}
