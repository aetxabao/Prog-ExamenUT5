/**
 * La clase Producto tiene tres atributos para identificarlos por id o nombre y un valor
 * stock que representa el número de artículos de ese tipo de producto.
 *
 * @author NOMBRE Y APELLIDOS
 *
 */
public class Producto {

    private String id;
    private String nombre;
    private int stock;

    /**
     * Método constructo con parámetros equivalentes a los atributos
     * @param id identificador
     * @param nombre nombre del producto
     * @param stock cantidad que se dispone
     */
    public Producto(String id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    /**
     * El método construye un objeto a partir de una cadena de texto en formato json.<br/><br/>
     * Utilizando los métodos de la clase String se debe procesar la cadena para extraer los
     * valores que se deben asignar a los atributos id, nombre y stock. Para convertir el
     * stock de String a int se puede utilizar el método Integer.valueOf(s), siendo s la
     * cadena que representa al valor numérico, en el caso del ejemplo s = "1". En la
     * siguiente imagen se puede ver los valores que deben tomar los atributos una vez
     * procesado el json de ejemplo.<br/><br/>
     * "{'id':'ALPER','nombre':'Alfombra persa','stock':1}"<br/><br/>
     * id="ALPER"; nombre="Alfombra persa"; stock=1;<br/>
     * @param json cadena con la representación json de un objeto producto
     */
    public Producto(String json) {
        // TODO: Producto
    }

    /**
     * @return identificador del producto, p.ej. "M2030"
     */
    public String getId() {
        return id;
    }

    /**
     * @return nombre del producto, p.ej. "Mesa 200x300"
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return cantidad del producto disponible, p.ej. 2
     */
    public int getStock() {
        return stock;
    }

    /**
     * El método debe devolver una cadena de texto con una representación en formato json
     * como la que se utiliza en el método constructor anterior. Se debe utilizar
     * imprescindiblemente la clase StringBuilder, no se puede concatenar texto utilizando
     * el operador ‘+’ o métodos de la clase String.
     * @return cadena con formato json que representa al objeto.<br/><br/>
     * "{'id':'ALPER','nombre':'Alfombra persa','stock':1}"
     */
    @Override
    public String toString() {
        // TODO: toString
        return null;
    }
}
