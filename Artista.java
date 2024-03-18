package evf.javadoc.original;

public class Artista {
    String nombreArtista;
	//
    public Artista(String nombreArtista) {
	//Hola
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
    //Daniel Corona Aguilar
    public void metodoNuevo(){
    	System.out.println("¡Hola!");
    }
}


