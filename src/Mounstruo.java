import java.util.ArrayList;

//extends Nombre de la clase Padre
public class Mounstruo extends Personaje{

    // Cuernos
    // Tentaculos
    // Color
    // Habilidades
    private boolean cuernos;
    private boolean tentaculos;
    private String color;
    private ArrayList<String> habilidades;

    public boolean isCuernos() {
        return cuernos;
    }

    public void setCuernos(boolean cuernos) {
        this.cuernos = cuernos;
    }

    public boolean isTentaculos() {
        return tentaculos;
    }

    public void setTentaculos(boolean tentaculos) {
        this.tentaculos = tentaculos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Mounstruo(String nombre, double estatura, double opeso, boolean cuernos, boolean tentaculos, String color,ArrayList<String>habilidades) {
        super(nombre, estatura, opeso);
        this.cuernos = cuernos;
        this.tentaculos = tentaculos;
        this.color = color;
        this.habilidades = habilidades;
        System.out.println("SOY EL CONSTRUCTOR HIJO");
    }

    // Espantar
    // Trabajar
    // HacerReir

        public void Espantar (){
            System.out.println("booo!");
        }
        public void Trabajar (){
            System.out.println("Dejame estoy trabajando");
        }
        public void HacerReir (){
            System.out.println("Contando un chiste");
        }


    }

