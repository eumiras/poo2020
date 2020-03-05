package semana2;

public class Gato {
	String name;
	int vidas;
	int felicidade;
	void miar() {
		if (this.vidas > 0)
			System.out.println("miau");
		else
			System.out.println("...");
		
	}
	void fingirdemorto() {
		this.vidas-=1;
		this.felicidade-=1;
		System.out.println("morri hein");
	}
	
	void darcarinho() {
		this.vidas+=1;
		this.felicidade+=1;
		System.out.println("*recebendo carinho*");
	}
	
	void status() {
		System.out.println("vidas:" + vidas);
		System.out.println("felicidade:" + felicidade);
		}
	void truque() {
		if (this.felicidade==10)
			System.out.println("olhe, eu dei um salto mortal");
		this.felicidade-=10;
		this.vidas-=1;
	}
	void arengar() {
		this.vidas-=2;
		this.felicidade-=2;
	}
		
	public static void main(String[] args) {
		
		Gato ghatho = new Gato();
		ghatho.name = "Ghato Chuchu";
		ghatho.vidas = 7;
		ghatho.felicidade = 10;
		ghatho.status();
		for (int i = 0; i < 10; i+=1) {
			ghatho.miar();
			ghatho.fingirdemorto();
		}
		for (int i = 0; i < 10; i+=1) {
			ghatho.darcarinho();
		}
		ghatho.status();
		ghatho.truque();
		ghatho.arengar();
		ghatho.status();
	}
	
	
	
}

		
		
		
		
		
