package controller;

import java.text.ParseException;
import java.util.Scanner;

import atividade3.Endereço;


public class TesteRent_A_Car {
	
	private static ColecaoLocacao locacao = new ColecaoLocacao();
	private static ColecaoPessoa pessoa = new ColecaoPessoa();
	private static ColecaoVeiculo veiculo = new ColecaoVeiculo();
	
	public static void main(String[] args){
		int op = 0, i=0;
		Scanner sc = new Scanner(System.in);
		String cpf = new String();
		String nome = new String();
		Endereco endereco = new Endereco();
		String end = new String();
		String data = new String();
		String numeroPlaca;
		int id;
		
		do{
			System.out.println("Menu ");
			System.out.println("0- Sair");
			
			System.out.println("\nPessoas:");
			System.out.println("1- Adicionar Pessoa");
			System.out.println("2- Pesquisar pelo CPF");
			System.out.println("3- Remover pelo CPF");
			System.out.println("4- Listagem de Funcionarios");
			System.out.println("5- listagem de Clientes");
		
			System.out.println("\nVeiculo:");
			System.out.println("6- Adicioanr veiculo");
			System.out.println("7- Pesquisar pela placa");
			System.out.println("8- Remover veiculo");
			System.out.println("9- Listagem de Automoveis");
			System.out.println("10- Listagem de motocicletas");
			
		
			System.out.println("\nLocacao");
			System.out.println("11- Adicionar Locacao");
			System.out.println("12- Quantidade de Locacao");
			System.out.println("13- Listar Locacao");
			System.out.println("14- Remover Locaco pelo ID");
		
			System.out.print("\nOpção: ");
			op = LerNumero();
			
			if(op==1){
				if(adicionarPessoa()){
					System.out.println("Pessoa adicionada com sucesso"); 
				}
			}			
			if(op==2){
				System.out.print("digite o CPF: ");
				cpf = LerDocumento();
				System.out.println(pessoa.pesquisaPessoaPeloCPF(cpf).toString());
			}
			if(op==3){
				System.out.print("digite o documento: ");
				cpf = LerDocumento();
				pessoa.removePessoaPeloCPF(cpf);
			}
			if(op==4){
				pessoa.listagemFuncionario();
			}
			if(op==5){
				pessoa.listagemCliente();
			}
			
			/*Médico*/
			if(op==6){
				if(adicionarVeiculo()){
					System.out.println("veiculo adicionado com sucesso");
				}
			}
			if(op==7){
				System.out.print("digite o numero da placa: ");
				numeroPlaca = sc.nextLine();
				System.out.println(veiculo.pesquisaAutomovelPelaPlaca(numeroPlaca).toString());
			}
			if(op==8){
				System.out.print("digite o numero da placa: ");
				numeroPlaca = sc.nextLine();
				veiculo.removeVeiculoPelaPlaca(numeroPlaca);
			}
			if(op==9){
				veiculo.listagemAutomovel();
			}
			if(op==10){
				veiculo.listagemMotocicleta();;
			}
			
			
			
			/*Consulta*/
			if(op==11){
				if(adicionarLocacao()){
					System.out.println("Locacao adicionada com sucesso");
				}
			}
			/*if(op==12){
				locacao.quantidadeLocacao;
			}*/
			if(op==13){
				locacao.listagemLocacao();
			}
			if(op==14){
				System.out.print("Digite o ID da locacao: ");
			}
			if(op==14){
				System.out.print("Digite o documento do paciente: ");
				id = LerNumero();
				locacao.removeLocacaoPeloId(id);
			}
			
			System.out.println();
		}while(op!=0);
	}

	public static int LerNumero(){
		Scanner sc = new Scanner(System.in);
		
		if( !sc.hasNextInt())
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um numero: ");
			return LerNumero();
		}
		return sc.nextInt();
	}
	
	
	public static String LerDocumento(){
		Scanner sc = new Scanner(System.in);
	
		if( !sc.hasNextInt())
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um numero: ");
			return LerDocumento();
		}
		return sc.nextLine();
	}
	
	public static String LerNome(){
		Scanner sc = new Scanner(System.in);
		if( sc.hasNextDouble()  ||  sc.hasNextInt() )
		{
			sc.next();
			System.out.printf("\nvoce deve digitar um nome: ");
			return LerNome();
		}
		return sc.nextLine();
	}
	
	/* opcção 1*/
	public static boolean adicionarPessoa() throws ParseException{
		int op = 0;
		Scanner sc = new Scanner(System.in);
		String documento = new String();
		String nome = new String();
		Endereco endereco = new Endereco();
		String end = new String();
		String data = new String();
		
		System.out.print("digite o CPF: ");
		documento = LerDocumento();
		if(pessoa.pesquisaPessoaPeloCPF(documento)!= null){
			System.out.println("paciente já está cadastrado");
			return false;
		}
		System.out.print("digite o nome do paciente: ");
		nome = LerNome();
		System.out.print("digite o endereço do paciente: ");
		System.out.print("Cep: ");
		end = sc.nextLine();
		endereco.setCep(end);
		System.out.print("rua: ");
		end = sc.nextLine();
		endereço.setRua(end);
		System.out.print("bairro: ");
		end = sc.nextLine();
		endereço.setBairro(end);
		System.out.print("Complemento: ");
		end = sc.nextLine();
		endereço.setComplemento(end);
		System.out.print("digite a data de nascimento do paciente(dd/MM/yyyy): ");
		data = LerData();
		
		Pessoa pes = new Pessoa() 
		if(!pessoa.adicionarPessoa(pes)){
			System.out.println("erro ao cadastrar paciente");
			return false;
		}
		return true;
	}
	
	
}
