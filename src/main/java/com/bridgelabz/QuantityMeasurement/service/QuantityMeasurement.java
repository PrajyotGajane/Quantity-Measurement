package com.bridgelabz.QuantityMeasurement.service;

public class QuantityMeasurement {

      public double quantityMeasurer(InchToFeet type, double valuePassed) {
            return valuePassed * type.inchToFeet;
      }
}
