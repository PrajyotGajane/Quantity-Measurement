package com.bridgelabz.QuantityMeasurement.service;

import com.bridgelabz.QuantityMeasurement.utility.UnitType;

public class QuantityMeasurement {
      public double quantityMeasurer(UnitType type, Double valuePassed) {
            return type.conversionValue * valuePassed;
      }

      public boolean equals(Object object) {
            if (object == this)
                  return true;
            if (this.getClass() == object.getClass())
                  return true;
            return super.equals(object);
      }
}
