package com.bridgelabz.QuantityMeasurement.service;

public class QuantityMeasurement {
      public double quantityMeasurer(UnitType type, Double valuePassed) {
            return type.conversionValue * valuePassed;
      }
      @Override
      public boolean equals(Object object) {
            if (object == this)
                  return true;
            if (this.getClass() == object.getClass())
                  return true;
            return super.equals(object);
      }
}
