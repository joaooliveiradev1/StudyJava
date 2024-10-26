import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ContaCorrente {

    int numeroConta;
    int numeroAgencia;
    String nomeCliente;
    Date dataNasc;
    double saldoConta;
    boolean contaAtiva = true;


        public void sacarValor(double valorSolicitado){

        }

        public void transfValor(ContaCorrente contaDestino, double valorTransf){

        }

        public void encerraConta(String justificativa){
            //capta a justificativa e torna o metodo falso para que se encerre a conta

        }
       public List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){
        }
        public double consultaSaldo(){
            return saldoConta;
        }
}
