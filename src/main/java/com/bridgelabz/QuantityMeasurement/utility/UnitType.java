package com.bridgelabz.QuantityMeasurement.utility;

public enum UnitType {
      FEET(12.0), INCH(1.0), YARD(36.0),CENTIMETER(1/2.5),
      LITRE(1.0),GALLON( 3.78);
      public double conversionValue;
      UnitType(double conversionValue) {
            this.conversionValue = conversionValue;
      }
}
