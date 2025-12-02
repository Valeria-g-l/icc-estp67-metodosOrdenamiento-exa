package models;

import java.util.Arrays;

public class CarModel {
  private String BrandName;
  private CarYear[] carYear;

  public CarModel(String brandName, CarYear[] carYear) {
    BrandName = brandName;
    this.carYear = carYear;
  }

  public String getBrandName() {
    return BrandName;
  }

  public void setBrandName(String brandName) {
    BrandName = brandName;
  }

  public CarYear[] getCarYear() {
    return carYear;
  }

  public void setCarYear(CarYear[] carYear) {
    this.carYear = carYear;
  }

  @Override
  public String toString() {
    return "CarModel [BrandName=" + BrandName + ", carYear=" + Arrays.toString(carYear) + "]";
  }

}
