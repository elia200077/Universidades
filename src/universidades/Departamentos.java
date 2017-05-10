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
public class Departamentos {
    
    private final Universidad Universidad1 = new Universidad();
    
    private String Nombre;
    public void setNombre(String Nombrep)
    {
    this.Nombre=Nombrep;
    }
    public String getNombre()
    {
    return Nombre;
    }
    
   private String Direccion;
    public void setDireccion(String Direccionp)
    {
    this.Direccion=Direccionp;
    }
    public String getDireccion()
    {
    return Direccion;
    }
}
