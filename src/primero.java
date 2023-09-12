import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class primero {
	
	int Mayores=0;
	int Menores=0;
	
	String[] nombres;
	String[] profesiones;
	int[]edades;
	int[]Documento;
	
	public primero(){
		
		Iniciar();
	}
	
	public void Iniciar() {
		
		int veces=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces"));
		
		edades = new int[veces];
		nombres = new String[veces];
		Documento = new  int[veces];
		profesiones = new String[veces];
		solicitarDatos(veces);
		mostrarDatos(veces);
	};
	

	public void solicitarDatos(int veces) {
		
		
		
		for (int i = 0; i < veces; i++) {
			String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
			Integer documento =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Documento"));
			Integer edad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
			String profesion =JOptionPane.showInputDialog("Ingrese su Profesion");
			
			nombres[i]=nombre;
			profesiones[i]=profesion;
			edades[i]=edad;
			Documento[i]=documento;
		}
		
		
		for (int i = 0; i < edades.length; i++) {
			
			if (edades[i]>=18) {
				Mayores++;
			}else {
				Menores++;
			}
			
		}
		
	
		
	}
	
	public void mostrarDatos(int veces) {

		
		JOptionPane.showMessageDialog(null,"Hay"+veces+"Personas Registradas \nMayores de edad:"+Mayores+"\nMenores de edad:"+Menores);
		
	}
}
	
	
