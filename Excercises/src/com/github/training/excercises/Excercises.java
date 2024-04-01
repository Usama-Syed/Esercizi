package com.github.training.excercises;

import java.util.Scanner;

import com.github.training.excercises.bean.Cane;

public class Excercises {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		int ln_input; 
		String ls_val_loop;
		
		ln_input= 0;
		ls_val_loop ="Resta";
		
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
            calcola_val_max();
        }
        if (ln_input ==6){
            verifica_numero_primo();
        }
        if (ln_input ==7){
            calcola_valore_medio();
        }
        if (ln_input ==8){
            bubble_sort();
        }

    }


    public static void Stampa_quadrato (){
    	System.out.print("Digitare il numero a cui calcolare il quadrato: ");
        Scanner i = new Scanner (System.in);
        int ln_num =0;
        int ln_esponente;
        int result;

        result =0;
        ln_num = i.nextInt();
        result = ln_num;
        ln_esponente =2;
        
        i.close();
        for (int j=0;j<ln_esponente-1; j++){
            result = result * ln_num;
        }
        System.out.println ("il quadrato di "+ln_num+" e: "+result);
    }

    
    public static void Stampa_iesima_lettera (){
    	System.out.print("Digitare il numero da 1 a 6 a cui calcolare la lettera corrispondente: ");
        Scanner i = new Scanner (System.in);
        int ln_num;
        
        String result = null;
        ln_num = i.nextInt();
        
        i.close();        
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
        i.close();
        
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
        int result;
        
        result = 1;
        String ls_exit_loop = "Continue";
        ls_string = i.nextLine();
        char val_arr = ' ';
        
        i.close();
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
    
    public static void  calcola_val_max(){
    	
    	System.out.print("Digitare il numeor di elementi che vorresti inserire: ");
        Scanner i = new Scanner (System.in);
        Scanner i2 = new Scanner (System.in);
        int ln_num_elem;
        int result;
        int ln_switch_val;
        
        ln_num_elem = i.nextInt();
        int [] la_array = new int[ln_num_elem];
        
        for (int j =0; j<la_array.length; j++) {
        	System.out.print("Digitare il valore numero "+j+": ");
        	la_array[j] = i2.nextInt();
        }
        
        i.close();
        i2.close();
        
        for (int y =0; y<la_array.length; y++) {
            if (la_array[0]<la_array[y]) {
            	ln_switch_val = la_array[0];
            	la_array[0] = la_array[y];
            	la_array[y] = ln_switch_val;
            }
        }
        result = la_array[0];
        
        System.out.print("Ecco il valore massimo dell'array=> "+result);
    }   
    
    
    public static void  verifica_numero_primo(){
    	
    	System.out.print("Digitare un numero intero per la verifica: ");
        Scanner i = new Scanner (System.in);
        int ln_elem=0;
        ln_elem = i.nextInt();
        String result ="Empty";
        i.close();
        
        for (int j =2; j<ln_elem; j++) {
        	if(ln_elem%j==0) {
        		result = ln_elem+" non è un numero primo";
        		break;
        	}
        }
        
        if (result =="Empty") {
        	result = ln_elem+" è un numero primo";
        }
        
        System.out.print(result);
    }   
    
    
    public static void  calcola_valore_medio(){
    	
    	System.out.print("Digitare il numeor di elementi che vorresti inserire: ");
        Scanner i = new Scanner (System.in);
        Scanner i2 = new Scanner (System.in);
        int ln_num_elem_eq;
        int ln_num_elem_ev;
        int ln_num_elem;
        String result;
        int avg_ev;
        int avg_eq;
        int avg_comp;
        
        result = "";
        avg_comp =0;
        avg_ev=0;
        avg_eq=0;
        ln_num_elem = i.nextInt();
        int [] la_array = new int[ln_num_elem];
        int [] la_array_avg = new int[ln_num_elem];
        
        // readiness of num_elements of array_ev and array_eq
        if (ln_num_elem%2 ==0) {
        	ln_num_elem_eq= ln_num_elem/2;
        	ln_num_elem_ev= ln_num_elem/2;
        }
        else {
        	ln_num_elem_eq= ((ln_num_elem-1)/2);        	
        	ln_num_elem_ev= ((ln_num_elem-1)/2)+1;
        }
        
      
       //Create the array input and other things for the avg calculation
        for (int j =0; j<la_array.length; j++) {
        	System.out.print("Digitare il valore numero "+j+": ");
        	la_array[j] = i2.nextInt(); 
        	
        	if ((j+1)%2!=0) {
        		if (j+1==la_array.length-1) {
        			System.out.print("Digitare il valore numero "+(j+1)+": ");
                	la_array[j+1] = i2.nextInt();
            		avg_ev += la_array[j];
            		avg_eq += la_array[j+1];
            		break;
            	}
        		else {
        			avg_ev += la_array[j];
             	}
        	}
       		else  {
       			if (j+1==la_array.length-1) {
       				System.out.print("Digitare il valore numero "+(j+1)+": ");
       	        	la_array[j+1] = i2.nextInt();
       	        	avg_eq += la_array[j];
       	        	avg_ev += la_array[j+1];
            		break;
            	}
       			else {
       				avg_eq += la_array[j];
       			}
       		}
        }
        
        i.close();
        i2.close();
        
        // make the various AVG
        avg_comp = (avg_ev+avg_eq)/la_array.length;
        avg_ev = avg_ev/ln_num_elem_ev;
        avg_eq = avg_eq/ln_num_elem_eq;
        
        // check and assign 0,1,-1 and print for each value if is greather or not than the complex avg 
        for (int y =0; y<la_array.length; y++) {
        	if (la_array[y]>avg_comp) {
        		la_array_avg[y]= 1;
        	}
        	if (la_array[y]<avg_comp) {
        		la_array_avg[y]= -1;
        	}
        	if (la_array[y]==avg_comp) {
        		la_array_avg[y]= 0;
        	}
        	if (la_array_avg[y]== 0) {
        		result ="- Il seguente valore: "+la_array[y]+" è stato 'SCARTATO'";
        	}
        	if (la_array_avg[y]== -1) {
        		result ="- Il seguente valore: "+la_array[y]+" è 'INVALIDO'";
        	}
        	if (la_array_avg[y]== 1) {
        		result ="- Il seguente valore: "+la_array[y]+" è 'VALIDO'";
        	}
        	System.out.println(result);
        }
    }
    
    public static void  bubble_sort(){
    	
    	System.out.print("Digitare il numeor di elementi che vorresti inserire: ");
        Scanner i = new Scanner (System.in);
        Scanner i2 = new Scanner (System.in);
        int ln_num_elem;
        int ln_switch_val;
        
        ln_num_elem = i.nextInt();
        int [] la_array = new int[ln_num_elem];
        
        for (int j =0; j<la_array.length; j++) {
        	System.out.print("Digitare il valore numero "+j+": ");
        	la_array[j] = i2.nextInt();
        }
        
        i.close();
        i2.close();
        
        for (int a =0; a<la_array.length; a++) {
            for (int b=a+1;b<la_array.length;b++) {
            	if (la_array[a]>la_array[b]) {
            		ln_switch_val = la_array[a];
                	la_array[a] = la_array[b];
                	la_array[b] = ln_switch_val;
            	}
            }
        }

        for (int x =0; x<la_array.length; x++) {
        	System.out.print(+la_array[x]+" - ");
        }
    } 
}
