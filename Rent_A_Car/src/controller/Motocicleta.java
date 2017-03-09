package controller;

public class Motocicleta extends Veiculo{
	private String estilo;

	public Motocicleta(Placa placa, String marca, String modelo, double precoPorHra,
			String estilo) {
		
		super(placa, true, marca, modelo, precoPorHra);
		this.estilo = estilo;
	}
	
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public double precoRealPorHora() {
		
		switch(this.estilo){
		
		case "motocross" :
			return super.getPrecoPorHra() * 1.2;
		case "CB" :
			return super.getPrecoPorHra() * 1.2;
		case "harley" :
			return super.getPrecoPorHra() * 1.2;
		case "XRE" :
			return super.getPrecoPorHra() * 1.2;
		case "Falcon" :
			return super.getPrecoPorHra() * 1.2;
		case "Pop" :
			return super.getPrecoPorHra() * 1.2;
		case "cinquentinha" :
			return super.getPrecoPorHra() * 1.2;
		case "comun" :
			return super.getPrecoPorHra() * 1.2;
		default :
			return super.getPrecoPorHra();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((estilo == null) ? 0 : estilo.hashCode());
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
		Motocicleta other = (Motocicleta) obj;
		if (estilo == null) {
			if (other.estilo != null)
				return false;
		} else if (!estilo.equals(other.estilo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Motocicleta [estilo=" + estilo + ", getPlaca()=" + getPlaca() + ", getDisponibilidade()="
				+ getDisponibilidade() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecoPorHra()=" + getPrecoPorHra() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + "]";
	}
	
	
	

}
