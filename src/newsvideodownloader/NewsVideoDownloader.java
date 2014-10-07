/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsvideodownloader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author kimanii
 */
public class NewsVideoDownloader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
      URL url = new URL("https://www.facebook.com/gbntelevisionnews");
      BufferedReader reader = new BufferedReader
      (new InputStreamReader(url.openStream()));
      String line;
      while ((line = reader.readLine()) != null) {
         if (line.contains("video.php?"))
                 System.out.println(line);
      }
      reader.close();
    }
    
}
