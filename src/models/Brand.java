package models;

import java.util.Arrays;

public class Brand {
  private String brandName;
  private CarModel[] carModel;

  public Brand(String BrandName, CarModel[] carModel) {
    this.brandName = brandName;
    this.carModel = carModel;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public CarModel[] getCarModel() {
    return carModel;
  }

  public void setCarModel(CarModel[] carModel) {
    this.carModel = carModel;
  }

  public int getTotalValidYears() {
    int total = 0;
    for (CarModel cm : carModel) {
      for (CarYear cy : cm.getCarYear()) {
        if (cy.isValid()) {

        }
      }
    }
    return total;
  }

  @Override
  public String toString() {
    return "Brand [name=" + brandName + ", carModel=" + Arrays.toString(carModel) + "]";
  }

}
