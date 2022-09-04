package estruturasDados;

public class principal {
	public static void main(String[] args) {
		listaLigada teste =  new listaLigada();
		teste.insertNode("Vinícius", 1);
		teste.insertNode("Manuel", 2);
		teste.insertNode("Grinaldo", 3);
		teste.insertNode("Leo", 4);
		teste.removeNode(1);
		System.out.println(teste.printSLista());
		teste.removeNode(4);
		System.out.println(teste.printSLista());
		teste.removeNode(2);
		System.out.println(teste.printSLista());
		teste.removeNode(3);
		System.out.println(teste.printSLista());
		
	}
}
