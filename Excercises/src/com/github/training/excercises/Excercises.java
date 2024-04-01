package com.github.training.excercises;

import java.util.Scanner;

import com.github.training.excercises.bean.Cane;

public class Excercises {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		int ln_input = 0;
		
		System.out.print("Digitare il numero dell'esercizio che si vuole svolgere: ");
		ln_input = i.nextInt();
        
        if (ln_input ==1){
            Stampa_quadrato();
        }
        if (ln_input ==2){
        	Stampa_iesima_lettera();
        }
        if (ln_input ==3){
            Stampa_in_saldo_nuova_stagione();
        }
        if (ln_input ==4){
            calcola_lunghezza_stringa();
        }
        if (ln_input ==5){
            
        }
        if (ln_input ==6){
            
        }
        if (ln_input ==7){
            
        }
        if (ln_input ==8){
            
        }

    }


    public static void Stampa_quadrato (){
    	System.out.print("Digitare il numero a cui calcolare il quadrato: ");
        Scanner i = new Scanner (System.in);
        int ln_num =0;
        int ln_esponente;
        int result =0;
        ln_num = i.nextInt();
        result = ln_num;
        ln_esponente =2;
        
        for (int j=0;j<ln_esponente-1; j++){
            result = result * ln_num;
        }
        System.out.println ("il quadrato di "+ln_num+" e: "+result);
    }

    
    public static void Stampa_iesima_lettera (){
    	System.out.print("Digitare il numero da 1 a 6 a cui calcolare la lettera corrispondente: ");
        Scanner i = new Scanner (System.in);
        int ln_num =0;
        String result = null;
        ln_num = i.nextInt();
        String [] la_alfa = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","W","W","X","Y","Z"};
        
        result = la_alfa[ln_num-1];
        
        System.out.println ("la lettera corrispondente al numero "+ln_num+" è: "+result);
    }
    
    public static void Stampa_in_saldo_nuova_stagione(){
    	System.out.print("Digitare un numero da cui calcolare se è un prodoto in saldo o no: ");
        Scanner i = new Scanner (System.in);
        int ln_num =0;
        String result = null;
        ln_num = i.nextInt();
        
        if (ln_num > 30) {
            result = "Nuova stagione";
        }
        if (ln_num < 30) {
            result = "In saldo";
        }
        if (ln_num == 30) {
            result = "Non catalogato";
        }
        
        System.out.println ("il seguente articolo è: "+result);
    }    
    
    public static void  calcola_lunghezza_stringa(){
    	System.out.print("Digitare una parola a cui calcolarne la lunghezza: ");
        Scanner i = new Scanner (System.in);
        String ls_string;
        int result = 1;
        String ls_exit_loop = "Continue";
        ls_string = i.nextLine();
        char val_arr = ' ';
        
        
        try {
              while (ls_exit_loop=="Continue") {
            	  val_arr = ls_string.charAt(result-1);
            	  result ++;
              }
        }
        catch(Exception e) {
        	ls_exit_loop = "Stop";
        }
        
        result -= 1;
        
        System.out.println ("la stinga "+ls_string+" ha : "+result+" caratteri");
    }    
}
