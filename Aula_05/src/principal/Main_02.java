package principal;

import java.util.Scanner;

import entidade_.Clt;
import entidade_.Funcionario;
import entidade_.Pj;
import enum_cargo.Cargo;

public class Main_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);


		System.out.print("Digite seu nome: ");
		String nome = scn.next();


		System.out.print("Digite seu salário: ");
		double salario = scn.nextDouble();

		System.out.print("Digite o valor adicional: ");
		double adicional = scn.nextDouble();
         
		System.out.print("Digite o valor do convênio: ");
		double convênio = scn.nextDouble();
		
	    
		Funcionario p = new Pj(nome, salario, Cargo.DESENVOLVEDOR, adicional);
		
	
       
        
     
	  
		System.out.println(p);
		System.out.println(p.receber());

		scn.close();
	}

}
