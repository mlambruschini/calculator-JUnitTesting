package com.openclassrooms.testing;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static java.lang.Math.PI;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Category(Categories.ConversionTests.class)
public class ConversionCalculatorTest {

    private ConversionCalculator calculatorUnderTest = new ConversionCalculator();

    @Test
    @Category({Categories.FahrenheitTests.class, Categories.TemperatureTests.class})
    public void celsiusToFahrenheit_returnsAFahrenheitTemperature_whenCelsiusIsZero() {
        Double actualFahrenheit = calculatorUnderTest.celsiusToFahrenheit(0.0);
        assertThat(actualFahrenheit, is(equalTo(32.0)));
    }

    @Test
    @Category({Categories.TemperatureTests.class})
    public void FahrenheitToCelsius_returnsZerpCelsiusTempurature_whenThirtyTwo() {
        Double actualCelsius = calculatorUnderTest.fahrenheitToCelsius(32.0);
        assertThat(actualCelsius, is (equalTo(0.0)));
    }

    @Test
    public void litresToGallons_returnsOneGallon_whenConvertingTheEquivalentLitres() {
        Double actualLitres = calculatorUnderTest.litresToGallons(3.78541);
        assertThat(actualLitres, is(equalTo(1.0)));
    }

    @Test
    public void radiusToAreaOfCircle_returnsPi_whenWeHaveARadiusOfOne() {
        Double actualArea = calculatorUnderTest.radiusToAreaOfCircle(1.0);
        assertThat(actualArea, is(equalTo(Math.pow(PI, 2))));
    }
}
