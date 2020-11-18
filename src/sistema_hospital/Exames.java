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
public class Exames {
    protected int Numero;
    protected String Descricao;
    protected String Resultado;
    protected String Data;
    
    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public int getNumero() {
        return this.Numero;
    }
    
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    public String getDescricao() {
        return this.Descricao;
    }
    
    public void setResultado(String Resultado) {
        this.Resultado = Resultado;
    }
    
    public String getResultado() {
        return this.Resultado;
    }
    
    public void setData(String Data) {
        this.Data = Data;
    }
    
    public String getData() {
        return this.Data;
    }
}
