package com.ravens;

import javax.swing.JOptionPane;



public class  FirstGui {

    public static void main(String[] args) {

        String fn = JOptionPane.showInputDialog("First Number");
        String sn = JOptionPane.showInputDialog("Second Number");

        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "Total is: " +sum, "Page Tile", JOptionPane.PLAIN_MESSAGE);


    }

}