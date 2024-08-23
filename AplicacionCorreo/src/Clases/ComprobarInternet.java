package Clases;

import java.net.Socket;

public class ComprobarInternet {
    public boolean test()
    {
        String DireccionWeb = "www.google.com";
        int Puerto= 80;
        try
        {
            Socket s = new Socket(DireccionWeb, Puerto);
            if(s.isConnected()){
                System.out.println("Conexión establecida");
            }
        }
        catch (Exception e)
        {
            System.err.println("No se pudo establecer conexión");
            return false;
        }
        return true;
    }
}
