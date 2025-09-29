package contaCorrente.app;

import contaCorrente.exceptions.OperacaoInvalidaException;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean processarOperacao(String tipo, double valor) throws OperacaoInvalidaException {
        switch (tipo.toLowerCase()) {
            case "deposito":
                if (valor < 0) throw new OperacaoInvalidaException();
                saldo += valor;
                return true;
            case "saque":
                if (valor > 0) throw new OperacaoInvalidaException();
                if (saldo + valor < 0) return false;
                saldo += valor;
                return true;
            case "pix":
                if (valor > 0) {
                    saldo += valor;
                    return true;
                } else {
                    if (saldo + valor < 0) return false;
                    saldo += valor;
                    return true;
                }
            default:
                throw new OperacaoInvalidaException();
        }
    }

    public double getSaldo() {
        return saldo;
    }
}