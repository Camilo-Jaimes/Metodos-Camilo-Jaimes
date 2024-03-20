public class Punto5 {
    public static long convertidor(int dias, int horas, int minutos) {
        long segDias = dias * 24 * 60 * 60;
        long segHoras = horas * 60 * 60;
        long segMinutos = minutos * 60;
        return segDias + segHoras + segMinutos;
    }
}
