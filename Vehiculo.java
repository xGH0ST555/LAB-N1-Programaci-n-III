/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author HOME
 */
public class Vehiculo
{
 public int Tipo;
 public String Color;
 public String Placa; 

 public void PedirDatos()
{  
   Tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de vehiculo: \n1.Carro \n2.Camioneta"));
   Color = JOptionPane.showInputDialog("Escriba el color de Vehiculo");
}
}
