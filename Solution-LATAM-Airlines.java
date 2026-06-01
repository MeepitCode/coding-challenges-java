import java.io.*;
import java.util.*;

class Result {

    /*
     * Completa la función 'calculateDiagonalDifference' abajo.
     * La función espera un entero (INTEGER) como retorno.
     * La función acepta una matriz 2D_INTEGER_ARRAY como parámetro.
     */
    public static int calculateDiagonalDifference(List<List<Integer>> matrix) {
        int n = matrix.size();
        long primarySum = 0;
        long secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += matrix.get(i).get(i);
            secondarySum += matrix.get(i).get(n - 1 - i);
        }

        // El valor absoluto  para que sea un  resultado  positivo, sin importar el orden
        return Math.abs((int)(primarySum - secondarySum));
    }
}