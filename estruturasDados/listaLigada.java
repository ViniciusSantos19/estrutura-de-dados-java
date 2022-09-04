package estruturasDados;

public class listaLigada {
	public elemento primeiro;
	public elemento ultimo;
	private int tamanho;
	
	public listaLigada(){
		this.tamanho = 0;
	}
	
	public elemento getPrimeiro(){
		return primeiro;
	}
	
	public elemento getUltimo(){
		return ultimo;
	}
	
	public void setPrimerio(elemento primeiro){
		this.primeiro = primeiro;
	}
	
	public void setUltimo(elemento ultimo){
		this.ultimo = ultimo;
	}
	
	public int getTamanho(){
		return tamanho;
	}
	
	public void setTamanho(int tamanho){
		this.tamanho = tamanho;
	}
	
	public void insertNode(String nome, int id){
		elemento novoElemento = new elemento(nome, id);
		
		if(this.primeiro == null && this.ultimo == null){
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		}else{
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		
		this.tamanho++;
		
	}
	
	public elemento get(int posicao){
		elemento atual = this.primeiro;
		for(int i = 0; i < posicao;i++){
			if(atual.getProximo() != null){
				atual = atual.getProximo();
			}
		}
		return atual;
	}
	
	public boolean isEmpty(){
		if(this.primeiro == null)
			return true;
		return false;
	}
	
	public String printSLista(){
		String str = "Lista encadeada: \n";
		if(isEmpty()){
			return "A lista vazia";
		}
		
		for(elemento atual = this.primeiro; atual != null; atual = atual.getProximo()){
			str += " "+atual.getNome()+"\n";
		}
		return str;
	}
	
	public void removeNode(int num){
		elemento atual = this.primeiro;
		
		elemento anterior = null;
		for(atual = this.primeiro; atual != null; atual = atual.getProximo()){
			if (atual.getId() == num){
                /*if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else */ if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
			anterior = atual;
		}
	}
	
}
