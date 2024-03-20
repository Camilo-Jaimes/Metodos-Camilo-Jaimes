public class Punto2 {
    public static double calRectangulo(double lado1, double lado2, String tipoCalculo) {
        if (tipoCalculo.equalsIgnoreCase("perimetro")) {
            return 2 * (lado1 + lado2);
        } else if (tipoCalculo.equalsIgnoreCase("area")) {
            return lado1 * lado2;
        } else {
            System.out.println("Tipo de cálculo no reconocido. Por favor, elige 'perimetro' o 'area'.");
            return -1;
        }
    }
}
