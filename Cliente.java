package practica2;

public class Cliente 
{
	public String dni;
	public String nombre;
	public String direccion;
	
	public Cliente(String dni, String nombre, String direccion) 
	{
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
}
