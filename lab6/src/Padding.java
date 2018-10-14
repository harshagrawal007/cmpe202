package lab6;

public class Padding {
	 
    public static String padding(int noOfPads) {
    	
    	StringBuffer padspaces = new StringBuffer();
        for ( int padspacescounter = 0; padspacescounter<noOfPads; padspacescounter++ )
        	padspaces.append(" ");           
        return padspaces.toString() ;     
    }  
}
