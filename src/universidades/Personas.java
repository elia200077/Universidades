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
public class Personas {
    
    private Universidad Universidad1;
    public void setUniversidad1 (Universidad Universidadp)
    {
    this.Universidad1=Universidadp;
    }
    public Universidad getUniversidad()
    {
    return Universidad1;
    }
 
    
    private String DNI;
    public void setDNI(String DNIp)
    {
    this.DNI=DNIp;
    }
    public String getDNI()
    {
    return DNI;
    }
    
   private String Nombre;
    public void setNombre(String Nombrep)
    {
    this.Nombre=Nombrep;
    }
    public String getNombre()
    {
    return Nombre;
    }
}
