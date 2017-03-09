package controller;

import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;


public class ColecaoPessoa {
	private  List<Pessoa> pessoa;
	
	public ColecaoPessoa(){
		this.pessoa = new ArrayList<Pessoa>();
	}
	
	public boolean adicionarPessoa(Pessoa pessoa) {
			if(pessoa != null){
			
				this.pessoa.add(pessoa);
				return true;
			}
			return false;
	}

	public Pessoa pesquisaPessoaPeloCPF(String cpf){
		int i;
	
		for( i = 0; i < this.pessoa.size(); i++){
			if(this.pessoa.get(i).getCpf().equals(cpf)){
				//System.out.println(this.paciente.get(i));
				return this.pessoa.get(i);
			}
		}
		return null;
	}
	
	public boolean removePessoaPeloCPF(String cpf){
		int i;
		for( i = 0; i < this.pessoa.size(); i++){
			if(this.pessoa.get(i).getCpf().equals(cpf)){
				this.pessoa.remove(i);
				return true;
			}
		}
		return false;
	}
	

	public void listagemCliente(){
		Cliente client = null ;
		
		System.out.println();
		for(int i = 0; i< this.pessoa.size(); i++){
			if(client.getClass() == this.pessoa.getClass()){
				client = (Cliente) this.pessoa.get(i);
				System.out.println(client);
			}
		}
	}
	
	public void listagemFuncionario(){
		Funcionario func = null;
		
		System.out.println();
		for(int i = 0; i< this.pessoa.size(); i++){
			if(func.getClass() == this.pessoa.getClass()){
				func = (Funcionario) this.pessoa.get(i);
				System.out.println(func);
			}
		}
	}
}