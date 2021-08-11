/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaUKL2;

/**
 *
 * @author MOKLET-1
 */
public class CobaUKL2 {
     public static void main(String[] args) {
     
        System.out.println("");
        int n, a, b, sukuPertama, selisih, nilaiSaatIni;//deklarasi variable 
        
        sukuPertama = 5;// deklarasi variable
        selisih = 5;//deklarasi variable
        for (a=0; a<=4; a++){//untuk pola membentuk baris dari segitiga
            for (b=0; b<a; b++){//untuk pola membentuk kolom
                nilaiSaatIni = sukuPertama;
                sukuPertama += selisih;
                System.out.print(nilaiSaatIni + " ");//mencetak nilai saat ini
                
            }
            System.out.println();
        }
        
    }
    
}
