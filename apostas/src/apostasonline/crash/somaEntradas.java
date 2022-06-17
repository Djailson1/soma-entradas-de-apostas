package apostasonline.crash;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class somaEntradas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		  System.out.println("Digite o valor: ");
		  double valor = scanner.nextDouble();
		  
		 /*scanner.nextDouble();*/
		
        int cont = 1;
        
		for(int x = 0; x < 4; x++){
		
    
    valor += valor * 0.30; 
    System.out.println("Entrada " + cont++ + ": " + valor);
}
	
	}

}
