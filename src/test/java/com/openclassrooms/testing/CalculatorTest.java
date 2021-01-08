package com.openclassrooms.testing;

import org.junit.*;

import java.time.Duration;
import java.time.Instant;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private static Instant startTime;
    private Calculator calculator;

    @BeforeClass
    public static void beforeClass(){
        startTime = Instant.now();
        System.out.println("CALLED ONLY ONCE BEFORE ALL TESTS AT " + startTime);
    }

    @AfterClass
    public static void afterClass(){
        Instant endedAt = Instant.now();
        Duration duration = Duration.between(startTime, endedAt);
        System.out.println("CALLED AFTER ALL TESTS - ONLY ONCE - AT " + duration);
    }

    @Before
    public void setUp(){
        System.out.println("CALLED BEFORE A TEST @Before");
        calculator = new Calculator();
    }

    @After
    public void tearDown(){
        System.out.println("CALLED AFTER A TEST @After");
        calculator = null;
    }

    @Test
    public void add_shouldReturnTheSum_ofTwoNumbers(){
        //arrange
        Integer expected = 3;

        //act
        Integer result = calculator.add(1, 2);

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void multiply_shouldReturnTheProduct_ofTwoNumbers(){
        //arrange

        //act
        Integer product = calculator.multiply(2, 3);

        //assert that product is equal to 6
        assertThat(product, is(equalTo(6)));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void cos_shouldNotBeSupported_whenCalledWithAnyValue(){
        //arrange is done in @Before

        //act
        calculator.cos(0.8);

        //assertion happend in the @Test
    }

    @Test(timeout = 3000L)
    public void slowCalculation_shouldTakeUnreasonablyLong_whenCalled(){
        //act by calling slow calculation
        calculator.slowCalculation();
    }
}
