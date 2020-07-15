package com.bridgelabz.QuantityMeasurement.service;

import com.bridgelabz.QuantityMeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.QuantityMeasurement.utility.UnitType;

public class QuantityMeasurement {
      /**
       * to convert passed values
       *
       * @param type
       * @param valuePassed
       * @return convertedValue
       */
      public double quantityMeasurer(UnitType type, Double valuePassed) {
            try {
                  return type.conversionValue * valuePassed;
            } catch (NullPointerException e) {
                  throw new QuantityMeasurementException("Null value passed", QuantityMeasurementException.ExceptionType.NULL_VALUE);
            }
      }

      /**
       * adds the two units passed
       *
       * @param firstValue
       * @param secondValue
       * @return total value of the addition
       */
      public Double valueAddition(double firstValue, double secondValue) {
            return firstValue + secondValue;
      }

      public boolean equals(Object object) {
            if (object == this)
                  return true;
            if (this.getClass() == object.getClass())
                  return true;
            return false;
      }

      public Double temperatureConversion(UnitType type, double valuePassed) {
            return 0.0;
      }
}
