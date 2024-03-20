public class Punto6 {
    public static double convertirTiempo(int segundos, String tipo) {
        switch (tipo.toLowerCase()) {
            case "dias":
                return segundos / (24.0 * 60 * 60);
            case "horas":
                return segundos / (60.0 * 60);
            case "minutos":
                return segundos / 60.0;
            default:
                System.out.println("Tipo no reconocido. Por favor, elige 'dias', 'horas' o 'minutos'.");
                return -1;
        }
    }
}
