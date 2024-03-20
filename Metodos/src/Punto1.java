public class Punto1 {
    public static double calcularDescuento(double precio, double descuento) {
        double descuentoTotal = (precio * descuento) / 100;
        return precio - descuentoTotal;
    }
}
