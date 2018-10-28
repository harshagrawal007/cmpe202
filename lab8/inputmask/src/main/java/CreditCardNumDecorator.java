
public class CreditCardNumDecorator implements IDecorator {

	
	
	int count=0;
	String digits="";
	public String setFormatting( String card){
		String cardNumber="";
		for(int i=0;i<card.length();i++){
			if(i==4 || i==8 || i==12){
				cardNumber+=" "+ card.charAt(i);
			}else{
				cardNumber+= card.charAt(i);
			}
		}
		return cardNumber;
	}
}