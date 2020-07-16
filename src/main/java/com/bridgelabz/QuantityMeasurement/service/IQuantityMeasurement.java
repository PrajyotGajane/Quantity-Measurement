package com.bridgelabz.QuantityMeasurement.service;

import com.bridgelabz.QuantityMeasurement.enums.UnitType;

public interface IQuantityMeasurement {
      double quantityMeasurer(UnitType type, Double valuePassed);

      Double valueAddition(double firstValue, double secondValue);

      Double temperatureConversion(UnitType type, double valuePassed);
}
