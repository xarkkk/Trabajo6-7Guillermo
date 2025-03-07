/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Jugador {

	private String nombre;
	private Tablero tablero;
	
	private Ficha ficha;
	
	public Jugador(String nombre, Tablero tablero) {
		
		this.nombre = nombre;
		this.tablero = tablero;
		
	}
	
	public void tirarDado(Dado d) {
		
		d.tirar();
		
	}
	
	public int consultarDado(Dado d) {
		
		return d.mostrarTirada();
		
	}
	
	public int consultarTablero() {
		
		int[] casillas = tablero.consultarCasillas();
		
		int posicion = 0;
		
		for (int i = 0; i<tablero.consultarNumCasillas(); i++) {
			
			if (casillas[i]==1) {
				
				posicion = i;
				break;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public void moverFicha(int cs) {
		
		ficha.mover(cs);
		
	}
	
	public String getNombre(){
		
		return nombre;
		
	}
	
}
