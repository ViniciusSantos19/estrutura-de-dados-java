package estruturasDados;

public class elemento {
	private int id; 
	private String nome;
	private elemento proximo;
	
	public elemento(String novoNome, int idNovo){
		this.id = idNovo;
		this.nome= novoNome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public elemento getProximo(){
		return proximo;
	}
	
	public void setProximo(elemento proximo){
		this.proximo = proximo;
	}
	
}
