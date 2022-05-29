import lombok.Getter;
import lombok.Setter;

@Getter
public class Conta {

    private double saldo;

    @Setter
    private int numeroAgencia;

    @Setter
    private int digitoAgencia;

    @Setter
    private int numeroConta;

    @Setter
    private int digitoConta;

    @Setter
    private String titular;

    @Setter
    private TipoContaEnum tipoConta;

    public void deposita(double valor) {
        if(isValorValido(valor)) {
            this.saldo = this.saldo + valor;
        }
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    private boolean isValorValido(double valor){
        return valor > 0;
    }

}