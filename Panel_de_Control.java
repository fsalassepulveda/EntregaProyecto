import java.util.Random;

public class Panel_de_Control {


    private String estado;      //Estado del robot : Fighter, Battloid, Gerwalk
    Random random = new Random();
    private int l_pista = random.nextInt(500)+100; //Largo inicial de la pista, minimo = 100m
    private int altura;     //Altura a la que se encuentra el robot
    private int velocidad = 0;
    private int aceleracion;
    private int pos_robot = 0;
    private boolean pista = false;
    private boolean caminando = false;
    private  boolean armasActivar = true;

    //Constructor
    public Panel_de_Control(String estado,int altura) {
        this.estado = estado;
        this.altura = altura;

    }

    //Setter
    public String setEstado(String estado) {
        return this.estado = estado;
    }

    public void setArmasActivar(boolean armasActivar) {
        this.armasActivar = armasActivar;
    }

    public int setAltura(int altura) {
        return this.altura = altura;
    }

    public int setVelocidad(int velocidad){
        return this.velocidad = velocidad;
    }


    public int setPos_robot(int pos_robot) {
        return this.pos_robot = pos_robot;
    }

    public void setPista(boolean pista) {
        this.pista = pista;
    }

    public int setAceleracion(int aceleracion){
        aceleracion = random.nextInt(6);
        return this.aceleracion = aceleracion;
    }

    //Getter
    public String getEstado() {
        return estado;
    }

    public int getL_pista() {
        return l_pista;
    }

    public int getAltura() {
        return altura;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public int getAceleracion(){
        return aceleracion;
    }


    public int getPos_robot() {
        return pos_robot;
    }

    public boolean getPista() {
        return pista;
    }

    public boolean isArmasActivar() {
        return armasActivar;
    }
}
