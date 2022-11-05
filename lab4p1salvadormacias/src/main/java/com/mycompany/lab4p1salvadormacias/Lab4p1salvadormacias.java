package com.mycompany.lab4p1salvadormacias;

import java.util.Scanner;

import java.util.Random;

public class Lab4p1salvadormacias {

    public static void main(String[] args) {
        Scanner moly = new Scanner(System.in);
        boolean goku = true;
        do {//inicio do
            System.out.println("Bienvenido al menu!");
            System.out.println("1.Fallout words\n2.Rodatcripne \n3.Alpha\n4.Salir");
            System.out.println("Ingrese una opcion: ");
            int op = moly.nextInt();
            switch (op) {//inicio case
                case 1: {// hacer con if o switch
                    String cadena;
                    Scanner palabra = new Scanner(System.in);
                    System.out.println("comer\njugar\nsalta\nllora\nmuere\nunida\nventi\nllama\neevee\nlocal");
                    String random;
                    System.out.println("Ingrese una palabra de la lista mostrada: ");
                    int pal = moly.nextInt();
                   // switch (pal) 
                    
                    //cadena = palabra.nextLine();
                    
                }//fin case 1
                break;
                
            
            case 2:{
                    String contra;
                    Scanner pass = new Scanner (System.in);
                    contra = pass.nextLine();
                    System.out.println(newpass+" es su nueva contraseña");
                
                }//fin case 2
                break;    
                
                case 3:{
                    String cad_ev;
                    Scanner cadena_ev = new Scanner (System.in);
                    System.out.println("Ingrese la cadena que desea evaluar: ");
                    cad_ev= cadena_ev.nextLine();
                
                }//fin case 3
                break;
                
                case 4:{
                    goku = false;
                
                }//fin case 4
                break;
                default: 
                    System.out.println("Opcion ingresada no es valida");
            
            
            }//fin case
        
        
        }while (goku != false);//fin while
        }//fin main

    public static String newpass(String contra){

        String contrainvert = "";
        for (int i = contra.length() - 1; i >= 0; i--) {
            contrainvert += contra.charAt(i);
            //R<Integer> rango = Range.between(0,9);
            if (i % 2 == 0);
            int random = new Random().nextInt((9) + 1);
            //int max=9;
            //int min=0;        
            //new Random().nextInt((max - min) + 1) + min
            //a.getStreamofr       
            //+generateRandomIntIntRange(15,30)
            String contrafinal = contrainvert.replace("i", "random");
            System.out.println("La contraseña final es: +contrafinal");
        }return contrafinal;
    }//fin metodo nueva contrasena


 public static String Alpha(String cad_ev) {
        String resultado = "";
        boolean letras =  true;
        for (int i = 0; i < cad_ev.length(); i++) {
            letras =  true;
            char c = cad_ev.charAt(i);
            for (int j=65;j<=90; j++) {    
                String  Char1 = Character.toString((char) j);
                if (String.valueOf(c).equals(Char1)) {
                    letras =  false;
                } 
            
            }
           for (int p = 97; p <= 122; p++) {   
                String Char2 = Character.toString((char) p);
                if (String.valueOf(c).equals(Char2)) {
                    letras =  false;
                }
            }
        }
        if (letras) {
            resultado = "La cadena solo contiene letras";
        } else {
            resultado = "La cadena contiene caracteres que no son letras";
        }
        return resultado;
    }//fin alpha


}//fin clase


