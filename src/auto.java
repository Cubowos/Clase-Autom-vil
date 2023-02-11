public class auto {
    //atributos
    private String marca;
    private String sub_marca;
    private int anio;
    private int kilometraje;
    private String transmicion;

    public auto(String marca, String sub_marca, int anio, int kilometraje, String transmicion) {
        this.marca = marca;
        this.sub_marca = sub_marca;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.transmicion = transmicion;
    }

    //setters and getters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSub_marca() {
        return sub_marca;
    }

    public void setSub_marca(String sub_marca) {
        this.sub_marca = sub_marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }
//metodos
    public String avanzar(int km){
        String s = "esta avanzando " + String.valueOf(km) + " km";
        return s;
    }
    public boolean frenar(int km){

        if (km<= 0 ){
            return true;
        }else if(km > 0) return false;
        return false;
    }
    @Override
    public String toString() {
        return "auto{" +
                "marca='" + marca + '\'' +
                ", sub_marca='" + sub_marca + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + kilometraje +
                ", transmicion='" + transmicion + '\'' +
                '}';
    }

}
