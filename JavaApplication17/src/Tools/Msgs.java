/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import javax.swing.JOptionPane;

public class Msgs {
    public static boolean gerenteMsg(){
        if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Não a nenhum gerente cadatrado\n"
                +                                                        "É nesesario cadastrar um gerente para continuar\n"
                +                                                        "Deseja cadastrar um gerente agora?", "Atenção" , 
                JOptionPane.YES_NO_OPTION)){
            return(true);
        }else{
            return(false);
        }
    }
    
}
