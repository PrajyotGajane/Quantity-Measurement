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
      public void given0InchAnd0Feet_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 0.0);
            Assert.assertEquals(firstValue,secondValue,0.0);
      }
      //----------------------------------------Feet--------------------------------------------
      @Test
      public void givenNullValueForFeet_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(InchToFeet.FEET, null);
            } catch (NullPointerException e) {
                  Assert.assertEquals(null, e.getMessage());
            }
      }
      @Test
      public void givenReferenceForFeet_IfEqual_ShouldReturnTrue() {
            Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
      }
      @Test
      public void givenType_IfEqual_ShouldReturnTrue() {
            QuantityMeasurement quantityTypeOne = new QuantityMeasurement();
            QuantityMeasurement quantityTypeTwo = new QuantityMeasurement();
            Assert.assertEquals(quantityTypeOne, quantityTypeTwo);
      }

      @Test
      public void givenSameValueForFeet_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.2);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 2.2);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      //----------------------------------------Inch--------------------------------------------
      @Test
      public void givenNullValueForInch_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(InchToFeet.INCH, null);
            } catch (NullPointerException e) {
                  Assert.assertEquals(null, e.getMessage());
            }
      }
}
