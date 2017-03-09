package controller;

public class Automovel extends Veiculo{
	private int qtdDePortas;
	private int numeroDePassageiros;

	
	
	public Automovel(Placa placa, String marca, String modelo, double precoPorHra,
			int qtdDePortas, int numeroDePassageiros) {
		
		super(placa, true, marca, modelo, precoPorHra);
		
		this.qtdDePortas = qtdDePortas;
		this.numeroDePassageiros = numeroDePassageiros;
	}
	
	public int getQtdDePortas() {
		return qtdDePortas;
	}
	public void setQtdDePortas(int qtdDePortas) {
		this.qtdDePortas = qtdDePortas;
	}
	public int getNumeroDePassageiros() {
		return numeroDePassageiros;
	}
	public void setNumeroDePassageiros(int numeroDePassageiros) {
		this.numeroDePassageiros = numeroDePassageiros;
	}

	public double precoRealPorHora(){
		if(qtdDePortas <= 4){
			return super.getPrecoPorHra() * (this.qtdDePortas/4 + 0.5);
		}
		else{
			return super.getPrecoPorHra() * (this.qtdDePortas/8 + 0.5);
		}
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numeroDePassageiros;
		result = prime * result + qtdDePortas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		if (numeroDePassageiros != other.numeroDePassageiros)
			return false;
		if (qtdDePortas != other.qtdDePortas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automovel [qtdDePortas=" + qtdDePortas + ", numeroDePassageiros=" + numeroDePassageiros
				+ ", getPlaca()=" + getPlaca() + ", getDisponibilidade()=" + getDisponibilidade() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", getPrecoPorHra()=" + getPrecoPorHra()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + "]";
	}

	

}
