package atv4;

import java.util.Scanner;

public class ATV4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pagamentos pagamentos = new Pagamentos("Minha Empresa");

        String entradaUsuario;

        while (true) {
            System.out.println("Escolha o tipo de imposto (PIS ou IPI), ou digite 'pare' para encerrar: ");
            String tipoImposto = entrada.nextLine().trim();

            if (tipoImposto.equalsIgnoreCase("pare")) {
                break;
            }

            switch (tipoImposto.toUpperCase()) {
                case "PIS":
                    System.out.println("Digite os dados do PIS (debito credito): " + "\n" + "Sempre aperte espaco a cada valor");
                    entradaUsuario = entrada.nextLine().trim();
                    String[] dadosPIS = entradaUsuario.split(" ");
                    double debitoPIS = Double.parseDouble(dadosPIS[0].trim());
                    double creditoPIS = Double.parseDouble(dadosPIS[1].trim());
                    pagamentos.adicionarImposto(new PIS(debitoPIS, creditoPIS));
                    break;
                case "IPI":
                    System.out.println("Digite os dados do IPI (valor frete seguro outrasDespesas aliquota):" + "\n" + "Sempre aperte espaco a cada valor");
                    entradaUsuario = entrada.nextLine().trim();
                    String[] dadosIPI = entradaUsuario.split(" ");
                    double valorIPI = Double.parseDouble(dadosIPI[0].trim());
                    double freteIPI = Double.parseDouble(dadosIPI[1].trim());
                    double seguroIPI = Double.parseDouble(dadosIPI[2].trim());
                    double outrasDespesasIPI = Double.parseDouble(dadosIPI[3].trim());
                    double aliquotaIPI = Double.parseDouble(dadosIPI[4].trim());
                    pagamentos.adicionarImposto(new IPI(valorIPI, freteIPI, seguroIPI, outrasDespesasIPI, aliquotaIPI));
                    break;
                default:
                    System.out.println("Tipo de imposto inválido. Tente novamente.");
                    break;
            }
        }

        pagamentos.calcularTotalImposto();
    }

}
