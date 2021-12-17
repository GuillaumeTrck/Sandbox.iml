package Helha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        boolean in = false;
        System.out.println("in is " + in);
        in = truifier(in);
        System.out.println("in is " + in);

        int[] test={3,2,1,15,25,7,99,58};

        Arrays.sort(test);
        for (int i = 0; i < test.length  ; i++) {
            System.out.println(test[i]);

        }
        test(test);
        System.out.println(test[0]+" "+test[1]+" "+test[2]);

        myMethod();


      /*  double[][] nbtp = new double[3][];
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Quelle est le nombre de températures pour la séquence : " + (i+1));
            Scanner scan = new Scanner(System.in);
            int sqce =scan.nextInt();
            nbtp[i] = new double[sqce];
            for (int j = 0; j <sqce; j++)
            {
                System.out.println("Donnez la valeur de la température " + (j+1));
                double valeurtemp = scan.nextDouble();
                nbtp[i][j] = valeurtemp;
            }

        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < nbtp[i].length; j++)
            {
                System.out.print(nbtp[i][j] + " ");
            }
            System.out.println();
        } */
        /*
        double[][] matrice1 = {{1,2,3},{4,5,6},{7,8,9}};
        double[][] matrice2 = {{9,8,7},{6,5,4},{3,2,1}};
        double[][] matriceresultat = new double[3][3];
        for (int k = 0; k < 3; k++)
        {
            for (int j = 0; j < 3; j++)
            {
                matriceresultat[k][j] = 0;

                for (int i = 0; i < 3; i++)
                {

                    matriceresultat[k][j] += matrice1[k][i] * matrice2[i][j];

                }

            }
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < matriceresultat.length; j++)
            {
                System.out.print(matriceresultat[i][j] + " ");
            }
            System.out.println();
        } */



            Matrix2D matrice1 = new Matrix2D();
            matrice1.FillMatrix();
            Matrix2D matrice2 = new Matrix2D();
            matrice2.FillMatrix();
            Matrix2D matriceResultat = new Matrix2D(matrice1.nbrLig, matrice2.nbrCol);
            matriceResultat.MultiplyMatrix(matrice1,matrice2);
            matriceResultat.PrintMatrix();

            }


    private static void test(int[] test) {
        test[1]=10;
        System.out.println(test[0]+" "+test[1]+" "+test[2]);
    }

    private static boolean truifier(boolean bool) {
        if (bool == false) {
            bool = true;
        }
        System.out.println("bool is " + bool);
        return bool;
    }

    static void myMethod(){
        System.out.println("I just got executed !");
    }
}


