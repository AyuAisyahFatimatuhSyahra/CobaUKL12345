/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobaukl3;

/**
 *
 * @author MOKLET-1
 */
public class CobaUKL3 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[]args){
        int matrixA[][]={{1,6},{5,3}};//deklarasi matrixA
        int matrixB[][]={{2},{3}};//deklarasi variable matrixB
        int matrixC[][]=new int[matrixA.length][matrixB[0].length];//mendeklarasikan matrix c 
        //(matrixA.length untuk mengambil panjang array dari matrixA)(matrixB[0].length untuk mengambil panjang array pada indeks pertama = kolom matrixB)
        
        for (int a = 0; a < matrixA.length; a++){//perulangan untuk Baris matrixA 
            for(int b = 0; b < matrixB[0].length; b++){//perulangan untuk kolom matrixB
                for(int c = 0; c < matrixB.length; c++){//perulangan terakhir untuk menggabungkan/ mencari perhitungan matrixA dan matrixB
                    matrixC[a][b] += matrixA[a][c]* matrixB[c] [b];//hasil dari perhitungan kedua matrix
                }
                System.out.print(matrixC [a] [b]+" ");//menampilkan hasil matrixC 
                }
            System.out.println(" ");//
            }
        }
}
        
                
    
    

