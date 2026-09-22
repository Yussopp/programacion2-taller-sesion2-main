public class Parqueadero {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTION DEL PARQUEADERO UNINTEP ===\n");

        // 1. Creación de al menos tres celdas y dos vehículos
        System.out.println("--- 1. Creacion de celdas y vehiculos ---");
        Celda celda1 = new Celda("A-01");
        Celda celda2 = new Celda("A-02");
        Celda celda3 = new Celda("A-13");

        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Carro", "Alejandro Valencia");
        Vehiculo vehiculo2 = new Vehiculo("XYZ987", "Moto", "Susana Susanita");
        System.out.println("Celdas instanciadas: A-01, A-02, A-13");
        System.out.println("Vehiculos instanciados: ABC123 (Carro), XYZ987 (Moto)\n");

        // 2. Un vehículo ocupando una celda correctamente
        System.out.println("--- 2. Ocupacion exitosa de celda ---");
        celda1.ocupar(vehiculo1);
        System.out.println();

        // 3. Intento de ocupar la misma celda (rechazado con mensaje)
        System.out.println("--- 3. Intento de ocupar una celda ya ocupada ---");
        celda1.ocupar(vehiculo2);
        System.out.println();

        // 4. Intento de liberar una celda libre (rechazado con mensaje)
        System.out.println("--- 4. Intento de liberar una celda ya libre ---");
        celda2.liberar();
        System.out.println();

        // 5. Impresión del estado final de las tres celdas
        System.out.println("--- 5. Estado final de las tres celdas ---");
        System.out.println(celda1.estado());
        System.out.println(celda2.estado());
        System.out.println(celda3.estado());
    }
}
