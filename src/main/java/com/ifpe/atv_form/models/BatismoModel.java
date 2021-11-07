package com.ifpe.atv_form.models;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class BatismoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
    private String nomeCrianca;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNacimento;
    private String cidade;
    private String UF;
    private String nomePai;
    private String naturalidadePai;
    private String nomeMae;
    private String naturalidadeMae;
    private String endereco;
    private int telefone;
    private int celular;
    private String nomeParoquia;
    private Boolean paisCasados;
    private Boolean casadosIgreja;
    private ArrayList<String> compareceuPalestra;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataBatismo;
    private String celebrante;
    private String pastoral;
    private String nomePadrinho;
    private int telefonePadrinho;
    private int celularPadrinho;
    private Boolean padrinhoCatolico;
    private Boolean eucarestiaPadrinho;
    private Boolean crismaPadrinho;
    private Boolean padrinhoCasado;
    private Boolean PadrinhoCasadosIgreja;
    private String padrinhoNomeIgreja;
    private String padrinhoNomeConjulgue;
    private String nomeMadrinha;
    private int telefoneMadrinha;
    private int celularMadrinha;
    private Boolean madrinhaCatolica;
    private Boolean eucarestiaMadrinha;
    private Boolean crismaMadrinha;
    private Boolean madrinhaCasada;
    private Boolean madrinhaCasadosIgreja;
    private String madrinhaNomeIgreja;
    private String madrinhaNomeConjulgue;

    public BatismoModel() {
    }


    public BatismoModel(int codigo, String nomeCrianca, LocalDate dataNacimento, String cidade, String uF, String nomePai,
                        String naturalidadePai, String nomeMae, String naturalidadeMae, String endereco, int telefone, int celular,
                        String nomeParoquia, Boolean paisCasados, Boolean casadosIgreja, ArrayList<String> compareceuPalestra,
                        LocalDate dataBatismo, String celebrante, String pastoral, String nomePadrinho, int telefonePadrinho,
                        int celularPadrinho, Boolean padrinhoCatolico, Boolean eucarestiaPadrinho, Boolean crismaPadrinho,
                        Boolean padrinhoCasado, Boolean padrinhoCasadosIgreja, String padrinhoNomeIgreja,
                        String padrinhoNomeConjulgue, String nomeMadrinha, int telefoneMadrinha, int celularMadrinha,
                        Boolean madrinhaCatolica, Boolean eucarestiaMadrinha, Boolean crismaMadrinha, Boolean madrinhaCasada,
                        Boolean madrinhaCasadosIgreja, String madrinhaNomeIgreja, String madrinhaNomeConjulgue) {
        this.codigo = codigo;
    	this.nomeCrianca = nomeCrianca;
        this.dataNacimento = dataNacimento;
        this.cidade = cidade;
        UF = uF;
        this.nomePai = nomePai;
        this.naturalidadePai = naturalidadePai;
        this.nomeMae = nomeMae;
        this.naturalidadeMae = naturalidadeMae;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
        this.nomeParoquia = nomeParoquia;
        this.paisCasados = paisCasados;
        this.casadosIgreja = casadosIgreja;
        this.compareceuPalestra = compareceuPalestra;
        this.dataBatismo = dataBatismo;
        this.celebrante = celebrante;
        this.pastoral = pastoral;
        this.nomePadrinho = nomePadrinho;
        this.telefonePadrinho = telefonePadrinho;
        this.celularPadrinho = celularPadrinho;
        this.padrinhoCatolico = padrinhoCatolico;
        this.eucarestiaPadrinho = eucarestiaPadrinho;
        this.crismaPadrinho = crismaPadrinho;
        this.padrinhoCasado = padrinhoCasado;
        PadrinhoCasadosIgreja = padrinhoCasadosIgreja;
        this.padrinhoNomeIgreja = padrinhoNomeIgreja;
        this.padrinhoNomeConjulgue = padrinhoNomeConjulgue;
        this.nomeMadrinha = nomeMadrinha;
        this.telefoneMadrinha = telefoneMadrinha;
        this.celularMadrinha = celularMadrinha;
        this.madrinhaCatolica = madrinhaCatolica;
        this.eucarestiaMadrinha = eucarestiaMadrinha;
        this.crismaMadrinha = crismaMadrinha;
        this.madrinhaCasada = madrinhaCasada;
        this.madrinhaCasadosIgreja = madrinhaCasadosIgreja;
        this.madrinhaNomeIgreja = madrinhaNomeIgreja;
        this.madrinhaNomeConjulgue = madrinhaNomeConjulgue;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCrianca() {
        return nomeCrianca;
    }

    public void setNomeCrianca(String nomeCrianca) {
        this.nomeCrianca = nomeCrianca;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = LocalDate.parse(dataNacimento);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String uF) {
        UF = uF;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNaturalidadePai() {
        return naturalidadePai;
    }

    public void setNaturalidadePai(String naturalidadePai) {
        this.naturalidadePai = naturalidadePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNaturalidadeMae() {
        return naturalidadeMae;
    }

    public void setNaturalidadeMae(String naturalidadeMae) {
        this.naturalidadeMae = naturalidadeMae;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNomeParoquia() {
        return nomeParoquia;
    }

    public void setNomeParoquia(String nomeParoquia) {
        this.nomeParoquia = nomeParoquia;
    }

    public Boolean getPaisCasados() {
        return paisCasados;
    }

    public void setPaisCasados(Boolean paisCasados) {
        this.paisCasados = paisCasados;
    }

    public Boolean getCasadosIgreja() {
        return casadosIgreja;
    }

    public void setCasadosIgreja(Boolean casadosIgreja) {
        this.casadosIgreja = casadosIgreja;
    }

    public ArrayList<String> getCompareceuPalestra() {
        return compareceuPalestra;
    }

    public void setCompareceuPalestra(ArrayList<String> compareceuPalestra) {
        this.compareceuPalestra = compareceuPalestra;
    }

    public LocalDate getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(String dataBatismo) {
        this.dataBatismo = LocalDate.parse(dataBatismo);
    }

    public String getCelebrante() {
        return celebrante;
    }

    public void setCelebrante(String celebrante) {
        this.celebrante = celebrante;
    }

    public String getPastoral() {
        return pastoral;
    }

    public void setPastoral(String pastoral) {
        this.pastoral = pastoral;
    }

    public String getNomePadrinho() {
        return nomePadrinho;
    }

    public void setNomePadrinho(String nomePadrinho) {
        this.nomePadrinho = nomePadrinho;
    }

    public int getTelefonePadrinho() {
        return telefonePadrinho;
    }

    public void setTelefonePadrinho(int telefonePadrinho) {
        this.telefonePadrinho = telefonePadrinho;
    }

    public int getCelularPadrinho() {
        return celularPadrinho;
    }

    public void setCelularPadrinho(int celularPadrinho) {
        this.celularPadrinho = celularPadrinho;
    }

    public Boolean getPadrinhoCatolico() {
        return padrinhoCatolico;
    }

    public void setPadrinhoCatolico(Boolean padrinhoCatolico) {
        this.padrinhoCatolico = padrinhoCatolico;
    }

    public Boolean getEucarestiaPadrinho() {
        return eucarestiaPadrinho;
    }

    public void setEucarestiaPadrinho(Boolean eucarestiaPadrinho) {
        this.eucarestiaPadrinho = eucarestiaPadrinho;
    }

    public Boolean getCrismaPadrinho() {
        return crismaPadrinho;
    }

    public void setCrismaPadrinho(Boolean crismaPadrinho) {
        this.crismaPadrinho = crismaPadrinho;
    }

    public Boolean getPadrinhoCasado() {
        return padrinhoCasado;
    }

    public void setPadrinhoCasado(Boolean padrinhoCasado) {
        this.padrinhoCasado = padrinhoCasado;
    }

    public Boolean getPadrinhoCasadosIgreja() {
        return PadrinhoCasadosIgreja;
    }

    public void setPadrinhoCasadosIgreja(Boolean padrinhoCasadosIgreja) {
        PadrinhoCasadosIgreja = padrinhoCasadosIgreja;
    }

    public String getPadrinhoNomeIgreja() {
        return padrinhoNomeIgreja;
    }

    public void setPadrinhoNomeIgreja(String padrinhoNomeIgreja) {
        this.padrinhoNomeIgreja = padrinhoNomeIgreja;
    }

    public String getPadrinhoNomeConjulgue() {
        return padrinhoNomeConjulgue;
    }

    public void setPadrinhoNomeConjulgue(String padrinhoNomeConjulgue) {
        this.padrinhoNomeConjulgue = padrinhoNomeConjulgue;
    }

    public String getNomeMadrinha() {
        return nomeMadrinha;
    }

    public void setNomeMadrinha(String nomeMadrinha) {
        this.nomeMadrinha = nomeMadrinha;
    }

    public int getTelefoneMadrinha() {
        return telefoneMadrinha;
    }

    public void setTelefoneMadrinha(int telefoneMadrinha) {
        this.telefoneMadrinha = telefoneMadrinha;
    }

    public int getCelularMadrinha() {
        return celularMadrinha;
    }

    public void setCelularMadrinha(int celularMadrinha) {
        this.celularMadrinha = celularMadrinha;
    }

    public Boolean getMadrinhaCatolica() {
        return madrinhaCatolica;
    }

    public void setMadrinhaCatolica(Boolean madrinhaCatolica) {
        this.madrinhaCatolica = madrinhaCatolica;
    }

    public Boolean getEucarestiaMadrinha() {
        return eucarestiaMadrinha;
    }

    public void setEucarestiaMadrinha(Boolean eucarestiaMadrinha) {
        this.eucarestiaMadrinha = eucarestiaMadrinha;
    }

    public Boolean getCrismaMadrinha() {
        return crismaMadrinha;
    }

    public void setCrismaMadrinha(Boolean crismaMadrinha) {
        this.crismaMadrinha = crismaMadrinha;
    }

    public Boolean getMadrinhaCasada() {
        return madrinhaCasada;
    }

    public void setMadrinhaCasada(Boolean madrinhaCasada) {
        this.madrinhaCasada = madrinhaCasada;
    }

    public Boolean getMadrinhaCasadosIgreja() {
        return madrinhaCasadosIgreja;
    }

    public void setMadrinhaCasadosIgreja(Boolean madrinhaCasadosIgreja) {
        this.madrinhaCasadosIgreja = madrinhaCasadosIgreja;
    }

    public String getMadrinhaNomeIgreja() {
        return madrinhaNomeIgreja;
    }

    public void setMadrinhaNomeIgreja(String madrinhaNomeIgreja) {
        this.madrinhaNomeIgreja = madrinhaNomeIgreja;
    }

    public String getMadrinhaNomeConjulgue() {
        return madrinhaNomeConjulgue;
    }

    public void setMadrinhaNomeConjulgue(String madrinhaNomeConjulgue) {
        this.madrinhaNomeConjulgue = madrinhaNomeConjulgue;
    }


    @Override
    public String toString() {
        return "BatismoModel [nomeCrianca=" + nomeCrianca + ", dataNacimento=" + dataNacimento + ", cidade=" + cidade
                + ", UF=" + UF + ", nomePai=" + nomePai + ", naturalidadePai=" + naturalidadePai + ", nomeMae="
                + nomeMae + ", naturalidadeMae=" + naturalidadeMae + ", endereco=" + endereco + ", telefone=" + telefone
                + ", celular=" + celular + ", nomeParoquia=" + nomeParoquia + ", paisCasados=" + paisCasados
                + ", casadosIgreja=" + casadosIgreja + ", compareceuPalestra=" + compareceuPalestra + ", dataBatismo="
                + dataBatismo + ", celebrante=" + celebrante + ", pastoral=" + pastoral + ", nomePadrinho="
                + nomePadrinho + ", telefonePadrinho=" + telefonePadrinho + ", celularPadrinho=" + celularPadrinho
                + ", padrinhoCatolico=" + padrinhoCatolico + ", eucarestiaPadrinho=" + eucarestiaPadrinho
                + ", crismaPadrinho=" + crismaPadrinho + ", padrinhoCasado=" + padrinhoCasado
                + ", PadrinhoCasadosIgreja=" + PadrinhoCasadosIgreja + ", padrinhoNomeIgreja=" + padrinhoNomeIgreja
                + ", padrinhoNomeConjulgue=" + padrinhoNomeConjulgue + ", nomeMadrinha=" + nomeMadrinha
                + ", telefoneMadrinha=" + telefoneMadrinha + ", celularMadrinha=" + celularMadrinha
                + ", madrinhaCatolica=" + madrinhaCatolica + ", eucarestiaMadrinha=" + eucarestiaMadrinha
                + ", crismaMadrinha=" + crismaMadrinha + ", madrinhaCasada=" + madrinhaCasada
                + ", madrinhaCasadosIgreja=" + madrinhaCasadosIgreja + ", madrinhaNomeIgreja=" + madrinhaNomeIgreja
                + ", madrinhaNomeConjulgue=" + madrinhaNomeConjulgue + "]";
    }


}

