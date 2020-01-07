package aula_09;

public class Aula09 {

	public static void main(String[] args) {

		/* Declarando vetor Pessoa */
		Pessoa[] p = new Pessoa[2];

		p[0] = new Pessoa("Rodrigo", 33, "M");
		p[1] = new Pessoa("Joana", 55, "F");

		/* Declarando vetor Livro */
		Livro[] l = new Livro[3];

		l[0] = new Livro("Apredendo java", "José da Silva", 300, p[0]);
		l[1] = new Livro("Poo para iniciantes", "Pedro Paulo", 200, p[1]);
		l[2] = new Livro("Java anaçado", "Maria Candidata", 250, p[0]);
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());

	}

}
