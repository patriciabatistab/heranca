package org.example;


public class ProgramaTeste {
    public static void main() {
        Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "123456789", 10000.0, 5000.0);
        System.out.println("Nome do fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço do fornecedor: " + fornecedor.getEndereco());
        System.out.println("Telefone do fornecedor: " + fornecedor.getTelefone());
        System.out.println("Valor de crédito do fornecedor: " + fornecedor.getValorCredito());
        System.out.println("Valor de dívida do fornecedor: " + fornecedor.getValorDivida());
        System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());
        System.out.println("-----------------------------");

        Empregado empregado = new Empregado("Pedro", "Rua B, 456","11678394624" , 26, 1653.0, 0.1);
        System.out.println("Nome do empregado: " + empregado.getNome());
        System.out.println("Endereço do empregado: " + empregado.getEndereco());
        System.out.println("Telefone do empregado: " + empregado.getTelefone());
        System.out.println("Valor de salário do empregado: " + empregado.getSalarioBase());
        System.out.println("Valor de salário do empregado com imposto: " + empregado.calcularSalario());
        System.out.println("-----------------------------");

        Administrador administrador = new Administrador("Ana", "Rua C, 789", "555555555", 23, 5000.0, 0.19, 400);
        System.out.println("Nome do administrador: " + administrador.getNome());
        System.out.println("Endereço do administrador: " + administrador.getEndereco());
        System.out.println("Telefone do administrador: " + administrador.getTelefone());
        System.out.println("Valor de salário do administrador: " + administrador.getSalarioBase());
        System.out.println("Valor de salário do administrador com comissão: " + administrador.calcularSalario());
        System.out.println("-----------------------------");

        Operario operario = new Operario("Maria", "Rua B, 456", "987654321", 10, 2500.0, 0.15, 30, 0.62);
        System.out.println("Nome do operário: " + operario.getNome());
        System.out.println("Endereço do operário: " + operario.getEndereco());
        System.out.println("Telefone do operário: " + operario.getTelefone());
        System.out.println("Valor de salário do operário: " + operario.getSalarioBase());
        System.out.println("Valor de salário do operário com comissão: " + operario.calcularSalario());
        System.out.println("-----------------------------");

        Vendedor vendedor = new Vendedor("Carlos", "Rua D, 321", "111111111", 15, 1600.0, 0.10, 150.0, 0.40);

    }
}
