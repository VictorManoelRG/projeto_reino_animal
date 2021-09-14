package projeto_reino_animal;

public class mamiferos extends animal {
	public mamiferos(String nome, String filo, String ondeVivem)
	{
		super(nome, filo, ondeVivem);
		ectotermico=false;
		penas=false;
		escamas=false;
		respiracao_branquial=false;
		glandulas_mamarias=true;
	}
	
	public void informacoes()
	{
		System.out.println("Nome do animal: " + this.getNome());
		System.out.println("Filo do animal: " + this.getFilo());
		System.out.println("Onde vive o animal: " + this.getOndeVivem());
		if(ectotermico)
		{
			System.out.print("\nO animal eh ectotermico");
		}
		else {
			System.out.print("\nO animal nao eh ectotermico");

		}
		if(penas)
		{
			System.out.print("\nO animal tem penas");
		}
		else {
			System.out.print("\nO animal nao tem penas");

		}
		if(escamas)
		{
			System.out.print("\nO animal possui escamas");
		}
		else {
			System.out.print("\nO animal nao possui escamas");
		}
		if(respiracao_branquial)
		{
			System.out.print("\nO animas tem branquias");
		}
		else
		{
			System.out.print("\nO animal nao tem branquias");
		}
		if(glandulas_mamarias)
		{
			System.out.print("\nO animal possui glandulas mamarias");
		}
		else
		{
			System.out.print("\nO animal nao possui glandulas mamarias");
		}
	}
}
