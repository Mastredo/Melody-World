package com.example.demo.negocio.cadastro;

import java.util.Date;
import java.util.List;

import com.example.demo.negocio.basica.RelatorioVendas;


public interface InterfaceCadastroRelatorioVendas {

    RelatorioVendas salvarRelatorioVendas(RelatorioVendas relatorio);

    List<RelatorioVendas> listarRelatoriosVendas();

    List<RelatorioVendas> buscarRelatoriosVendasPorData(Date data);
    
    List<RelatorioVendas> buscarRelatoriosVendasPorPeriodo(Date dataInicio, Date dataFim);

    List<RelatorioVendas> buscarRelatoriosVendasPorTotalVendas(double totalVendas);
    
    List<RelatorioVendas> buscarRelatoriosVendasComTotalVendasMaiorOuIgual(double totalVendas);
}