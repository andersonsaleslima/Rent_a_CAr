package controller;

import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class ColecaoLocacao {
	private  List<Locacao> locacao;
	
	public ColecaoLocacao(){
		this.locacao = new ArrayList<Locacao>();
	}
	
	public boolean adicionarLocacao(LocalDate dataRetirada, LocalDate dataDevolucao, Pessoa pessoa, Veiculo veiculo) {
			if((pessoa != null)&& (veiculo.getDisponibilidade()== true)){
			
				veiculo.setDisponibilidade(false);
				this.locacao.add(new Locacao(dataRetirada, dataDevolucao, pessoa, veiculo) );
				return true;
			}
			return false;
	}
	
	public Locacao pesquisaLocacaoPeloId(int id){
		int i;
		Locacao locacao;
	
		for( i = 0; i < this.locacao.size(); i++){
			locacao = this.locacao.get(i);
			if(locacao.getId()== id){
				//System.out.println(this.paciente.get(i));
				return locacao;
			}
		}
		return null;
	}
	
	public boolean removeLocacaoPeloId(int id){
		int i;
		for( i = 0; i < this.locacao.size(); i++){
			Locacao locacao = this.locacao.get(i);
			if(locacao.getId() == id ){
				locacao.getVeiculo().setDisponibilidade(true);
				this.locacao.remove(i);
				return true;
			}
		}
		return false;
	}
	

	public void listagemLocacao(){
		Locacao locacao;
		
		System.out.println();
		for(int i = 0; i< this.locacao.size(); i++){
			locacao = this.locacao.get(i);
			System.out.println(locacao);
		}
	}
	
	public boolean fecharLocacaoPeloId(int id, LocalDate dataDevolucao){
		int i;
		for( i = 0; i < this.locacao.size(); i++){
			Locacao locacao = this.locacao.get(i);
			if(locacao.getId() == id ){
				locacao.setDataRetirada(dataDevolucao);
				locacao.getVeiculo().setDisponibilidade(true);
				return true;
			}
		}
		return false;
	}
}
