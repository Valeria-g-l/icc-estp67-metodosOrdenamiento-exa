package controllerss;

import models.Brand;

public class BrandController {

  public Brand[] sortBubbleDesc(Brand[] brands) {
    for (int i = 0; i < brands.length; i++) {
      boolean swapped = false;
      for (int j = 0; j < brands.length - 1 - i; j++) {
        if (brands[j].getBrandName().compareToIgnoreCase(brands[j + 1].getBrandName()) > 0) {
          Brand temp = brands[j];
          brands[j] = brands[j + 1];
          brands[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }

    return null;
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    int inicio = 0;
    int finall = brands.length - 1;
    while (inicio <= finall) {
      int medio = (inicio + finall) / 2;
      int compare = brands[medio].getTotalValidYears();
      if (compare == validYears) {
        return brands[medio];
      }
      if (isAscending) {
        if (compare > validYears) {
          inicio = medio + 1;
        } else {
          finall = medio - 1;
        }
      } else {
        if (compare < validYears) {
          inicio = medio + 1;
        } else {
          finall = medio - 1;
        }
      }
    }
    return null;
  }

}
