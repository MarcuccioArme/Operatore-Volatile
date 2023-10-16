public class VolatileDemo {
    private volatile int val = 0;

    public int getVal() {
        return this.val;
    }

    public void setVal(int xVal) {
        this.val = xVal;
    }

    public static void main(String[] args) {
        VolatileDemo vd = new VolatileDemo();

        ReadData rd = new ReadData(vd);
        rd.start();
        WriteData wd = new WriteData(vd);
        wd.start();

        System.out.println("Fine thread padre");
    }
}