public class transposeMatrix {
    public static void main(String[] args) {
        //creating a Matrix
        int original[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        System.out.println("Print Matrix without transpose : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(original[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("Print Matrix After Transpose:");
        for(int i = 0;i < 3;i++){
            for(int j =0;j < 3;j++){
                System.out.print(original[j][i]+" ");

            }
            System.out.println();//new line
        }
    }
}