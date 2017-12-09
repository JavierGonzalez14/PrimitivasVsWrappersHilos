package primitivasvswrappershilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier
 */
public class PrimitivasVsWrappersHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primitivo Vs Wrappers

        //Datos primitivos
        int a = 0;
        char b = 's';
        boolean dato = true;
        float flotante;
        double doubleComaFlotante;
        short corto;
        byte unByte;
        long largo;

        //Wrappers: Clases ya creadas en Java que manejan el tipo de dato
        Integer claseEntero;
        Character charClass;
        Boolean booleanClass;
        Float floarClass;
        Double doubleClass;
        Short shortClass;
        Byte byteClass;
        Long longClass;
        
        //Se crea un  objeto de tipo hilo
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    for (int c = 0; c < 29; c++) {
                        //Duracion en milisegundos
                        Thread.sleep(3000);
                        System.out.println("Manejo del hilo");
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(PrimitivasVsWrappersHilos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        //Inicializas el hilo
        hilo.start();
    }
    
}
