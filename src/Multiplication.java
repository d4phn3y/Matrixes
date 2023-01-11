
public class Multiplication {
    public static void main(String[] args) {
        //matrica a
        int[][] a= {{1,2,-1},
                {3,-4,-3},
                {6,5,0}};
        //matrica b
        int[][]  b= {{2,-1,7,0},
                {3,0,4,5},
                {-2,1,-3,1}};
        //matricat e ndare
        int[][] a11= {{1,2},
                      {3,-4}};
        int[][] a12= {{-1},
                      {-3}};
        int[][] a21= {{6,5}};
        int[][] a22= {{0}};


        int[][] b11= {{2,-1,7},
                      {3,0,4}};
        int[][] b12= {{0},{5}};
        int[][] b21= {{-2,1,-3}};
        int[][] b22= {{1}};
        //matricat te perfituara nga prodhimi i submatricave dhe pastaj mbledhja e tyre
        int[][] c11=addition(product(a11,b11),product(a12,b21));
        int[][] c12=addition(product(a11,b12),product(a12,b22));
        int[][] c21=addition(product(a21,b11),product(a22,b21));
        int[][] c22=addition(product(a21,b12),product(a22,b22));


        //matrica d e perfituar nga submatricat
        int[][] d= {{c11[0][0],c11[0][1],c11[0][2],c12[0][0]},
                    {c11[1][0],c11[1][1],c11[1][2],c12[1][0]},
                    {c21[0][0],c21[0][1],c21[0][2],c22[0][0]}};

        System.out.println("The product of Submatrix A and Submatrix B :");

        for(int i = 0; i < d.length; i++)
        {
            for (int j = 0; j<d[0].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Is matrix AB in the partition form equal with matrix AB in normal form : "+ equals(d,product(a,b)));
    }
    //metode per shumezimin e dy matricave

    public static int[][]  product(int[][] a,int[][]b){

        int row1=a.length;
        int col1=a[0].length;

        int row2=b.length;
        int col2=b[0].length;

        int[][] prod =new int[row1][col2];

        if(col1 != row2) {
            System.out.println("Matrices cannot be multiplied");
        }

        else {

            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col2; j++){
                    for(int k = 0; k < row2; k++){
                        prod[i][j] = prod[i][j] + a[i][k] * b[k][j];
                    }
                }
            }}

        return prod;


    }
    //metode per mbledhjen e dy matricave

    public static int[][] addition(int[][] a,int[][] b) {

        int c[][]=new int[a.length][a[0].length];

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                c[i][j] = a[i][j]+b[i][j];
            }}
        return c;
    }

    //metode per te pare nese dy matricat jane te barabarta
    public static boolean equals(int[][] ab1,int[][] ab2) {
        boolean answer=true;
        for(int i=0;i<ab1.length;i++) {
            for(int j=0;i<ab1[0].length;j++) {
                if(ab1[i][j]==ab2[i][j]) {
                    return answer;}
                else { answer=true;}
            }
        }
        return answer;
    }

}