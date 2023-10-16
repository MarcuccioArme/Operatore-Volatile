public class WriteData extends Thread {
    VolatileDemo vd;

    public WriteData(VolatileDemo xvd) {
        vd = xvd;
    }

    public void run() {
        int num = vd.getVal();

        while(vd.getVal() < 3) {

            System.out.println("WriteData - Increment value: " + (num+1));
            vd.setVal(++num);

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}