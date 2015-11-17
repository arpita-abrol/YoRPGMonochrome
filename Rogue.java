//Monochrome--Arpita Abrol, Shamaul Dilmohamed, Anna Tolen
//APCS1 pd10
//HW30 -- Ye Olde Role Playing Game, Expanded
//2015-11-15

public class Rogue extends Character{

    // methods
    // constructors
    public Rogue() {
        setName("Riley of Swiftneck"); //random names yay
        setHP( (int)((Math.random() * 100) + 50 )); // [50,150)
        setStrength( (int)((Math.random() * 100) + 55 )); // [55,155)
        setDefense( (int)((Math.random() * 20) + 10 )); // [10,30)
        setAR( Math.random() + .1); // random probability for landing hits [.01, 1.1)
        setSpatt((int) ((Math.random() * 7) + 1)); // [1, 8)
    }
    public Rogue( String n ) {
        this();
        setName(n);
    }
    public Rogue(String n, int h, int s, int d, double a) {
        this(n);
        setHP(h);
        setStrength(s);
        setDefense(d);
        setAR(a);
    }

    public String about() {
	String retStr = "";
	retStr += "ROGUE :\tRogues are stealthy and versatile, capable of acquiring valuable resources at a moment's notice. They are very crude and will take any means necessary to get their goal. \n";
	return retStr;
    }

    public void specialize() {
    	setStrength( strength + spatt );
	setDefense( defense - spatt );
	if (Math.random() < .5) {
	    setHP( hp + 5 );   //special powerup
	}
    }

    public  void normalize() {
	setStrength( strength - spatt );
	setDefense( defense + spatt );
    }

}
