import java.util.ArrayList;

import javax.swing.JOptionPane;

public class tercero {
	
	ArrayList<String> nombres = new ArrayList<String>();
	ArrayList<Integer> estractos = new ArrayList<Integer>();
	ArrayList<Double> sueldo= new ArrayList<Double>();
	ArrayList<Double> descuento= new ArrayList<Double>();
	ArrayList<Double> sueldoFinal= new ArrayList<Double>();

	
	public tercero() {
		pedirDatos();
		
	}
	
	public void pedirDatos() {
		
		int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas desea ingresar?"));
		
		for (int i = 0; i < cantidadPersonas; i++) {
			String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
			int estracto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estracto"));
			double sueldop = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
			guardarDatos(nombre, estracto, sueldop, cantidadPersonas);
			descuento(sueldop, estracto);
			mostrar();
		}
		
		
	}
	
	public void guardarDatos(String nombre,Integer estracto,Double sueldop,int cantidad ) {
		
		for (int i = 0; i < cantidad; i++) {
			
			nombres.add(i,nombre);
			estractos.add(i,estracto);
			sueldo.add(i,sueldop);
		}		
	}
	
	public void descuento(Double sueldo,int estracto) {
		
		for (int i = 0; i < estractos.size(); i++) {
			
			if (estractos.get(i)==1 ||estractos.get(i)==2 ) {
				
				descuento.add(i,sueldo*0.02);
				sueldoFinal.add(i,sueldo+descuento.get(i));
				
			}else if (estractos.get(i)==3 ||estractos.get(i)==4 ) {
				descuento.add(i,sueldo*0.04);
				sueldoFinal.add(i,sueldo-descuento.get(i));
			}
			else if (estractos.get(i)==5 ) {
				descuento.add(i,sueldo*0.08);
				sueldoFinal.add(i,sueldo-descuento.get(i));
			}else if (estractos.get(i)==6  ) {
				descuento.add(i,sueldo*0.1);
				sueldoFinal.add(i,sueldo-descuento.get(i));
			}
		}
		
	}
	
	public void mostrar() {
		
		
		String cadena="DATOS";
		
		for (int i = 0; i < descuento.size(); i++) {
			cadena+="nombre = "+nombres.get(i)+"\n"+"Estrato = " + estractos.get(i) + "\n"+ "Sueldo Final = " + sueldoFinal.get(i)+"\n"+"Descuento =" + descuento.get(i);
		}
		
		System.out.println(cadena);
		
		
	}
	
	
	
}
