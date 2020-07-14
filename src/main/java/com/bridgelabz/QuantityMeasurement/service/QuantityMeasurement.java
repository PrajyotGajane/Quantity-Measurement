package com.bridgelabz.QuantityMeasurement.service;

import com.bridgelabz.QuantityMeasurement.exception.QuantityMeasurementException;
import com.bridgelabz.QuantityMeasurement.utility.UnitType;

public class QuantityMeasurement {
      public double quantityMeasurer(UnitType type, Double valuePassed) {
            try {
                  return type.conversionValue * valuePassed;
            } catch (NullPointerException e){
                  throw new QuantityMeasurementException("Null value passed", QuantityMeasurementException.ExceptionType.NULL_VALUE);
            }
      }

      public boolean equals(Object object) {
            if (object == this)
                  return true;
            if (this.getClass() == object.getClass())
                  return true;
            return false;
      }
}
