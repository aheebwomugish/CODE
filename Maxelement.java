public class Maxelement {
    final static int N=3;
    final static int M= 3;
    static int findMax(int mat[][]){
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i< N; i++ ){
            for (int j = 0; j < M; j++) {
                if (mat[i][j] > maxElement)
                    maxElement= mat[i][j];
            }
        }
        return maxElement;
    }
    public static void main(String[] args){
        int mat[][] = { { 1,2,3},
            {45,76,78},
            {3,6,9} };
        System.out.println(findMax(mat));
    }
}
