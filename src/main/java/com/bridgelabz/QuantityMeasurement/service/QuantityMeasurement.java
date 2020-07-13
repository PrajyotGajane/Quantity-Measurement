package com.bridgelabz.QuantityMeasurement.service;

public class QuantityMeasurement {
      public double quantityMeasurer(InchToFeet type, Double valuePassed) {
            return type.inchToFeet * valuePassed;
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
