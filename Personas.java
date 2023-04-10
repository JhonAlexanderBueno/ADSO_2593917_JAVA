public class Personas{

	public int documento;
	public String nombres;
	public String apellidos;
	public String telefono;


    public Personas(int documento, String nombres, String apellidos,String telefono){
		this.documento = documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
	}

    public int getDocumento(){
		return this.documento;
	}

	public String getNombres(){
		return this.nombres;
	}

	public String getApellidos(){
		return this.apellidos;
	}

	public String getTelefono(){
		return this.telefono;
	}

    public void setDocumento(int documento){
		this.documento = documento;
	}

	public void setNombres(String nombres){
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

    public void mostrarDatosPersonales(){
        System.out.print(" | documento: "+this.documento);
        System.out.print(" | nombres: "+this.nombres);
        System.out.print(" | apellidos: "+this.apellidos);
        System.out.println(" | telefono: "+this.telefono);
    }

    public void mostrarResumenDatos(){
		System.out.println("  Numero de Documento: "+this.documento+" Nombre: "+this.nombres+"Apellido: "+this.apellidos+" N°. De Telefono "+this.telefono);
	}

}
