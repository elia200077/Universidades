/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidades;

/**
 *
 * @author SENA
 */
public class Trabajador extends Personas {
    
    private final Universidad Universidad1 = new Universidad();
    
    private String Fecha_Contrato;
    public void setFecha_Contrato(String Fecha_Contratop)
    {
    this.Fecha_Contrato=Fecha_Contratop;
    }
    public String getFecha_Contrato()
    {
    return Fecha_Contrato;
    }
}
