package lab6;

public class TopBun extends LeafDecorator
{
    private String[] toppings ;
    
    
    public TopBun( String description )
    {
        super(description) ;
    }
    
    public void setOptions( String[] toppings )
    {
        this.toppings = toppings ;
    }
    
    public String getDescription() 
    {
        StringBuilder description = new StringBuilder();
        
        for ( int i = 0; i<toppings.length; i++ )
        {
        	description.append("  ");
        	description.append(toppings[i]);
            if(i<toppings.length-1)
            	description.append("\n");
        }        
        return description.toString() ;
    }
    
}