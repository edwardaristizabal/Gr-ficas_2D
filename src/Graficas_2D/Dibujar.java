/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas_2D;

import java.awt.Graphics;
/**
 *
 * @author Ing. Aristi!
 */
public class Dibujar {
    public static void HacerLinea(Graphics h, int x1, int x2, int y1, int y2)
    {
        h.drawLine(x1, x2, y1, y2);
    }
    
    public static void HacerCuadro(Graphics h, int x, int y, int ancho, int alto)
    {
        h.drawRect(x, y, ancho, alto);
    }
    
    public static void HacerCirculo(Graphics h, int x, int y, int alto, int ancho)
    {
        h.drawOval(x, y, ancho, alto);
    }
}
