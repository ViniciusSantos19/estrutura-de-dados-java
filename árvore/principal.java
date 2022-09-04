package árvore;

public class principal {
	public static void main(String[] args) {
		arvoreBinaria teste = new arvoreBinaria();
		teste.insertLeaf(43, "teste teste");
		teste.insertLeaf(12, "Comentário 2");
		teste.insertLeaf(56, "cometario");
		teste.insertLeaf(11, "comentario 3");
		//teste.preOrder(teste.getRaiz());
		//teste.preOrder(teste.getRaiz());
		//teste.cutLeaf(56);
		//teste.cutLeaf(11);
		teste.cutLeaf(55);
		//teste.cutLeaf(43);
		teste.preOrder(teste.getRaiz());
		
	}
}
