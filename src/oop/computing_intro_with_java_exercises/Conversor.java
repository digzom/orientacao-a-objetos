package oop.computing_intro_with_java_exercises;

public class Conversor {
	double ceusiusToFarenheit(double celcius) {
		return 9.0 * celcius / 5.0 + 32.0;
	}

	double celciusToKelvin(double celcius) {
		return celcius + 273.15;
	}

	double kelvinToCelcius(double kelvin) {
		return kelvin - 273.15;
	}
	
	double kelvinToFarenheit(double kelvin) {
		return 1.8 * (kelvin - 273) + 32;
	}

	double farenheitToKelvin(double farenheit) {
		return ((farenheit - 32) * 5) / 9 - 273.15;
	}

	double farenheitToCelcius(double farenheit) {
		return 5.0 * (farenheit - 32.0) / 9.0;
	}
}
