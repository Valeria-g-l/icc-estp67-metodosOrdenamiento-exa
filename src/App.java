import controllerss.BrandController;
import models.Brand;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Examen interciclo de Estructuras de Datos");
        System.out.println("====Configurar studente.env====");

        BrandController brandController = new BrandController();
        Brand brands = new Brand(null, null);

        System.out.println("Arreglo original");

        for (Brand b : brands) {
            System.out.println("Brands: " + b.getCarModel() + "Años validos: " + b.getTotalValidYears());
        }

        System.out.println("Arreglo ordenado");
        brandController.sortBubbleDesc(null);
        for (Brand b : brands) {
            System.out.println("Brands: " + b.getCarModel() + "Años validos: " + b.getTotalValidYears());
        }

        System.out.println("Encontrado");
        Brand encontrado = brandController.binarySearchByValidYears(null, 0, false);
        if (encontrado != null) {
            System.out.println(
                    "Brands: " + encontrado.getCarModel() + "Años validos: " + encontrado.getTotalValidYears());
        } else {
            System.out.println("No se encontro");
        }

    }

}
