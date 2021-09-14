package projeto_reino_animal;

public class principal {
	
	public static void main(String[] args)
	{
		anfibios sapo = new anfibios("sapo","anfibios", "terra");
		sapo.informacoes();
		
		System.out.println("\n=================================");
		
		aves rouxinol = new aves("rouxionol","aves", "ceu");
		rouxinol.informacoes();
		
		System.out.println("\n=================================");

		peixes baiacu = new peixes("baiacu", "peixes", "mar");
		baiacu.informacoes();
		
		System.out.println("\n=================================");

		repteis iguana = new repteis("iguana","reptil","terra");
		iguana.informacoes();
		
		System.out.println("\n=================================");

		mamiferos humano = new mamiferos("pessoa", "mamifero", "terra");
		humano.informacoes();
		
		
	}
	
		
}
