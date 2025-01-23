package atv4;

import java.util.ArrayList;
import java.util.List;

public class Pagamentos {

    private String nomeEmpresa;
    private List<Imposto> listaImposto;

    public Pagamentos(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.listaImposto = new ArrayList<>();
    }

    //GETTER AND SETTER'S
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Imposto> getListaImposto() {
        return listaImposto;
    }

    public void setListaImposto(List<Imposto> listaImposto) {
        this.listaImposto = listaImposto;
    }

    public void adicionarImposto(Imposto imposto) {

        listaImposto.add(imposto);
    }

    public void calcularTotalImposto() {

        for (Imposto imposto : listaImposto) {

            System.out.println("Descrição: " + imposto.getDescricao());
            System.out.println("Total calculado: R$ " + imposto.CalcularImposto());
            System.out.println("-------------");

        }

    }

}
