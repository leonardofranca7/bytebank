public class CriarConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.setTipoConta(TipoContaEnum.CORRENTE);
        primeiraConta.setTitular("Leonardo França");
        primeiraConta.setNumeroAgencia(5675);
        primeiraConta.setDigitoAgencia(8);
        primeiraConta.setNumeroConta(123);
        primeiraConta.setDigitoConta(1);

        primeiraConta.deposita(200);

        Conta segundaConta = new Conta();
        segundaConta.setTipoConta(TipoContaEnum.POUPANCA);
        segundaConta.setTitular("Hamanda França");
        segundaConta.setNumeroAgencia(4567);
        segundaConta.setDigitoAgencia(7);
        segundaConta.setNumeroConta(456);
        segundaConta.setDigitoConta(2);

        segundaConta.deposita(100);

        System.out.println("Tipo de conta: " + primeiraConta.getTipoConta());
        System.out.println("Titular: " + primeiraConta.getTitular());
        System.out.println("Agência: " + primeiraConta.getNumeroAgencia() + "-" + primeiraConta.getDigitoAgencia());
        System.out.println("Número da conta: " + primeiraConta.getNumeroConta() + "-" + primeiraConta.getDigitoConta());
        System.out.println("Saldo da conta: " + primeiraConta.getSaldo());
        System.out.println();
        System.out.println("Tipo de conta " + segundaConta.getTipoConta());
        System.out.println("Titular: " + segundaConta.getTitular());
        System.out.println("Agência: " + segundaConta.getNumeroAgencia() + "-" + segundaConta.getDigitoAgencia());
        System.out.println("Número da conta: " + segundaConta.getNumeroConta() + "-" + segundaConta.getDigitoConta());
        System.out.println("Saldo da conta: " + segundaConta.getSaldo());

    }
}
