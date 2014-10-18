package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){	
			return 0;
		}
		else if(text.startsWith("//"))
		{
			//String numbers = text.subSequence("//","\n");
			String numbers = text.substring(2,3);
			String numb = text.substring(4);
			String[] result = numb.split(numbers);
			return sum(result);
		}
		else if(text.contains(",") || text.contains("\n")){
			return sum(splitNumbers(text));
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
			if(toInt(number) > 1000)
				continue;
			total += toInt(number);
		}
		return total;
	}
	
}


