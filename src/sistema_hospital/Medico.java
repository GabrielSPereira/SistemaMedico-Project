/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_hospital;

import java.util.ArrayList;

/**
 *
 * @author GABRIEL
 */
public class Medico extends Pessoa{
    protected int Crm;
    protected String Especialidade;
    public ArrayList<Paciente> ListaPacientes = new ArrayList<>();
    
    public void setCrm(int Crm) {
        this.Crm = Crm;
    }
    
    public int getCrm() {
        return this.Crm;
    }    

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }
    
    public String getEspecialidade() {
        return this.Especialidade;
    }
}
