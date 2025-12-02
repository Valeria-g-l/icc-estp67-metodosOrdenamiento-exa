package models;

public class CarYear {
  private int anio;
  private boolean isValid;
  public CarYear(int anio, boolean isValid) {
    this.anio = anio;
    this.isValid = isValid;
  }
  public int getAnio() {
    return anio;
  }
  public void setAnio(int anio) {
    this.anio = anio;
  }
  public boolean isValid() {
    return isValid;
  }
  public void setValid(boolean isValid) {
    this.isValid = isValid;
  }
  @Override
  public String toString() {
    return "CarYear [anio=" + anio + ", isValid=" + isValid + "]";
  }
  
  
  
}
