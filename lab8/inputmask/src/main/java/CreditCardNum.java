/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private IDecorator wrapper = null;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
	}
	
	public void wrapDecorator(IDecorator w) {
		this.wrapper = w;
	}

	public String display() {
		if ( number.equals("") )
			return "[1111 1111 1111 1111]" + "  " ;
		else
			return "[" + wrapper.setFormatting(number) + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			ch = ch.trim();
			if (!ch.equals("x") && !ch.equals("X")) {
				number += ch;
			} else if (number.length() > 0) {
				number = number.substring(0, number.length() - 1);
			}
		}
		else if ( nextHandler != null ){
			nextHandler.key(ch, cnt) ;
		}
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}