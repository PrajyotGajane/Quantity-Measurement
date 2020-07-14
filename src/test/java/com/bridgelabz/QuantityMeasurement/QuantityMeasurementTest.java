package com.bridgelabz.QuantityMeasurement;

import com.bridgelabz.QuantityMeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.QuantityMeasurement.utility.UnitType;
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
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 0.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void givenNullValueForFeet_WhenEqual_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(UnitType.FEET, null);
            } catch (QuantityMeasurementException e) {
                  Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NULL_VALUE);
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
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 2.2);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 2.2);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      //----------------------------------------Inch--------------------------------------------
      @Test
      public void given0Inch_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.INCH, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.INCH, 0.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void givenNullValueForInch_WhenEqual_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(UnitType.INCH, null);
            } catch (QuantityMeasurementException e) {
                  Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NULL_VALUE);
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
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 2.2);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 2.2);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      //----------------------------------------Yard--------------------------------------------
      @Test
      public void given3FeetAnd1Yard_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 3.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.YARD, 1.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 1.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.YARD, 1.0);
            Assert.assertNotEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.INCH, 1.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.YARD, 1.0);
            Assert.assertNotEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void given1YardAnd36Inch_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.YARD, 1.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.INCH, 36.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void given36InchAnd1Yard_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.INCH, 36.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.YARD, 1.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      @Test
      public void given1YardAnd3Feet_WhenNotEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.FEET, 3.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.YARD, 1.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }

      //----------------------------------------Centimeters--------------------------------------------
      @Test
      public void given0CentimeterAnd0Centimeter_WhenEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(UnitType.CENTIMETER, 0.0);
            secondValue = quantityMeasurement.quantityMeasurer(UnitType.CENTIMETER, 0.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
      @Test
      public void givenNullValueForCentimeter_WhenEqual_ShouldReturnFalse() {
            try {
                  quantityMeasurement.quantityMeasurer(UnitType.CENTIMETER, null);
            } catch (QuantityMeasurementException e) {
                  System.out.println("Exception occurred");
                  Assert.assertEquals(e.type, QuantityMeasurementException.ExceptionType.NULL_VALUE);
            }
      }
}
