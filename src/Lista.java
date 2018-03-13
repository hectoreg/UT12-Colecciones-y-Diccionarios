import java.util.ArrayList;
import java.util.Collections;
public class Lista {
	
	ArrayList<Persona> p = new ArrayList<Persona>();
	
	public ArrayList<Persona> getP() {
		return p;
	}

	public void setP(ArrayList<Persona> p) {
		this.p = p;
	}

	public void cargar() {
		

		p.add(new Persona("Adrián","García Santos", "11111111A", 23, "C/Los Olivos", 3, 38493, "Santa Cruz de Tenerife"));
		p.add(new Persona("Ana","Méndez Núñez", "22222222B", 22, "C/Los Pinos", 25, 38403, "Santa Cruz de Tenerife"));
		p.add(new Persona("María","Sánchez Camacho", "33333333C", 45, "C/Los Franceces", 23, 38505, "Las Palmas"));
		p.add(new Persona("Julio","Brito González", "44444444D", 30, "C/Los Pinos", 25, 38403, "Las Palmas"));
		
		
	}
	
	public void listar() {
		
		for(Persona s:p) {
			
			System.out.println(s.toString());
			
		}
			
	}
	
	public void insertar(String nombre, String apellidos, String dni, int edad, String calle, int numero, int cp, String provincia) {
		
		p.add(new Persona(nombre, apellidos, dni, edad, calle, numero, cp, provincia));
		
	}
	
	public void eliminar(int posicion) {
	
		p.remove(posicion);
		
	}
	
	public void contar() {
		
		System.out.println("Hay " + p.size() + " personas en la lista");
		
	}
	
	public void buscar(String dni) {
		
		int SeEncontro = 0;
		for (Persona s:p) {
			
			if (s.getDni().equals(dni)) {
				
				System.out.println("La persona que busca es " + s.toString());
				SeEncontro = 1;
				
			}
			
			
		}
		
		if(SeEncontro == 0) {
			
			System.out.println("La persona que busca no se encuentra en la lista.");
			
		}
		
	}
	
	public void ordenar() {
		
	Collections.sort(p);
	System.out.println(p);

}
	
}
