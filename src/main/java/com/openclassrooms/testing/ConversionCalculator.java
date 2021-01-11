package com.openclassrooms.testing;

import static java.lang.Math.PI;

public class ConversionCalculator {
    public Double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9/5) + 32;
    }

    public Double fahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) * 5/9;
    }

    public Double litresToGallons(double litres) {
        return litres * 0.264172;
    }

    public Double radiusToAreaOfCircle(double radius){
        return radius * Math.pow(PI, 2);
    }
}
