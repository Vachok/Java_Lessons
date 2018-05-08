package general.classload;



import javafx.scene.shape.Path;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Classloade {
   
   public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
      
      URLClassLoader pluginClassLoader = new URLClassLoader(new URL[]{new URL("file://home/jar/jar.jar")});
      Class cl = pluginClassLoader.loadClass("myClassName");
   }
   class MyLoader extends ClassLoader {
      
      @Override
      protected Class<?> findClass(String name) {
         
         byte[] bytes = new byte[0];
         try{
            bytes = Files.readAllBytes(Paths.get("filename"));
         }
         catch(IOException e){
            e.printStackTrace();
         }
         Class<?> cl = defineClass(name, bytes, 0, bytes.length);
         return cl;
      }
   }
}

/*
Можно написать собственный loader.
Например, данный код берёт байты из файла, и прогружает их как класс
* */

/*
В Java существуют 3 основных Class Loaders.
BootStrap (rt.jar)
Extension Class Loader (jre/lib/ext)
Syslem Class Loader (CLASSPATH)
Plugin Class Loader (plugin.jar)
* */