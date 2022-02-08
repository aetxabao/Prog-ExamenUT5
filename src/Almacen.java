/**
 * Clase para gestionar los productos de un almacén.
 *
 * @author NOMBRE Y APELLIDOS
 *
 */
public class Almacen {

    private Producto[] productos;
    private int cantidad;

    /**
     * Método constructor.
     * @param n cantidad máxima de tipos de producto distintos que se puede gestionar
     */
    public Almacen(int n) {
        productos = new Producto[n];
        cantidad = 0;
    }

    /**
     * Imprime por la salida estándar el listado de productos en el almacén.
     */
    public void listaProductos() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(productos[i]);
        }
    }

    /**
     * Devuelve un objeto producto cuyo identificador coincida con el id pasado
     * como parámetro o null si no existe un producto con ese identificador.
     * @param id identificador del producto, p.ej. "M2030"
     * @return producto en el almacén con ese identificador o null
     */
    public Producto dameProducto(String id) {
        //TODO: dameProducto
        return null;
    }

    /**
     * Inserta de forma ordenada según el nombre del producto. Para implementar
     * este método se pueden crear métodos privados que puedan servir por ejemplo
     * para buscar la posición de inserción, desplazar los elementos e insertar
     * finalmente el producto en la posición adecuada.<br/>
     * Hay que comprobar que el array de productos no esté lleno y que no existe
     * otro producto con el mismo id (se debe utilizar el método dameProducto).
     * Si por alguna de estas dos razones no se puede insertar se devolverá un
     * valor false y sino, se actualizará la cantidad de productos que se está
     * gestionando en el almacén y se devolverá true.
     * @param producto a insertar
     * @return true si se inserta correctamente, si existía o no hay sitio false
     */
    public boolean insertaProducto(Producto producto) {
        //TODO: insertaProducto
        return true;
    }

    /**
     * Elimina el producto con el id pasado como argumento y manipula el array
     * de productos para que sigan ordenados. Igual que en el caso de
     * insertaProducto se pueden utilizar métodos privados. Si el producto no
     * existe (utiliza dameProducto) devuelve false, sino después de la gestión
     * del array y actualizar el contador de productos debe devolver true.
     * @param id identificador del producto a eliminar
     * @return true si se elimina el producto, false si no existía
     */
    public boolean eliminaProducto(String id) {
        //TODO: eliminaProducto
        return true;
    }

}
