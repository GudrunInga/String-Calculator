package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){	
			return 0;
		}
		else if(text.contains(",") || text.contains("\n")){
			String[] numbers = splitNumbers(text);
			int total = 0;
			for(String number : numbers)
			{
				if(toInt(number) > 1000)
				{
					continue;
				}
				else if(toInt(number) <= 1000)
					total += toInt(number);	
			}
			return total; 
    			
		}
		else 
			return 1;
	}
           
	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
		return numbers.split("(,)|(\n)");
	}

	private static int sum(String[] numbers){
		int total = 0;
		for(String number : numbers){
			total += toInt(number);
		}
		return total;
	}
	
}


