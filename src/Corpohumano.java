public class Corpohumano {
    private double volume, densidade, altura;
    //Agora o atributo pode ser acessado diretamente, sem necessiadade de método
    public double massa;

    public Corpohumano(double massa, double volume, double densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    //agora o método é privado, e não pode ser utilizado em outras classes.
    private void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public void setAlutra(double altura) {
        this.altura = altura;
    }

    public double getMassa() {
        return this.massa;
    }
    
    public double getVolume() {
        return this.volume;
    }

    public double getDensidade() {
        return this.densidade;
    }
    
    public double getAltura() {
        return this.altura;
    }

    Corpohumano c1 = new Corpohumano(1.4, 1.3, 3.4, 3.2);

    //erro de declaração de variável, O código não pode acessar a variável massa pois está encapsulada
    //c1.massa = "2";
    
}