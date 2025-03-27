package io.github.colbach.sporttimer;

import javax.swing.UIManager;

public class Main {
    
    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new TimerWindow().setVisible(true);
            }
        });
        
    }
    
    
}
