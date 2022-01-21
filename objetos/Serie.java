package objetos;

public class Serie {

	//Atributos
	private String titulo;
	private int numeroTemporada = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	//Constructores
	public Serie() {		
	}

	public Serie(String titulo, String creador) {		
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporada, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporada = numeroTemporada;
		this.genero = genero;
		this.creador = creador;
	}

	//toString
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporada=" + numeroTemporada + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}	
}
