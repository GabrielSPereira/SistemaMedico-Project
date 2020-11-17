/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hospital;

/**
 *
 * @author GABRIEL
 */
public class Pessoa {
    protected String Nome;
    protected int Idade;
    protected String Rg;
    protected String Cpf;
    protected String Endereco;
    protected String Telefone;
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getNome() {
        return this.Nome;
    }  
    
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }
    
    public int getIdade() {
        return this.Idade;
    }  

    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    
    public String getRg() {
        return this.Rg;
    }
    
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public String getCpf() {
        return this.Cpf;
    }
    
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getEndereco() {
        return this.Endereco;
    }
    
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getTelefone() {
        return this.Telefone;
    }
}
