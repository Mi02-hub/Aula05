package entidade_;

import enum_cargo.Cargo;

public class Clt extends Funcionario{

	private double convenio;



	public Clt(String nome, double salario, Cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
	}



	public double getConvenio() {
		return convenio;
	}



	public void setConvenio(double convenio) {
		this.convenio = convenio;
	}



	public double Receber() {
		return salario * 0.9 - convenio;
	}

}
