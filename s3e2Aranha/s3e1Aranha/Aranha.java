package s3e1Aranha;

import java.util.Scanner;

public class Aranha {
	int felicidade=0;
	int fome=0;
	int dinheiro=0;
	
	void instagramar(int horas) {
		System.out.println("Vanessa Karla postou foto nova <3");
		this.felicidade+=5;
	}
	
	void cantar(int horas) {
		if (this.fome>5) {
			System.out.println("to com fome demais");
			return;
		}
		else {
			System.out.println("MAS TEM QUE ME PRENDER");
			System.out.println("TEEEEEEEEEM");
			this.fome+=horas;
			this.dinheiro+=10*horas;
			this.felicidade+=5;
		}
	}
	
	void alimentar(int qtd) {
		if (this.dinheiro<10) {
			System.out.println("não tenho dinheiro aaaaaa");
			return;
		}
		else {
			System.out.println("sou vegana agora");
			this.fome-=qtd;	
			this.dinheiro-=qtd*10;
		}
	}
	void gastar() {
		if (this.dinheiro==0) {
			System.out.println("não tenho dinheiro :(");
			return;
		}
		else {
			this.dinheiro=0;
			this.fome=0;
			this.felicidade=100;
			System.out.println("gastei todo o meu dinheiro");
			System.out.println("com dOCINHO");
			System.out.println("mas me sinto feliz");
		}
	}
		
	 void dançar (int horas) {
		 if (this.fome>5) {
				System.out.println("to com fome demais");
				return;
			}
		 else {
			 System.out.println("o adm está onlinne");
			 System.out.println("DANCE COMIGOOOO");
			 this.fome+=horas;
			 this.dinheiro+=10*horas;
			 this.felicidade+=5;
		 } 
	 }
	 
	 void status() {
		 System.out.println("-------- Ana, a aranha --------");
		 System.out.println("Felicidade: " + felicidade);
		 System.out.println("Fome: " + fome);
		 System.out.println("Dinheiro: "+ dinheiro);
	 }
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aranha ana = new Aranha();
		System.out.println("--- Bem vindo!!---");
		System.out.println("eu sou Ana, a aranha!");
		System.out.println("aqui vai o menu <3");
		System.out.println("Digite o que fazer em seguida:");
		System.out.println("instagramar n(horas) ---> vamos ficar horas e horas vendo fotos");
		System.out.println("cantar n(horas)---> laLAlAlaLALalaLAla");
		System.out.println("alimentar n(quantidade) ---> status do veiculo ");
		System.out.println("dançar n(horas) ---> dance comigo!! ");
		System.out.println("end ---> aqui acaba nossa jornada");
		
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if (ui[0].equals("end")) {
				System.out.println("ciaoooo!!");
				break;
			}
			else if(ui[0].equals("instagramar")) {
				int horas = Integer.parseInt(ui[1]);
				ana.instagramar(horas);
				ana.status();
			}
			else if(ui[0].equals("cantar")) {
				int horas = Integer.parseInt(ui[1]);
				ana.cantar(horas);
				ana.status();
			}
			else if(ui[0].equals("alimentar")) {
				int qtd = Integer.parseInt(ui[1]);
				ana.alimentar(qtd);
				ana.status();
			}
			else if(ui[0].equals("gastar")) {
				ana.gastar();
				ana.status();
			}
			else if(ui[0].equals("dançar")) {
				int horas = Integer.parseInt(ui[1]);
				ana.dançar(horas);
				ana.status();
			}
		}
	}
}