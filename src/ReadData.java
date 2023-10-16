// Consumatore
public class ReadData extends Thread {
    VolatileDemo vd;

    public ReadData(VolatileDemo xvd) {
        vd = xvd;
    }

    public void run() {

        int num = vd.getVal();
        System.out.println("ReadData - New value: " + vd.getVal());

        while(num < 3) {

            if (num != vd.getVal()) {
                System.out.println("ReadData - New value: " + vd.getVal());
                num = vd.getVal();
            }

        }

    }
}