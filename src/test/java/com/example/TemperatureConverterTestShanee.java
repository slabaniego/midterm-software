package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTestShanee {

    @Test
    public void testCelsiusToFahrenheitByShanee() {
        TemperatureConverter converter = new TemperatureConverter();
        double celsius = 4;
        double expectedFahrenheit = 39.2;
        assertEquals(expectedFahrenheit, converter.celsiusToFahrenheit(celsius), 0.01);
    }

    @Test
    public void testFahrenheitToCelsiusByShanee() {
        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = 39.2;
        double expectedCelsius = 4;
        assertEquals(expectedCelsius, converter.fahrenheitToCelsius(fahrenheit), 0.01);
    }

}