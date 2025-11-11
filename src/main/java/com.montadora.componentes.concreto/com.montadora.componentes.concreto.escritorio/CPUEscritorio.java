package com.montadora.componentes.concreto.escritorio;

import com.montadora.componentes.CPU;

public class CPUEscritorio implements CPU {
    
    // A Pessoa 2 preencherá com valores reais de um processador para Escritório
    
    @Override
    public String getSocketType() {
        return "AM4"; // Exemplo: AMD Ryzen 5
    }
    
    @Override
    public int getTDP() {
        return 65;
    }
    
    @Override
    public String getBrand() {
        return "AMD";
    }
    
    @Override
    public String getFamily() {
        return "Ryzen 5";
    }
    
    // ... o restante dos métodos devem ser implementados para compilar.
    // Para fins de placeholder, deixe o corpo vazio ou retornando 0/null
}