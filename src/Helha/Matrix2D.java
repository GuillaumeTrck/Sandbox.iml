package Helha;

import java.util.Scanner;

public class Matrix2D
{
    public double[][] tab;
    public int nbrCol;
    public int nbrLig;

    /* constructors */
    public Matrix2D()
    {
        System.out.println("Entrez le nombre de lignes : ");
        Scanner scan = new Scanner(System.in);
        nbrLig = scan.nextInt();
        System.out.println("Entrez le nombre de colonnes : ");
        nbrCol = scan.nextInt();
        tab = new double[nbrLig][nbrCol];
    }


    public Matrix2D(int nCol, int nLig)
    {
        nbrCol=nCol;
        nbrLig=nLig;
        tab = new double[nbrLig][nbrCol];

    }

    /*Methods*/
    public void FillMatrix()
    {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nbrLig; i++)
        {
            for (int j = 0; j < nbrCol; j++)
            {
                System.out.println("Entrez la valeur : " + (i+1) + (j+1));
                tab[i][j] = scan.nextInt();

            }
        }
    }

    public void PrintMatrix()
    {
        for (int i = 0; i < nbrLig; i++) {
            for (int j = 0; j < nbrCol; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void MultiplyMatrix(Matrix2D a, Matrix2D b)
    {
        for (int k = 0; k < nbrLig; k++)
        {
            for (int j = 0; j < nbrCol; j++)
            {
                this.tab[k][j] = 0;

                for (int i = 0; i < nbrLig; i++)
                {

                    this.tab[k][j] += a.tab[k][i] * b.tab[i][j];

                }

            }
        }
    }

}
