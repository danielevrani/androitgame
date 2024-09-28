package com.example;
import java.awt.Dimension;

import javax.swing.JPanel;

import java.awt.Color;


public class GamePanel extends JPanel {
   // Pengaturan layar
   final int originalTileSize = 16;
   final int scale = 3;
   public final int tileSize = originalTileSize * scale;
   public final int maxScreenCol = 20;
   public final int maxScreenRow = 12;
   public final int screenWidth = tileSize * maxScreenCol;
   public final int screenHeight = tileSize * maxScreenRow;

   // Konstruktor
   public GamePanel () {
       this.setPreferredSize(new Dimension(screenWidth, screenHeight));
       this.setBackground(Color.green);
       this.setDoubleBuffered(true);

   }

}

