package com.montadora.fabrica.concreta;

import com.montadora.componentes.Armazenamento;
import com.montadora.componentes.CPU;
import com.montadora.componentes.FonteEnergia;
import com.montadora.componentes.GPU;
import com.montadora.componentes.PlacaMae;
import com.montadora.componentes.RAM;
import com.montadora.fabrica.FabricantePC;

/**
 * FABRICA CONCRETA - Responsabilidade da PESSOA 2.
 * Implementa o contrato da FabricantePC para criar SOMENTE componentes Gamer.
 */
public class FabricantePcGamer implements FabricantePC {

    @Override
    public PlacaMae criarPlacaMae() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarPlacaMae'");
    }

    @Override
    public CPU criarCPU() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarCPU'");
    }

    @Override
    public GPU criarGPU() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarGPU'");
    }

    @Override
    public RAM criarRAM() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarRAM'");
    }

    @Override
    public Armazenamento criarArmazenamento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarArmazenamento'");
    }

    @Override
    public FonteEnergia criarFonteEnergia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarFonteEnergia'");
    }

    @Override
    public String getModeloPC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModeloPC'");
    }
    // A Pessoa 2 implementará todos os métodos criar...() aqui.
}