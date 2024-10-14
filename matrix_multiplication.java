class matrix_multiplication{
    public static void main(String args[])
{
     Scanner scanner = new Scanner(System.in);
     int n1,n2,m1,m2;
     System.out.println("ENTER the size of first matrix : ");
     n1 = scanner.nextInt();
     m1 = scanner.nextInt();
     int a[][] = new int[n1][m1];
     for(int i=0;i<n1;i++){
         for(int j =0;j<m1;j++){
             a[i][j] = scanner.nextInt();
         }
     }
     System.out.println("ENTER the size of second matrix : ");
     n2 = scanner.nextInt();
     m2 = scanner.nextInt();
     int b[][] = new int[n2][m2];
     for(int i=0;i<n2;i++){
         for(int j =0;j<m2;j++){
             b[i][j] = scanner.nextInt();
         }
     }
     int c[][] = new int[n1][m2];
     if(m1 == n2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<m2;j++){
                    for(int k =0;k<n2;k++){
                        c[i][j] = c[i][j] + a[i][k]*b[k][j];
                    }
                }
             }
     for(int i=0;i<n1;i++){
         for(int j =0;j<m2;j++){
             System.out.println(c[i][j]);
         }
     }
     }
     else{
            System.out.println("INCORRECT INPUT");
     }

}
}