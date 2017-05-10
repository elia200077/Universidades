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
public class Universidad {
    
    private String Nombre;
    public void setNombre(String Nombrep)
    {
    this.Nombre=Nombrep;
    }
    public String getNombre()
    {
    return Nombre;
    }
    
   private String Ciudad;
    public void setCiudad(String Ciudadp)
    {
    this.Ciudad=Ciudadp;
    }
    public String getCiudad()
    {
    return Ciudad;
    }
}
