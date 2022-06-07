public class Caneta {
    public String modelo;
    public float ponta;
    public boolean tampada;
    private String cor;

    public  Caneta(){
        this.tampar();
        this.cor= "Azul";

    }

    private String getModelo() {
        return this.modelo;
    }
    private void setModelo(String m) {
        this.getModelo();
    }
    private float getPonta() {
        return this.getPonta();
    }
    public void setPonta(float p){
        this.ponta=p;

    }

    public void tampar() {
        this.tampada= true;

    }
    public void destampar(){
        this.tampada=false;
    }

    private void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo:"+ this.modelo);
        System.out.println("Ponta:"+ this.ponta);
        System.out.println("A cor e:"+this.cor);
        System.out.println("A caneta esta tampada:" +this.tampada);
    }


    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo="bic";
        c1.ponta=0.5f;
        c1.status();


    }


}
