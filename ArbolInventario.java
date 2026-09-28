public class ArbolInventario {
    private Producto raiz;

    public void Insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        if (actual == null) {
            return new Producto(id, nombre);
        }
        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        } else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        }
        return actual;
    }

    public void RecorridoInOrden() {
        System.out.println("\n=== Inventario Ordenado ===");
        inOrdenRecursivo(raiz);
    }

    private void inOrdenRecursivo(Producto nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.println("ID: " + nodo.id + " | Nombre: " + nodo.nombre);
            inOrdenRecursivo(nodo.derecho);
        }
    }

    public boolean Buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    private boolean buscarRecursivo(Producto actual, int id) {
        if (actual == null) return false;
        if (id == actual.id) return true;
        return id < actual.id 
            ? buscarRecursivo(actual.izquierdo, id) 
            : buscarRecursivo(actual.derecho, id);
    }
}