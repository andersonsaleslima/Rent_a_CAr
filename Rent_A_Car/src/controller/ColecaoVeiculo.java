package controller;

import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class ColecaoVeiculo {
	private List<Veiculo> veiculo;
	
	public ColecaoVeiculo(){
		this.veiculo = new ArrayList<Veiculo>();
	}
	
	public boolean adicionarAutomovel(Veiculo veiculo) {
		
			if((veiculo != null )){
			
				this.veiculo.add(veiculo );
				return true;
			}
			return false;
	}
	

	public Veiculo pesquisaAutomovelPelaPlaca(String numerosEletras){
		int i;
	
		for( i = 0; i < this.veiculo.size(); i++){

			if(this.veiculo.get(i).getPlaca().getNumerosEletras().equals(numerosEletras)){
				//System.out.println(this.paciente.get(i));
				return this.veiculo.get(i);
			}
		}
		return null;
	}
	

	public boolean removeVeiculoPelaPlaca(String numerosEletras){
		int i;
		for( i = 0; i < this.veiculo.size(); i++){
			if(this.veiculo.get(i).getPlaca().getNumerosEletras().equals(numerosEletras)){
				this.veiculo.remove(i);
				return true;
			}
		}
		return false;
	}
		

	public void listagemAutomovel(){
		Automovel auto = null;
		
		System.out.println();
		for(int i = 0; i< this.veiculo.size(); i++){
			if(auto.getClass() == this.veiculo.getClass()){
				auto = (Automovel) this.veiculo.get(i);
				System.out.println(auto);
			}
		}
	}
	
	
	public void listagemMotocicleta(){
		Motocicleta moto = null;
		
		System.out.println();
		for(int i = 0; i< this.veiculo.size(); i++){
			if(moto.getClass()== this.veiculo.getClass()){				
				moto = (Motocicleta) this.veiculo.get(i);
				System.out.println(moto);
			}
		}
	}
	
	
}
