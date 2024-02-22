package JuegosEnPoo;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PpOtijera {
    public static void main(String[] args) {
        
        String seleccion, computadora;
        
        
        ImageIcon imagen = new ImageIcon("Marzo.png");
        String [] Opc = {"Piedra", "Papel", "Tijera"};
        
        /*JOPTIONPANEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE*/
        
        seleccion = (String) JOptionPane.showInputDialog(null, "Elige una opción: ", "Piedra, Papel o Tijera", JOptionPane.PLAIN_MESSAGE, null, Opc, Opc[0]);
        
        computadora = Opc [(int) (Math.random() * Opc.length)];
        
        String resultado = 
        
        
        

}        
    public String resultado (String seleccion, String computadora){
        if (seleccion.equals(computadora) || computadora.equals(seleccion)) {
            JOptionPane.showMessageDialog(null, "¡Ha sido un empate!", "¿Ganador o perdedor?", 0);
        }
        else if (seleccion== "Piedra" && computadora== "Papel" || seleccion == "Papel" && computadora == "Tijera"){
            JOptionPane.showMessageDialog(null, "¡Ha ganado la computadora!\nTú haz perdido...das pena.", "¿Ganador o perdedor?", 0);
        }
        else if (computadora== "Piedra"&& seleccion== "Papel" || computadora== "Papel" && seleccion =="Tijera"){
            JOptionPane.showMessageDialog(null,"Usted ha ganado. \n Esta no será mi derrota...", "¿Ganador o perdedor?", 0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ups...lo sentimos.");
        }
    return "He";}
    
}
