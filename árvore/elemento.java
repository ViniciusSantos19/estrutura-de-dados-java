package árvore;

public class elemento {
	private String comentaro;
	private int valor;
	private elemento esquerda;
	private elemento direita;
	
	public elemento(int num, String comentario){
		this.direita = null;
		this.esquerda = null;
		this.valor = num;
		this.comentaro = comentario;
	}
	
	public int getValor(){
		return valor;
	}
	
	public void setValor(int num){
		this.valor = num;
	}
	
	public elemento getEsquerda(){
		return esquerda;
	}
	
	public elemento getDireita(){
		return direita;
	}
	
	public  void setEsquerda(elemento esquerda){
		this.esquerda = esquerda;
	}
	
	public void setDireita(elemento direita){
		this.direita = direita;
	}
	
	public String getComentario(){
		return comentaro;
	}
	
}
