package com.example;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // membuat jendela utama untuk game
        JFrame window = new JFrame ( "Shadow Woods");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable( false ) ;

        GamePanel gamePanel = new GamePanel ();
        window.add(gamePanel);
        
        window.pack();
        window.setVisible( true );
        window.setLocationRelativeTo( null );
    }
}
