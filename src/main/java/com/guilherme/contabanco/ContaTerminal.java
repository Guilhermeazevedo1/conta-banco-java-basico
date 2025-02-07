package com.guilherme.contabanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência");
        String usuarioAgencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta");
        int usuarioConta = scanner.nextInt();

        if (usuarioAgencia.equals(agencia)  && usuarioConta == numero) {
            System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }else{
            System.out.println("Informação errada, porfavor verifique as credenciais pedidas");
        }


    }
}
