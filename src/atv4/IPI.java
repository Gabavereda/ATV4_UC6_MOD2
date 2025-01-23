package atv4;

public class IPI implements Imposto {

    private double valor;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;

    public IPI(double valor, double frete, double seguro, double outrasDespesas, double aliquota) {
        this.valor = valor;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }

    //GETTER AND SETTER'S
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    @Override

    public double CalcularImposto() {

        double baseDoCalculo = valor + frete + seguro + outrasDespesas;

        return baseDoCalculo * (aliquota / 100);

    }

    @Override
    public String getDescricao() {

        return "IPI";
    }

}
