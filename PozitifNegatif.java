
package pozitifnegatif;

public class PozitifNegatif {

    public static void main(String[] args) {
        
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                int sayi;
	System.out.println("Sayi giriniz:");
        sayi=scanner.nextInt(); //Klavyeden giriş istiyoruz
	  if(sayi>0) //Eğer ki girilen sayı 0'dan büyükse, sayı pozitiftir
	    System.out.println("Girilen sayi POZITIF");	
 
	  else //Eğer ki girilen sayı 0'dan küçükse, sayı negatiftir
	    System.out.println("Girilen sayi NEGATIF") ;
}


    }
    
 
