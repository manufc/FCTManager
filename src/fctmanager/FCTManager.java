/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fctmanager;

import dao.Database;
import dao.EmpresaDAO;
import java.util.ArrayList;
import java.util.List;
import model.Empresa;
import view.MainJFrame;

/**
 *
 * @author manuel
 */
public class FCTManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = new Database("localhost", "3306", "root", "m97a81","FCT_APP");
        System.out.print("Conectando...");
        EmpresaDAO empresaDAO;
        
        
        if(db.connect()!=null){
            System.out.println("[OK]");
        }else{
            System.out.println("[FALLO]");
        }
        
        /*
        
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
        */
        System.out.println("Obteniendo datos de empresas...");
        empresaDAO = new EmpresaDAO(db);
        List<Empresa> empresas = empresaDAO.getEmpresas();
        if(empresas!=null){
            System.out.println(empresas.size()+" empresas cargadas");        
            System.out.println("[OK]");
        }else{
            System.out.println("[FALLO]");
        }
        
        System.out.print("Desconectando...");
        if(db.disconnect()>=0){
            System.out.println("[OK]");
        }else{
            System.out.println("[FALLO]");
        }
    }
    
}
