/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaUKL1;

/**
 *
 * @author MOKLET-1
 */
public class CobaUKL1 {
    
    public static void main(String[]args){
        
        int a = 5; //a adalah nilai tinggi segitiga
        int selisih = 5;//nilai selisih adalah perbedaan nilai setiap suku pada suatu bilangan
        int sukuPertama = 5;//sebagai nilai suku pertama atau suku awal dari deret bilangan
        int nilaiSaatIni = 0;//kondisi nilai saat ini
        int totalNilai = 0;//
        
        for (int i = 1; i <= a; i++){//untuk membuat baris dari segitiga
            for(int b = i; b<= a; b++){//for untuk membuat kolom dari segitiga
                nilaiSaatIni = sukuPertama;//disini terjadinya perulangan nilaiSaatIni yang berjumalh 5 dan sukuPertama berjumlah 5
                sukuPertama += selisih;//Ketika perulangan ke 2 (nested) berjalan maka nilai sukuPertama akan terus bertambah 5, jadi perulangan pertama sukuPertama bernilai 5, maka
                                                           //perulangan kedua akan bertambah 5, menjadi 10, dan seterusnya.
                System.out.print(nilaiSaatIni + " ");//mencetak nilaiSaatIni
            
        
            }
        System.out.println("");
        }
    }
}

    

