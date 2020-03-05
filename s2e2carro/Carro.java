package s2e2carro;

import java.util.Scanner;

public class Carro {
	int nPessoas = 0;
	int kmetragem = 0;
	int pessoasMax = 0;
	int gasolina = 0;
	
	void embarcar(int qtd) {
		if (qtd <0) {
		System.out.println("non es posible");
		return;}
		
		else if(qtd + this.nPessoas > this.pessoasMax) {
		System.out.println("não vai dar não");
		return;}
		
		this.nPessoas+=qtd;
		}
		
	
	void setup(int qtd) {
		this.pessoasMax = qtd;
	}
	
	void desembarcar(int qtd) {
		if (qtd <0) {
			System.out.println("no puedo");
			return;
		}
			
		
		else if (this.nPessoas <qtd) {
			System.out.println("mas como???? nao da");
			return;
		}
		else {
			this.nPessoas-=qtd;
		}		
	}
	
	void show() {
		System.out.println("------- Carro -------");
		System.out.println("Nº de pessoas:"+ nPessoas);
		System.out.println("Combustível:" + gasolina);
		System.out.println("Kilometragem:" + kmetragem);
	}
	
	void dirigir(int kmt) {
		if (this.nPessoas==0) {
			System.out.println("não tem ninguém");
			return;
		}
		else if (this.gasolina < (kmt/10)) {
			System.out.println("sem gasolina");
			return;	
		}
		else{
			this.kmetragem+=kmt;
			this.gasolina = this.gasolina- kmt/10;
			System.out.println("vrumm");
		}	
	}
	
	void abastecer (int lit) {
		this.gasolina+=lit;
		System.out.println("sinta seu dinheiro indo embora");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro carro = new Carro();
		System.out.println("--- Bem vindo!!---");
		System.out.println("Primeiro, faça o setup");
		System.out.println("setup n ---> informar o numero máx de pessoas que o carro comporta");
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if (ui[0].equals("end")) {
				break;
			}
			else if(ui[0].equals("embarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.embarcar(qtd);
				carro.show();
			}
			else if(ui[0].equals("desembarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.desembarcar(qtd);
				carro.show();
			}
			else if (ui[0].equals("show")) {
				carro.show();
			}
			else if (ui[0].equals("dirigir")) {
				int kmt = Integer.parseInt(ui[1]);
				carro.dirigir(kmt);
				carro.show();
			}
			else if (ui[0].equals("abastecer")) {
				int lit = Integer.parseInt(ui[1]);
				carro.abastecer(lit);
				carro.show();
			}
			else if (ui[0].equals("setup")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.setup(qtd);
				System.out.println("Digite o que fazer em seguida:");
				System.out.println("embarcar n ---> inserir passageiros");
				System.out.println("desembarcar n ---> tirar passageiros");
				System.out.println("show ---> status do veiculo ");
				System.out.println("dirigir ---> ligar os motores e dar a partida yeah!! ");
				System.out.println("abastecer ---> gastar mtos dinheiros pq é caro, porem necessario");
			}
			else {
				System.out.println("---- Comando Inválido ----");
		scanner.close();
			}
		}
	}
}

