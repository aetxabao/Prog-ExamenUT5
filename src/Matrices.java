/**
 * Clase con métodos estáticos para operar con arrays uni y bidimensionales.
 *
 * @author NOMBRE Y APELLIDOS
 *
 */
public class Matrices {

    /**
     * Dado un array devuelve un array nuevo con la posición de los elementos invertidos.
     * Es decir, en el array devuelto, el primer elemento será el último del array pasado
     * como parámetro, el segundo el penúltimo y así sucesivamente.
     * @param a array de entrada, p.ej. [1, 2, 3, 4, 5]
     * @return array girada nueva, p.ej.  [5, 4, 3, 2, 1]
     */
    public static int[] girada(int[] a) {
        // TODO: girada
        return null;
    }

    /**
     * Devuelve una matriz espejo a la que se pasa por parámetro. Este 	espejo es horizontal.
     * Si en la imagen inferior se pasa la matriz de la izquierda como parámetro debe devolver
     * una nueva matriz como la que aparece a la derecha. <br/><br/>
     * [1, 0, 0, 0]    |    [0, 0, 0, 1] <br/>
     * [0, 1, 0, 0]    |    [0, 0, 1, 0] <br/>
     * [0, 0, 1, 0]    |    [0, 1, 0, 0] <br/>
     * [0, 0, 0, 1]    |    [1, 0, 0, 0] <br/>
     * [0, 0, 1, 0]    |    [0, 1, 0, 0] <br/>
     * [0, 1, 0, 0]    |    [0, 0, 1, 0] <br/>
     * [1, 0, 0, 0]    |    [0, 0, 0, 1] <br/>
     * @param a matriz de entrada
     * @return la matriz a la derecha de un espejo horizontal
     */
    public static int[][] espejo(int[][] a) {
        // TODO: espejo
        return null;
    }

    /**
     * El nuevo array que devuelve el método contiene la diferencia de
     * valores del array pasado como parámetro entre las posiciones con
     * una diferencia x en los indices. Por ejemplo, si la diferencia
     * x es 1, la posición 1 del array devuelto será la posición 1 del
     * array pasado menos la posición 0 del array pasado, la posición
     * 2 del array devuelto será la posición 2 del array pasado menos
     * la posición 1 del array pasado y así sucesivamente. <br/><br/>
     * En el caso de que x fuese 2, la posición 2 del array devuelto
     * sería la posición 2 del array pasado menos la posición 0 del
     * array pasado, la posición 3 del array devuelto sería la posición
     * 3 del array pasado menos la posición 1 del array pasado y así
     * sucesivamente. <br/><br/>
     * Hay que considerar que las x primeras posiciones del array que
     * se devuelve serán 0. <br/><br/>
     * [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7] diferencia 1 es  <br/>
     * [0, 1, 1, 1, 1, 1, 1, -6, 1, 1, 1, 1, 1, 1] <br/><br/>
     * [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7] diferencia 2 es  <br/>
     * [0, 0, 2, 2, 2, 2, 2, -5, -5, 2, 2, 2, 2, 2] <br/><br/>
     * [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7] diferencia 3 es  <br/>
     * [0, 0, 0, 3, 3, 3, 3, -4, -4, -4, 3, 3, 3, 3] <br/><br/>
     * [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7] diferencia 7 es  <br/>
     * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] <br/><br/>
     * @param a array de entrada
     * @param x diferencia entre las posiciones del array de entrada
     * @return array de salida
     */
    public static int[] diferencia(int[] a, int x) {
        // TODO: diferencia
        return null;
    }

    /**
     * Dado un array bidimensional devuelve otro en el que se crea un
     * borde del grosor indicado como parámetro. En el siguiente ejemplo
     * se puede ver un caso con borde 2 (a la izquierda matriz pasada,
     * a la derecha el resultado). <br/><br/>
     * [1, 1, 1, 1, 1, 1, 1, 1]    |    [0, 0, 0, 0, 0, 0, 0, 0] <br/>
     * [1, 1, 1, 1, 1, 1, 1, 1]    |    [0, 0, 0, 0, 0, 0, 0, 0] <br/>
     * [1, 1, 1, 1, 1, 1, 1, 1]    |    [0, 0, 1, 1, 1, 1, 0, 0] <br/>
     * [1, 1, 1, 1, 1, 1, 1, 1]    |    [0, 0, 1, 1, 1, 1, 0, 0] <br/>
     * [1, 1, 1, 1, 1, 1, 1, 1]    |    [0, 0, 0, 0, 0, 0, 0, 0] <br/>
     * [1, 1, 1, 1, 1, 1, 1, 1]    |    [0, 0, 0, 0, 0, 0, 0, 0] <br/>
     * @param a matriz de entrada
     * @param borde grosor del borde
     * @return matriz con el borde
     */
    public static int[][] borde(int[][] a, int borde) {
        // TODO: borde
        return null;
    }

    /**
     * Dado un array y un número de columnas devuelve una matriz con
     * los valores del array distribuidos secuencialmente
     * de izquierda a derecha y de arriba abajo en la matriz. En el
     * primer ejemplo siguiente se puede ver como 29 valores que se
     * pasan en un array se transforman en una matriz con 7 columnas.
     * En el segundo ejemplo se estaría transformando el array en una
     * matriz de 4 columnas. <br/><br/>
     * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8] <br/>
     * [0, 1, 2, 3, 4, 5, 6] <br/>
     * [7, 8, 9, 0, 1, 2, 3] <br/>
     * [4, 5, 6, 7, 8, 9, 0] <br/>
     * [1, 2, 3, 4, 5, 6, 7] <br/>
     * [8, 0, 0, 0, 0, 0, 0] <br/>
     *  <br/>
     * [1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3] <br/>
     * [1, 2, 3, 4] <br/>
     * [1, 2, 3, 4] <br/>
     * [1, 2, 3, 0] <br/>
     * @param a array de entrada
     * @param columnas número de columnas de la matriz de salida
     * @return matriz con columnas
     */
    public static int[][] to2D(int[] a, int columnas) {
        // TODO: to2D
        return null;
    }

}
