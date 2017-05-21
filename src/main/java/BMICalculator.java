package main.java;

public class BMICalculator {

	public double calculate(double weight, double height)
	{
		return (weight/(height * height));
	}
	
	public String getResult(String gender, double weight, double height)
	{
		boolean printBmi = true;
		if(height < 0.3 || height > 2.60 || weight < 2 || weight > 300)
		{
			return "Please enter height between 0.3 and 2.6 m and a weight between 2 and 300 kg";
		}
		
		double bmi = weight / (height * height);
		
		String result = "";
		if(printBmi)
		{
			result = String.format("BMI: %.2f; ", bmi);
		}
		
		if(gender.equals("weiblich"))
		{
			if(bmi<19 && bmi>0)
			{
				return result + "Untergewicht";
			}
			else if(bmi >19 && bmi<=24)
			{
				return result + "Normalgewicht";
			}
			else if(bmi >24 && bmi<=30)
			{
				return result + "Uebergewicht";
			}
			else if(bmi >30 && bmi<=40)
			{
				return result + "Adipositas";
			}
			else if(bmi>40)
			{
				return result + "massive Adipositas";
			}
		}
		else if(gender.equals("maennlich"))
		{
			if(bmi<20 && bmi>0)
			{
				return result + "Untergewicht";
			}
			else if(bmi >20 && bmi<=25)
			{
				return result + "Normalgewicht";
			}
			else if(bmi >25 && bmi<=30)
			{
				return result + "Uebergewicht";
			}
			else if(bmi >30 && bmi<=40)
			{
				return result + "Adipositas";
			}
			else if(bmi>40)
			{
				return result + "massive Adipositas";
			}
		}
		return "Invalid Values";
	}
}
