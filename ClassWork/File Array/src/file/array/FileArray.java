
package file.array;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Jaswant Singh Samra
 */
public class FileArray {

   public void writeArray(String fileName, int[]array) throws IOException{
   FileOutputStream fstream    = new FileOutputStream(fileName);
   DataOutputStream outputFile = new DataOutputStream(fstream);
   for(int i = 0; i < array.length; i++){
     outputFile.writeInt(array[i]);
   }
   outputFile.close();
 }
 void readArray(String fileName, int SIZE) throws FileNotFoundException, IOException{
   int numbers[] = new int[SIZE];
   boolean endOfFile = false;
   int counter = 0;

   FileInputStream fstream = new FileInputStream(fileName);

   DataInputStream inputFile = new DataInputStream(fstream);

   while(!endOfFile){
     try{
       counter+=1;
       numbers[counter] = inputFile.readInt();
     }
     catch(EOFException e){
       endOfFile = true;
     }
   }
 }
}
    
