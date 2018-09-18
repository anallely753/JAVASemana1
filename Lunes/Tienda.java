public class Tienda{
	
	private int edad;
	private String direccion;
	private double dinero;
	static int contador=0;

	//Constructor
	public Tienda(String direccion, double dinero){
		this.direccion=direccion;
		this.edad=edad;
		contador ++;
	}

	public String getDireccion(){
		return direccion;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}

	public Double getDinero(){
		return dinero;
	}

	public Double setPrecio(Double dinero){
		this.dinero=dinero;
	}

}

/***Cada tienda deberá contar con su dirección, la cantidad 
de dinero guardada,
 así como un contador
de productos y un contador de empleados.
 Cada producto deberá tener su nombre propio y su precio.*/
