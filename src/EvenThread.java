public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Số chẵn : " + i * 2);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Luồng đang bị gián đoạn");
            }
        }
    }
}
