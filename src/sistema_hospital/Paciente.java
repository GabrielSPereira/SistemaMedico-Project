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
public class Paciente extends Pessoa {
    public ArrayList<Exames> ListaExames = new ArrayList<>();
    public ArrayList<Medicamentos> ListaMedicamentos = new ArrayList<>();
    public ArrayList<Ocorrencias> ListaOcorrencias = new ArrayList<>();
    public ArrayList<Consultas> ListaConsultas = new ArrayList<>();
}
