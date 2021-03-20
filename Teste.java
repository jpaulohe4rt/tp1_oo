public class Teste {
	static Usuario u;
	static Macros m;
	static Lipidios l;
	static Alimento a;

	public static void main(String[] args) {
	
		
        u = new Usuario("Joao", 19);
		m = new Macros(10, 20 , 30, 40);
		m.setNutrientes(4);
		l = new Lipidios(11, 22, 33, 44, 55);
		l.setNutrientes(5);

		a = new Alimento("Banana");		

		
		System.out.println(u.toString());
        System.out.println(a.toString());
		m.qntNutrientes();
		m.imprimeNutrientes();
		l.qntNutrientes();
		l.imprimeNutrientes();
	}

}