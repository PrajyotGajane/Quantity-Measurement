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
      public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() {
            firstValue = quantityMeasurement.quantityMeasurer(InchToFeet.INCH, 12.0);
            secondValue = quantityMeasurement.quantityMeasurer(InchToFeet.FEET, 1.0);
            Assert.assertEquals(firstValue, secondValue, 0.0);
      }
}
