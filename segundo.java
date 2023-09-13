
import javax.swing.JOptionPane;

public class segundo {

	int numeros1[],numeros2[],suma[];

	public segundo() {
		
		pedirNumeros();
		Mostrar();
	}
	
	
	public void pedirNumeros() {
		
		int veces=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces desea ingresarlos datos?"));
		
		numeros1 = new int[veces];
		numeros2 = new int[veces];
		suma = new int [veces];
		
		
		for (int i = 0; i < veces; i++) {
			
			numeros1[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del primer array"));
			numeros2[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nuemro del segundo array"));
			suma[i]=numeros1[i]+numeros2[i];
		}
	}
	
	public void Mostrar() {
		String mensaje = "LOS RESULTADOS: \n";
		
		for (int i = 0; i < numeros1.length; i++) {
			
			
			
			mensaje+=numeros1[i]+"---";
		}
		mensaje+="\n";
		for (int o = 0; o < numeros2.length; o++) {
			
			mensaje+=numeros2[o]+"---";
		}
		mensaje+="\n";
		for (int p = 0; p < suma.length; p++) {
			mensaje+=suma[p]+"--";
		}
		
		JOptionPane.showMessageDialog(null,mensaje);
	}
}