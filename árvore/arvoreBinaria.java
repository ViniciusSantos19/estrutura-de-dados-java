package árvore;

public class arvoreBinaria {
	private elemento raiz;
	 public arvoreBinaria(){
		 this.raiz = null;
	 }
	 
	 public void insertLeaf(int valor, String comentario){
		 elemento novaFolha =  new elemento(valor, comentario);
		 if(raiz == null){
				this.raiz = novaFolha;
			}else{
				elemento atual = this.raiz;
				while(true){
					if(novaFolha.getValor() < atual.getValor()){
						if(atual.getEsquerda() != null){
							atual = atual.getEsquerda();
						}else{
							atual.setEsquerda(novaFolha);
							break;
						}
					}else{
						if(atual.getDireita() != null){
							atual = atual.getDireita();
						}else{
							atual.setDireita(novaFolha);
							break;
						}
					}
				}
			}
	 }
	 
	 public elemento getRaiz(){
		 return raiz;
	 }
	 
	 public void inOrder(elemento atual){
		 if(atual != null){
			 inOrder(atual.getEsquerda());
			 System.out.println(atual.getValor());
			 System.out.println(atual.getComentario());
			 inOrder(atual.getDireita());
		 }
		 
	 }
	 
	 public void preOrder(elemento atual){
		 if(atual != null){
			 System.out.println(atual.getValor());
			 System.out.println(atual.getComentario());
			 preOrder(atual.getEsquerda());
			 preOrder(atual.getDireita());
		 }
	 }
	 
	 public void posOrdem(elemento atual){
		 if(atual != null){
			 posOrdem(atual.getEsquerda());
			 posOrdem(atual.getDireita());
			 System.out.println(atual.getValor());
			 System.out.println(atual.getComentario());
		 }
	 }
	 
	 public boolean cutLeaf(int num){
		 elemento atual = this.raiz;
		 elemento  paiAtual = null;
		 
		 while(atual != null){
			 if(num == atual.getValor()){
				 break;
			 }else if(num < atual.getValor()){
				 paiAtual = atual;
				 atual = atual.getEsquerda();
			 }else{
				 paiAtual = atual;
				 atual = atual.getDireita();
			 }
		 }
		 
		 if(atual != null){
			 
			 if(atual.getDireita() != null){
				 elemento subistituto = atual.getDireita();
				 elemento paiSubistituto = atual;
				 while(subistituto.getEsquerda() != null){
					 paiSubistituto = subistituto;
					 subistituto = subistituto.getEsquerda();
				 }
				 subistituto.setEsquerda(atual.getEsquerda());
				 
				 if(paiAtual != null){
					 if(atual.getValor() < paiAtual.getValor()){
						 paiAtual.setEsquerda(subistituto);
					 }else{
						 paiAtual.setDireita(subistituto);
					 }
				 }else{
					 this.raiz = subistituto;
					 paiSubistituto.setEsquerda(null);
					 this.raiz.setDireita(paiSubistituto);
					 this.raiz.setEsquerda(atual.getEsquerda());
				 }
				 
				 if(subistituto.getValor() < paiSubistituto.getValor()){
					 paiSubistituto.setEsquerda(null);
				 }else {
					 paiSubistituto.setDireita(null);
				 }
				 
			 }else if(atual.getEsquerda() != null){
				 elemento subistituto = atual.getEsquerda();
				 elemento paiSubistituto = atual;
				 
				 while(subistituto.getDireita() != null){
					 paiSubistituto = subistituto;
					 subistituto = subistituto.getDireita();
				 }
				 
				 if(paiSubistituto != null){
					 if(atual.getValor() < paiAtual.getValor()){
						 paiAtual.setEsquerda(subistituto);
					 }else{
						 paiAtual.setDireita(subistituto);
					 }
					 
				 }else{
					 this.raiz = subistituto;
				 }
				 
				 if(subistituto.getValor() < paiSubistituto.getValor()){
					 paiSubistituto.setEsquerda(null);
				 }else{
					 paiSubistituto.setDireita(null);
				 }
				 
			 }else{
				 if(paiAtual != null){
					 if(atual.getValor() < paiAtual.getValor()){
						 paiAtual.setEsquerda(null);
					 }else{
						 paiAtual.setDireita(null);
					 }
				 }else{
					 this.raiz = null;
				 }
			 }
			 
			 return true;
			 
		 }else{
			 return false;
		 }
		 
	 }
	 
}
