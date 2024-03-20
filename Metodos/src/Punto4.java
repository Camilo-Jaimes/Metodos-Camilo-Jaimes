public class Punto4 {
    public static double calcularFiguraCircular(double radio, String tipoCalculo) {
        final double pi = 3.1416;
        switch (tipoCalculo.toLowerCase()) {
            case "perimetro":
                return 2 * pi * radio;
            case "area":
                return pi * Math.pow(radio, 2);
            case "volumen":
                return (4.0 / 3.0) * pi * Math.pow(radio, 3);
            default:
                System.out.println("Tipo de calculo no reconocido. Por favor, elige 'perimetro', 'area' o 'volumen'.");
                return -1;
        }
    }
}
