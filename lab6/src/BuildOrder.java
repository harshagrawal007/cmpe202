package lab6;

public class BuildOrder {

  public static IBurgerComponent getOrder()
  {
      Composite order = new Composite( "Order" ) ;

      Burger burger = new Burger( "LBB",5.59) ;
      
      TopBun topBun = new TopBun( "Top Options" ) ;
      
      Leaf leaf= new  Leaf("LTL CAJ",2.79);
      String[] topBunToping = { "LETTUCE","TOMATO" } ;
      topBun.setOptions( topBunToping ) ;
      
      Meat burgermeat = new Meat( "Meat Topping Options" ) ;
      String[] meatOptions = { "G ONION","JALA Grilled" } ;
      burgermeat.setOptions( meatOptions ) ;
      
      Patty patty = new Patty( "Patty Options" ) ;
      String[] pattyOptions = { "BACON" } ;
      patty.setOptions( pattyOptions ) ;
      
      // Setup Burger Ingredients
      burger.addChildComponent( topBun ) ;
      burger.addChildComponent( burgermeat ) ;
      burger.addChildComponent( patty ) ;
            
      // Add Burger to the Order
      order.addChildComponent( burger );
      order.addChildComponent(leaf);
      return order ;
  }

}
