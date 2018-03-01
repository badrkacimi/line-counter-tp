# Compter-nombre-de-lignes-de-code

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

# Author : BADR KACIMI
// fichier.txt > D:\eclipse\workspace\projectName\fichier.txt to prevent FileNotFoundException

public class CountLines2 {

	public static void main(String[] args) throws IOException {
        int numbreofLines=0;
        String path="fichier.txt";
        BufferedReader  bf = new BufferedReader(new FileReader(path));
        String resultat="";
        while((resultat=bf.readLine() )!= null){
        	if(resultat.length()==0){}
        	
        else{
        	resultat=resultat.trim();
        	char PremiereChar =resultat.charAt(0);
        	if(PremiereChar=='/'){
            	char DeuxiemeChar =resultat.charAt(1);
            	if(DeuxiemeChar=='/'){}
            	else if (DeuxiemeChar=='*')
            			while (PremiereChar=='/' && DeuxiemeChar=='*') {
            				resultat=bf.readLine() ;
            			}
        }
        	else {numbreofLines=numbreofLines+1;
        
        }}
	}
    System.out.println(numbreofLines);
	bf.close();
	}}
