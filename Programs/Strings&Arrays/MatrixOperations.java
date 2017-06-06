
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author vishakha
 */
public class Assignment1 {
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=false;
        boolean flag1=false;
        int choice;
        int mat1[][];
        int mat2[][];
        int nA,nB,mA,mB,x,y;
        random r =new random();
        do
        {    
            //displaying the menu
         System.out.println("---------------------");
         System.out.println("Matrix Operations");
         System.out.println("0.Create and initialize the matrix");
         System.out.println("1.Display the matrix");
         System.out.println("2.Addition");
         System.out.println("3.Subtraction");
         System.out.println("4.Multiplication");
         System.out.println("5.Time taken for operations");
         System.out.println("6.Multiply using Strassen");
         System.out.println("7.Multiply using karatsuba");
         System.out.println("8.Exit");
         
         System.out.println("---------------------");
         System.out.println("Enter your choice:");
         
         choice=Integer.parseInt(br.readLine());
         

            switch(choice)
            {
                
             case 0:   
                   if(r.getMatrixA()!=null && r.getMatrixB()!=null)
                   {
                       System.out.println("Matrix already exists.Enter choice between 1 to 7");
                       break;
                   }
                    System.out.println("Enter the rows and columns for the matrix A");
                    System.out.print("rows:");
                    nA=Integer.parseInt(br.readLine());
                    System.out.print("columns:");
                    mA=Integer.parseInt(br.readLine());

                    System.out.println("Enter the rows and columns for the matrix B");
                    System.out.print("rows:");
                    nB=Integer.parseInt(br.readLine());
                    System.out.print("columns:");
                    mB=Integer.parseInt(br.readLine());
                 
                    if(nA<=0 || nB<=0 || mA<=0 || mB<=0)
                        {
                        flag=true;
                        
                        }
                    
                        System.out.println("Enter the range for generating random numbers");
                        System.out.print("X:");
                        x=Integer.parseInt(br.readLine());
                        System.out.print("Y:");
                        y=Integer.parseInt(br.readLine());
                        
                   if(x>y)
                        {   
                        flag=true;
                        }  

                   if(flag==true)
                   {
                       System.out.println("rows and column values cannot be zero and y should be greater than x");
                       break;
                   }
                      
        //}
        //while(flag==true);
                        r.setMatrixA(x, y,nA,mA);
                        r.setMatrixB(x, y,nB,mB);
  
                        System.out.println("Matrix created.Enter your choice");
                        break;
                 
             case 1://display the matrix
                        
                    System.out.println("Matrix A:");
                    
                    r.printMatrix(r.getMatrixA());
        
                    System.out.println("Matrix B:");
                    r.printMatrix(r.getMatrixB());
                    break;
            
             case 2://addition
                    
                   mat1=r.getMatrixA();
                   mat2=r.getMatrixB();

                   if(mat1==null && mat2==null)
                   {
                       System.out.println("Matrix doesn't exist");
                       break;
                   }  
                   if(mat1.length==mat2.length && mat1[0].length==mat2[0].length)
                    {
                    int add[][]=r.addMatrix(mat1, mat2);
                    System.out.println("Addition:");
                    r.printMatrix(add);
                    }
                   else
                    System.out.println("Addition Cannot be performed due to unequal row and column sizes.");  
                    break;
                    
             case 3://subtraction
                   mat1=r.getMatrixA();
                   mat2=r.getMatrixB();
                   
                   if(mat1==null && mat2==null)
                   {
                       System.out.println("Matrix doesn't exist");
                       break;
                   }  
                   
                    if(mat1.length==mat2.length && mat1[0].length==mat2[0].length)
                     {
                      int sub[][]=r.subtractMatrix(mat1, mat2);
                      System.out.println("Subtraction");
                      r.printMatrix(sub); 
                     }
                    else
                     System.out.println("Subtraction Cannot be performed due to unequal row and column sizes.");   
                     break;
                       
                             
             case 4 ://multiplication
                   mat1=r.getMatrixA();
                   mat2=r.getMatrixB();
                   
                   if(mat1==null && mat2==null)
                   {
                       System.out.println("Matrix doesn't exist");
                       break;
                   }  
                    if(mat1[0].length==mat2.length)
                        {    
                        int multiply[][]=r.multiplyMatrix(mat1, mat2);
                        System.out.println("Multiplication:");
                        r.printMatrix(multiply);
                        }
                        else
                            System.out.println("Multiplication cannot be performed.");
                            break;
                 
             case 5:
//                    System.out.println("Number of Operations:------------->");
//                    System.out.println("Number of Addition Operations :"+r.no_of_add);
//                    System.out.println("Number of Subtraction Operations:"+r.no_of_sub);
//                    System.out.println("Number of Multiplication Operations:For multiplying:"+r.no_of_multi+"For adding:"+r.no_of_multi_add);
//                    int total_num_of_oprations=r.no_of_add+r.no_of_sub+r.no_of_multi+r.no_of_multi_add;
//                    System.out.println("Total number of Operations in this program:"+total_num_of_oprations);
                    System.out.println("----------------------------->");
                    System.out.println("Total time taken for addition:"+r.time_add);
                    System.out.println("Total time taken for subtraction:"+r.time_sub);
                    System.out.println("Total time taken for multiplication:"+r.time_mult);
                    
                    break;
                 
             case 6:
                    System.out.println("Multiplication using Strassen");
                    mat1=r.getMatrixA();
                    mat2=r.getMatrixB();
                   
                   if(mat1==null && mat2==null)
                   {
                       System.out.println("Matrix doesn't exist");
                       break;
                   }  
                    if(mat1[0].length==mat2.length)
                        {    
                         int total[][]=new int[mat1.length][mat2[0].length];
                            long startTime = System.nanoTime();
                            //System.out.println(startTime);
                            total=r.strassen(mat1, mat2);
                            long stopTime = System.nanoTime();
                            //System.out.println(stopTime);
                            long time_strassen= stopTime - startTime;
                            
                        System.out.println("Multiplication:");
                        r.printMatrix(total);
                        
                        System.out.println("Time taken using Strassen:"+time_strassen);
                        break;
                        }
                        else
                            System.out.println("Multiplication cannot be performed.");
                    break;
                 
             case 7:
             
                   mat1=r.getMatrixA();
                   mat2=r.getMatrixB();
                   
                   if(mat1==null && mat2==null)
                   {
                       System.out.println("Matrix doesn't exist");
                       break;
                   }  
                    if(mat1[0].length==mat2.length)
                        {    
                         int total[][]=new int[mat1.length][mat2[0].length];
                            long startTime = System.nanoTime();
                            //System.out.println(startTime);
                            for(int i=0;i<mat1.length;i++)
                            {
                                for(int j=0;j<mat2.length;j++)
                                {
                                    for(int k=0;k<mat2[0].length;k++)
                                    {    
                                    //total[i][k]+=mat1[i][j]*mat2[j][k];
                                    total[i][k]+=r.karatsuba(mat1[i][j],mat2[j][k]);
                                    }
                                }
                            }
                            long stopTime = System.nanoTime();
                            //System.out.println(stopTime);
                            long time_karat= stopTime - startTime;
                            
                        System.out.println("Multiplication:");
                        //r.printMatrix(total);
                        System.out.println("Time taken using karatsuba:"+time_karat);
                        break;
                        }
                        else
                            System.out.println("Multiplication cannot be performed.");
                            //System.out.println("enter two number");
//                            long num1=Integer.parseInt(br.readLine());
//                            long num2=Integer.parseInt(br.readLine());
//                            
//                            long startTime = System.nanoTime();
//                            System.out.println(num1*num2);
//                             long stopTime = System.nanoTime();
//                             System.out.println("time:"+(stopTime-startTime));
//                             
//                             long startTime1 = System.nanoTime();
//                             System.out.println(r.karatsuba(num1, num2));
//                             long stopTime1 = System.nanoTime();
//                             System.out.println("timeKaratsuba:"+(stopTime1-startTime1));
                             
                            break;
                    
             case 8:
                   
                    System.out.println("You have chosen to exit!");
                    break;
                 
             default:
                     
                    System.out.println("You have entered invalid choice!");
            }
        
       
 
        }while(choice!=8);
    }
    
}
    class random{
        int no_of_add=0;
        int no_of_sub=0;
        int no_of_multi=0;
        
        int no_of_multi_add=0;
        static int mat1[][];
        static int mat2[][];
        
        long time_add=0;
        long time_sub=0;
        long time_mult=0;
    
 
    public void setMatrixA(int x,int y,int n,int m) 
    {

            mat1=populateRandomNumbers(x, y,n,m);  

    }
    
    public void setMatrixB(int x,int y,int n,int m)
    {
            mat2=populateRandomNumbers(x, y,n,m);  
            
    }
       
    public int[][] getMatrixA()
    {
        return mat1;
    }
    
    public int[][] getMatrixB()
    {
        return mat2;
    }
        
    public int[][] populateRandomNumbers(int x,int y,int n,int m)
    {
      int mat[][]=new int[n][m];  
      Random randomGenerator = new Random();
       int min=x;
       int max=y;
       for(int i=0;i<n;i++){
       for(int j=0;j<m;j++){
           {    
             int randomInt = randomGenerator.nextInt((max-min)+1)+min;        
                 mat[i][j]=randomInt;
           }
        }
       }
      return mat;
    }
    
    public int[][] printMatrix(int mat[][])
    {  
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
                System.out.print(mat[i][j]+"\t");
            System.out.println("");
        }
        return mat;
    }
    
    public int[][] addMatrix(int mat1[][],int mat2[][])
    {
        int total[][]=new int[mat1.length][mat1[0].length];
        long startTime = System.nanoTime();
        for(int i=0;i<mat1.length;i++)
            for(int j=0;j<mat1[0].length;j++)
            {
                total[i][j]=mat1[i][j]+mat2[i][j];
                //no_of_add++;
            }
        long stopTime = System.nanoTime();
        time_add= stopTime - startTime;
        return total;
    }
    
    public int[][] subtractMatrix(int mat1[][],int mat2[][])
    {
        int total[][]=new int[mat1.length][mat1[0].length];
        long startTime = System.nanoTime();
        for(int i=0;i<mat1.length;i++)
            for(int j=0;j<mat1[0].length;j++)
            {
                total[i][j]=mat1[i][j]-mat2[i][j];
                //no_of_sub++;
            }
        long stopTime = System.nanoTime();
        time_sub= stopTime - startTime;
        return total;
    }
    
    public int[][] multiplyMatrix(int mat1[][],int mat2[][])
    {
        int total[][]=new int[mat1.length][mat2[0].length];
        long startTime = System.nanoTime();
        //System.out.println(startTime);
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat2.length;j++)
            {
                for(int k=0;k<mat2[0].length;k++)
                {    
                total[i][k]+=mat1[i][j]*mat2[j][k];
                //no_of_multi++;
              //if(k!=0)
                  // no_of_multi_add++;
              }
                
            }
        }
        long stopTime = System.nanoTime();
        //System.out.println(stopTime);
        time_mult= stopTime - startTime;
        return total;
    }
    
    public long karatsuba(long x,long y)
    {
        int size1 = getSize(x);
        int size2 = getSize(y);
        /** Maximum of lengths of number **/
        int N = Math.max(size1, size2);
        /** for small values directly multiply **/        
        if (N < 10)
            return x * y;
        /** max length divided, rounded up **/    
        N = (N / 2) + (N % 2);    
        /** multiplier **/
        long m = (long)Math.pow(10, N);

        /** compute sub expressions **/        
        long b = x / m;
        long a = x - (b * m);
        long d = y / m;
        long c = y - (d * N);
        /** compute sub expressions **/
        long z0 = karatsuba(a, c);
        long z1 = karatsuba(a + b, c + d);
        long z2 = karatsuba(b, d);          

        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long)(Math.pow(10, 2 * N))); 

    }
    
    public int getSize(long num)
    {
        int ctr = 0;
        while (num != 0)
        {
            ctr++;
            num /= 10;
        }
        return ctr;
    }
    
    public int[][] strassen(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] R = new int[n][n];
        /** base case **/
        if (n == 1)
            R[0][0] = A[0][0] * B[0][0];
        else
        {
            int[][] A11 = new int[n/2][n/2];
            int[][] A12 = new int[n/2][n/2];
            int[][] A21 = new int[n/2][n/2];
            int[][] A22 = new int[n/2][n/2];
            int[][] B11 = new int[n/2][n/2];
            int[][] B12 = new int[n/2][n/2];
            int[][] B21 = new int[n/2][n/2];
            int[][] B22 = new int[n/2][n/2];
 
            /** Dividing matrix A into 4 halves **/
            split(A, A11, 0 , 0);
            split(A, A12, 0 , n/2);
            split(A, A21, n/2, 0);
            split(A, A22, n/2, n/2);
            /** Dividing matrix B into 4 halves **/
            split(B, B11, 0 , 0);
            split(B, B12, 0 , n/2);
            split(B, B21, n/2, 0);
            split(B, B22, n/2, n/2);
 
            /** 
              M1 = (A11 + A22)(B11 + B22)
              M2 = (A21 + A22) B11
              M3 = A11 (B12 - B22)
              M4 = A22 (B21 - B11)
              M5 = (A11 + A12) B22
              M6 = (A21 - A11) (B11 + B12)
              M7 = (A12 - A22) (B21 + B22)
            **/
 
            int [][] M1 = strassen(add(A11, A22), add(B11, B22));
            int [][] M2 = strassen(add(A21, A22), B11);
            int [][] M3 = strassen(A11, sub(B12, B22));
            int [][] M4 = strassen(A22, sub(B21, B11));
            int [][] M5 = strassen(add(A11, A12), B22);
            int [][] M6 = strassen(sub(A21, A11), add(B11, B12));
            int [][] M7 = strassen(sub(A12, A22), add(B21, B22));
 
            /**
              C11 = M1 + M4 - M5 + M7
              C12 = M3 + M5
              C21 = M2 + M4
              C22 = M1 - M2 + M3 + M6
            **/
            int [][] C11 = add(sub(add(M1, M4), M5), M7);
            int [][] C12 = add(M3, M5);
            int [][] C21 = add(M2, M4);
            int [][] C22 = add(sub(add(M1, M3), M2), M6);
 
            /** join 4 halves into one result matrix **/
            join(C11, R, 0 , 0);
            join(C12, R, 0 , n/2);
            join(C21, R, n/2, 0);
            join(C22, R, n/2, n/2);
        }
        /** return result **/    
        return R;
    }
    
    /** Function to sub two matrices **/
    public int[][] sub(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }
    /** Function to add two matrices **/
    public int[][] add(int[][] A, int[][] B)
    {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }
    /** Function to split parent matrix into child matrices **/
    public void split(int[][] P, int[][] C, int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
    }
    /** Function to join child matrices intp parent matrix **/
    public void join(int[][] C, int[][] P, int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }    
}
