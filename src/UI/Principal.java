/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.ArchivoInf;


/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoInf info = new ArchivoInf();
        UI ui = new UI();
        
        ui.iniciarPrograma();
    }
    
}
