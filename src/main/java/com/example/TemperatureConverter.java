package com.example;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public String newMethod(){// demo changes in class for midterm by shanee
        return "New method updated.";
    }
}