

public class Main {
    // x x x x
    // x     x
    // x     x
    // x x x x

    public static int [][] massive = new int[8][8];
    public static void main(String[] args) {
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if(i == 0) {
                    massive[i][j]=1;
                } else if(i== massive.length-1){
                    massive[i][j]=1;
                } else if (i!=0 && i!= massive.length-1){
                    massive[i][0]=1;
                    massive[i][massive[i].length-1]=1;
                }
            }
        }
        for (int i = 0; i < massive.length; i++) {

            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j]+" ");

            }
            System.out.println();
        }
    }
}