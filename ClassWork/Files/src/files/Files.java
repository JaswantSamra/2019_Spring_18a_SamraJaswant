/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 *
 * @author Jaswant Singh Samra
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileOutputStream fStream = new FileOutputStream("pic.dat");
        byte[] b = {0X48, 0b01000001};
        String hi = "Hello, w";
        fStream.write(b);
        fStream.write(hi.getBytes());
        fStream.write(new Double(4.0));
        FileInputStream cursor = new FileInputStream("AAORED.CUR");
        FileOutputStream cursor2 = new FileOutputStream("AAORED.CUR");
        DataInputStream din = new DataInputStream(cursor);
        boolean endOfFile = false;
        byte thisByte;
        int byteCount = 0;
        while(!endOfFile){
            try{
                thisByte = din.readByte();
                byteCount ++;
                if ( byteCount % 100 == 0 ){
                    thisByte = (byte)(thisByte & 0x01);
                } if(thisByte == 0x99){
                thisByte = (byte)0xcc;
                } else if(thisByte == 0x00){
                thisByte = (byte)0xcc;
                }
        cursor2.write(thisByte);
            } catch (EOFException e){
                
            }
        
        
    }
    }
}
}
