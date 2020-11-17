/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hospital;

import java.util.Date;

/**
 *
 * @author GABRIEL
 */
public class Exames {
    public int Numero;
    public String Descricao;
    public String Data;
    
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
    
    public void setData(String Data) {
        this.Data = Data;
    }
    
    public String getData() {
        return this.Data;
    }
}
