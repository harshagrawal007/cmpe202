public class CreditCardExpDecorator implements IDecorator {

	
	/**
	 * function to added set logic for formating string
	 * @return String which is formatted
	 */
	public String setFormatting(String date){
		String cardExp="";
		for(int i=0;i<date.length();i++){
			if(i==2){
				cardExp+="/"+ date.charAt(i);
			}else{
				cardExp+= date.charAt(i);
			}
		}
		return cardExp;
	}
}