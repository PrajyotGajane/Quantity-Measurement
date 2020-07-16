package com.bridgelabz.QuantityMeasurement.enums;

public enum UnitType {
      FEET(12.0), INCH(1.0), YARD(36.0),CENTIMETER(1/2.5),
      LITRE(1.0),GALLON( 3.78),MILLILITRE(0.001),
      KILOGRAM(1.0),GRAM(0.001),TONNE(1000.0),
      FAHRENHEIT,CELSIUS;
      public double conversionValue;
      UnitType(double conversionValue) {
            this.conversionValue = conversionValue;
      }
      UnitType() {}
}
