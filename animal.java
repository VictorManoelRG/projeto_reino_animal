package projeto_reino_animal;

public abstract class animal {
	
	public String nome;
	public String filo;
	public String ondeVivem;
	
	public boolean penas;
	public boolean escamas;
	public boolean ectotermico;
	public boolean respiracao_branquial;
	public boolean glandulas_mamarias;
	
	public animal(String nome, String filo, String ondeVivem) {
		this.nome=nome;
		this.filo=filo;
		this.ondeVivem=ondeVivem;
	}

	public boolean temPenas()
	{
		return penas;
	}
	
	public void setPenas(boolean penas)
	{
		this.penas = penas;
	}
	
	public boolean temEscamas()
	{
		return escamas;
	}
	
	public void setEscamas(boolean escamas)
	{
		this.escamas = escamas;
	}
	
	public boolean Ectotermicos() 
	{
		return ectotermico;
	}
	public void setEct(boolean ectotermico)
	{
		this.ectotermico=ectotermico;
	}
	
	public boolean respiraAgua()
	{
		return respiracao_branquial;
	}
	
	public void setResAgua(boolean respiracao_branquial)
	{
		this.respiracao_branquial=respiracao_branquial;
	}
	
	public boolean mamiferos()
	{
		return glandulas_mamarias;
	}
	
	public void setMamifero(boolean mamifero)
	{
		this.glandulas_mamarias=mamifero;
	}
	
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	
	public void setFilo(String filo)
	{
		this.filo=filo;
	}
	
	public String getFilo()
	{
		return filo;
	}
	
	public void setOndeVivem(String ondeVivem)
	{
		this.ondeVivem=ondeVivem;
	}
	
	public String getOndeVivem()
	{
		return ondeVivem;
	}
	
	public abstract void informacoes();
	
	
	
	

}
