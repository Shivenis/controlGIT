package evf.javadoc.original;


 public class Cancion {
    String nombreCancion;
    Artista artista;
    int reproduciones;

    public Cancion(String nombreCancion, Artista artista) {
        this.nombreCancion = nombreCancion;
        this.artista = artista;
    }


    public void reproducirCancion(){
        System.out.println("Reproduciendo la canción "+nombreCancion);
        reproduciones++;
    }


    public String getNombreCancion() {
        return nombreCancion;
    }


    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", artista=" + artista +
                '}';
    }
  }

