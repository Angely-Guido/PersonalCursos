package hilos;

import javax.swing.plaf.TableHeaderUI;

public class Repaso implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }

    public void start(){
        Thread g = new Thread(this);
        g.start();
    }

    public static void main(String[] args) {

        Repaso r = new Repaso();
        r.start();
       // Thread t = new Thread(r);
       // t.start();

    }





}
