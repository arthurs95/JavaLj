/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.controloenderoco.model;

/**
 *
 * @author Aluno
 */
public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    
    public Endereco(){
            
    }
    public String getcep(){
        return cep;
    }
    public void setcep(String cep) {
        this.cep = cep;
    }
    
    public String getlogradouro(){
        return logradouro;
    }
    public void setlogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getcidade(){
        return cidade;
    }
    public void setcidade(String cidade) {
        this.cidade = cidade;
    
    }
    public String getbairro(){
        return bairro;
    }
    public void setCidade(String bairro) {
        this.bairro = bairro;
    
    }
       public String getuf(){
        return uf;
    }
    public void setuf(String uf) {
        this.uf = uf;
    }
    
    //validação
    public String isEndereco(){
        String erros = "";
        if (cep.equals("")){
            erros +="CEP em branco\n";
        }
    
        
        if (logradouro.equals("")){
            erros +="Logradouro em branco\n";
        
        }
        if (cidade.equals("")){
            erros +="cidade em branco\n";
        }
          
        if (bairro.equals("")){
            erros +="bairro em branco\n";
        }
            
        if (uf.equals("")){
            erros +="uf em branco\n";
           
        
        }
       return erros;
    }
}
    
    

    
