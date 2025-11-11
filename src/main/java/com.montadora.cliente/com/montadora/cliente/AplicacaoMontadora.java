package com.montadora.cliente;

import com.montadora.fabrica.FabricantePC;
import com.montadora.modelo.Computador;
// Normalmente, importaria-se uma Fábrica Concreta da Pessoa 2, ex:
// import com.montadora.fabrica.concreta.FabricantePcGamer;

/**
 * CLIENTE (Pessoa 3) - Contém o método main() e a lógica de interação.
 * O código cliente deve usar APENAS a interface FabricantePC.
 */
public class AplicacaoMontadora {
    
    // Método que simula a montagem usando a Fábrica Abstrata
    public static void montarPC(FabricantePC fabrica) {
        System.out.println("\n--- Montando PC: " + fabrica.getModeloPC() + " ---");
        
        // 1. Cria o produto final (Computador)
        Computador novoPC = new Computador();
        
        // 2. Utiliza a fábrica para criar componentes compatíveis
        novoPC.setPlacaMae(fabrica.criarPlacaMae());
        novoPC.setCpu(fabrica.criarCPU());
        // ... continua criando e configurando o resto ...
        
        System.out.println("Status: Componentes criados via Abstract Factory.");
        // A Pessoa 3 adicionaria a lógica de checagem (compatibilidade, energia) e o menu aqui.
    }
    
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("  Iniciando Simulação da Montadora de PCs");
        System.out.println("==============================================");
        
        // Simulação de uso: a Pessoa 3 instanciaria as classes da Pessoa 2
        // Exemplo:
        // FabricantePC fabricaGamer = new FabricantePcGamer();
        // montarPC(fabricaGamer);
        
        System.out.println("\n(O Cliente está pronto. Falta a implementação completa da Pessoa 2)");
    }
}