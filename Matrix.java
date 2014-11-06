public class Matrix {
    int[][] matrix;
    
    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
    }
    
    public void setElement(int x, int y, int value) {
        if (x < matrix.length && y < matrix[x].length) {
            matrix[x][y] = value;
        }
    }
    
    public void setRow(int x, String values) {
        if (x < matrix.length && matrix[x].length == ((values.length() / 2) + 1)) {
            for (int i = 0; i < matrix[x].length; i++) {
                matrix[x][i] = Integer.parseInt(values.substring(i * 2, i * 2 + 1));
            }
        }
    }
    
    public void setColumn(int y, String values) {
        if (y < matrix[0].length && matrix.length == ((values.length() / 2) + 1)) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][y] = Integer.parseInt(values.substring(i * 2, i * 2 + 1));
            }
        }
    }
    
    public String toString() {
        String str = "[";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += matrix[i][j];
                if (j < matrix[i].length - 1) {
                    str += ",";
                } else if (i < matrix.length - 1) {
                    str += ";";
                }
            }
        }
        str += "]";
        return str;
    }
    
    public void prettyPrint() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print('\t');
                } else {
                    System.out.print('\n');
                }
            }
        }
        System.out.println();
    }
    
    public boolean isSymmetrical() {
        MatrixChecker matrixChecker = new MatrixChecker();
        return matrixChecker.isSymmetrical(matrix);
    }
    
    public boolean isTriangular() {
        MatrixChecker matrixChecker = new MatrixChecker();
        return matrixChecker.isTriangular(matrix);
    }
}