/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraDatos.CompressionMenu;

/**
 *
 * @author 57322
 */
public class Sietezip implements CompressionAlgorithm{
    //Se sobreescribe el método compress para imprimir el nombre del archivo y el tipo de compresión
    @Override
    public void compress(String filename) {
        System.out.println("creating "+filename+".7z");
    }
}
