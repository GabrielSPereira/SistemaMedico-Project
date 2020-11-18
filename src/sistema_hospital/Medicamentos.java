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
public class Medicamentos {
    public String Nome;
    public String Descricao;
    public String Possologia;
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getNome() {
        return this.Nome;
    }
    
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    public String getDescricao() {
        return this.Descricao;
    }
    
    public void setPossologia(String Possologia) {
        this.Possologia = Possologia;
    }
    
    public String getPossologia() {
        return this.Possologia;
    }
}
