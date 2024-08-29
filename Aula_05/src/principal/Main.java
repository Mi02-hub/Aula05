package principal;

import java.util.Scanner;

import entidade.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		 Pessoa pessoa = new Pessoa ("millena", 17, 1200);
		
		System.out.println(pessoa);
	
		
	
	
	scn.close();
	}

}
