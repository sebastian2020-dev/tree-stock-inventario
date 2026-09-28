import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolInventario arbol = new ArbolInventario();
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA Tree-Stock =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (ordenado)");
            System.out.println("3. Buscar Producto por ID");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID: ");
                    int id = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Ingresa el nombre: ");
                    String nombre = teclado.nextLine();
                    arbol.Insertar(id, nombre);
                    System.out.println("✅ Producto registrado con éxito");
                    break;

                case 2:
                    arbol.RecorridoInOrden();
                    break;

                case 3:
                    System.out.print("Ingresa el ID a buscar: ");
                    int idBuscar = teclado.nextInt();
                    if (arbol.Buscar(idBuscar)) {
                        System.out.println("✅ El producto EXISTE en el inventario");
                    } else {
                        System.out.println("❌ El producto NO existe");
                    }
                    break;

                case 0:
                    System.out.println("👋 Saliendo del sistema...");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida");
            }
        } while (opcion != 0);

        teclado.close();
    }
}