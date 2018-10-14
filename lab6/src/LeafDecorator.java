package lab6;

public abstract class LeafDecorator extends Leaf {

   public LeafDecorator( String description ) {
       super( description) ;
    }

    abstract public void setOptions( String[] options ) ; 
    abstract public String getDescription() ;
        
    @Override
    public void printOrderDescription() {
        System.out.println(getDescription() ) ;
    }
    
    
}

