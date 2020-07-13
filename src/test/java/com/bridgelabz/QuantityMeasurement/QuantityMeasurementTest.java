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

      //----------------------------------------Feet--------------------------------------------
      @Test
      public void given0Feet_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 0.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void givenNullValueForFeet_WhenEqual_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(InchToFeet.FEET, null);
            } catch (NullPointerException e) {
                  Assert.assertEquals(null, e.getMessage());
            }
      }

      @Test
      public void givenReferenceForFeet_WhenEqual_ShouldReturnTrue() {
            Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
      }

      @Test
      public void givenTypeForFeet_WhenEqual_ShouldReturnTrue() {
            QuantityMeasurement quantityTypeOne = new QuantityMeasurement();
            QuantityMeasurement quantityTypeTwo = new QuantityMeasurement();
            Assert.assertEquals(quantityTypeOne, quantityTypeTwo);
      }

      @Test
      public void givenSameValueForFeet_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.2);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.2);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      //----------------------------------------Inch--------------------------------------------
      @Test
      public void given0Inch_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 0.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
      @Test
      public void givenNullValueForInch_WhenEqual_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(InchToFeet.INCH, null);
            } catch (NullPointerException e) {
                  Assert.assertEquals(null, e.getMessage());
            }
      }

      @Test
      public void givenReferenceForInch_WhenEqual_ShouldReturnTrue() {
            Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
      }
      @Test
      public void givenTypeForInch_WhenEqual_ShouldReturnTrue() {
            QuantityMeasurement quantityTypeOne = new QuantityMeasurement();
            QuantityMeasurement quantityTypeTwo = new QuantityMeasurement();
            Assert.assertEquals(quantityTypeOne, quantityTypeTwo);
      }
      @Test
      public void givenSameValueForInch_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.2);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.2);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
}
