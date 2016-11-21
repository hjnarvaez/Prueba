package ejemplogithub;

public class EjemploGitHub {

  /* Ejercicio or Franklin H.
        double suma = 0, a = 0, b = -1, c = 0;
        int n = 5, i = 0;

        double[] v1 = new double[n];
        double[] v2 = new double[n];
        double[] resultado = new double[n];

        for (i = 0; i < n; i++) {

            a = a + 2; //Pares // 2 4 6 8 10
            b = b + 2; // Impares // 1 3 5 7 9 
            v1[i] = a;
            v2[i] = b;

            resultado[i] = resultado[i] + (b / a);
            System.out.println(a + "/" + b + " = " + resultado[i]);

        }
        for (i = 0; i < n; i++) {
            c = c + resultado[i];

        }
        System.out.println("\n");
        System.out.println("Resultado total: " + c);
         Ejercicio or Franklin H.   */


    public static void main(String[] args) {
        EjemploGitHub objeto = new EjemploGitHub();
        objeto.vector();

    }

    public void vector() {
        int A[], i;
        int[] B = {1, 2, 3, 4};
        A = new int[5];
        i = 0;
        do {
            A[i] = i * 2;
            i++;
        } while (i < 5);
        imprimir(A);
    }
    
    public void imprimir(int[] A1){
        int i=0;
        while(i<A1.length){
            System.out.print(A1[i]);
            i++;
        }
    }
}
