public class Personaje {
    //nombre
    //estura
    //peso

    protected String nombre;
    protected double estatura;
    protected double opeso;

    //comer
    //dormir
    //pensar

    public void comer(){
        System.out.println("Comiendo");
    }

    public void dormir(){
        System.out.println("Durmiendo");
    }

    public void pensar(){
        System.out.println("Pensando");
    }

    public Personaje(String nombre, double estatura, double opeso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.opeso = opeso;
        System.out.println("Estoy en el constructor Padre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getOpeso() {
        return opeso;
    }

    public void setOpeso(double opeso) {
        this.opeso = opeso;
    }
}
