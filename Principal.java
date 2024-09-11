package AbstrataAnimal;
public class Principal {

	public static void main(String[] args) {


		Lobo lobo = new Lobo("Lobinho", "Macho", "Lobo");
		lobo.dormir();
		lobo.caminhar();
		lobo.correr();
		lobo.emitirSom();

		System.out.println("------------------------");

		Leao leao = new Leao ("Rei","Macho","Leao");
		leao.dormir();
		leao.caminhar();
		leao.correr();
		leao.emitirSom();


		System.out.println("------------------------");

		Tigre tigre  = new Tigre ("Bravinho", "Macho", "Tigre");
		tigre.dormir();
		tigre.caminhar();
		tigre.correr();
		tigre.emitirSom();


		System.out.println("------------------------");

		Cachorro cachorro = new Cachorro("Scott","Macho","Husky Siberiano");
		cachorro.dormir();
		cachorro.caminhar();
		cachorro.correr();
		cachorro.emitirSom();

		System.out.println("------------------------");

		Gato gato= new Gato("Mia","Fêmea","Siamês");
		gato.dormir();
		gato.caminhar();
		gato.correr();
		gato.emitirSom();


	}


}


