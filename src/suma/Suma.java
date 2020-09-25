
package suma;

public class Suma {
    //variables de ambito global
    private int vUno, vDos, vTres;
    //método para poder obtener las variables que vienen del metodo SumaMain.java
    public Suma(int valorUno, int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
    }
    //método para poder ejecutar la acción requerida
    public void Operacion(){
        vTres = vUno + vDos;
    }
    //método para imprimir el resultado en pantalla
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es = " +  vTres);
    }
    
}
