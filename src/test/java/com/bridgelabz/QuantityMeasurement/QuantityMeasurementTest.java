package com.bridgelabz.QuantityMeasurement;

import com.bridgelabz.QuantityMeasurement.service.InchToFeet;
import com.bridgelabz.QuantityMeasurement.service.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class QuantityMeasurementTest {
      QuantityMeasurement quantityMeasurement;
      double firstValue;
      double secondValue;
      @Before
      public void setUp() {
            quantityMeasurement = new QuantityMeasurement();
      }
      @Test
      public void given12InchAnd1Feet_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 12.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 1.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
      @Test
      public void given0InchAnd0Feet_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 0.0);
            Assert.assertEquals(firstValue,secondValue,0.0);
      }
      @Test
      public void given24InchAnd2Feet_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 24.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
      @Test
      public void givenSameValueForInch_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 4.2);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 4.2);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
}
