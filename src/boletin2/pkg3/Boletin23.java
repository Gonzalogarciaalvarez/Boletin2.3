/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg3;

import java.util.Scanner;
/**
 *
 * @author ggarciaalvarez
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
            double y;
            double n;
            double o;
            Scanner obx1 = new Scanner (System.in);
            n = obx1.nextDouble();
            Scanner obx2= new Scanner (System.in);
            o= obx2.nextDouble();
            y=n*o;
            System.out.println(n+ " euros son "+y+" dolares");
    }
    
}
