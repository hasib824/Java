/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referencejava;

import java.io.*;

/**
 *
 * @author hasho
 */
public class ReferenceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i;
        FileInputStream fin;
// First, confirm that a filename has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
// Attempt to open the file.
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }
    }

}
