import java.util.Arrays;

public class DemoMatrices {

    public static void main(String[] args) {
        System.out.println("================================================================");
        int[] a = {1,2,3,4,5};
        int[] b = Matrices.girada(a);
        System.out.printf("%s girada es %s\n", Arrays.toString(a), Arrays.toString(b));
        System.out.println("================================================================");
        int[][] m1 = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1},{0,0,1,0},{0,1,0,0},{1,0,0,0}};
        int[][] m2 = Matrices.espejo(m1);
        printEspejo(m1,m2);
        System.out.println("================================================================");
        int[] c = {1,2,3,4,5,6,7,1,2,3,4,5,6,7,};
        int[] d = Matrices.diferencia(c,1);
        int[] e = Matrices.diferencia(c,2);
        int[] f = Matrices.diferencia(c,3);
        int[] g = Matrices.diferencia(c,7);
        System.out.printf("%s diferencia 1 es %s\n", Arrays.toString(c), Arrays.toString(d));
        System.out.printf("%s diferencia 2 es %s\n", Arrays.toString(c), Arrays.toString(e));
        System.out.printf("%s diferencia 3 es %s\n", Arrays.toString(c), Arrays.toString(f));
        System.out.printf("%s diferencia 7 es %s\n", Arrays.toString(c), Arrays.toString(g));
        System.out.println("================================================================");
        int[][] m3 = {{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},
                     {1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1}};
        int[][] m4 = Matrices.borde(m3,2);
        printMatriz(m3);
        System.out.println("borde 2");
        printMatriz(m4);
        System.out.println("================================================================");
        int[] h = { 0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8};
        int[][] m5 = Matrices.to2D(h,7);
        System.out.println(Arrays.toString(h));
        System.out.println("en matriz de 7 columnas");
        printMatriz(m5);
        System.out.println("================================================================");
        int[] i = { 1,2,3,4,1,2,3,4,1,2,3};
        int[][] m6 = Matrices.to2D(i,4);
        System.out.println(Arrays.toString(i));
        System.out.println("en matriz de 4 columnas");
        printMatriz(m6);
        System.out.println("================================================================");

    }

    public static void printMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%s\n",Arrays.toString(m[i]));
        }
    }

    public static void printEspejo(int[][] m1, int[][] m2){
        for (int i = 0; i < m1.length; i++) {
            System.out.printf("%s | %s\n",Arrays.toString(m1[i]), Arrays.toString(m2[i]));
        }
    }
}
