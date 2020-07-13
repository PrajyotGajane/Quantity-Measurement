package com.bridgelabz.QuantityMeasurement.service;

public class QuantityMeasurement {
      public double quantityMeasurer(InchToFeet type, Double valuePassed) {
            return type.inchToFeet * valuePassed;
      }
}
