package utils;

public class ConversorDeValores {
	 public double convert(String stringValue) {
	        String stringValueWithPoint = stringValue.replace(',', '.');
	        
	        try {
	            return Double.parseDouble(stringValueWithPoint);
	        } catch (NumberFormatException e) {
	            throw new IllegalArgumentException("Invalid input. Couldn't convert to double.", e);
	        }
	    }
}
