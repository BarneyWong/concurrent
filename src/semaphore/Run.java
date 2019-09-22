package semaphore;

/**
 * @author : BarneyWong
 * @describe :
 * @date : 2019/9/16 21:11
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
//        Service service = new Service();
//        ThreadA threadA = new ThreadA(service);
//        phaser5.ThreadB threadB = new phaser5.ThreadB(service);
//        ThreadC threadC = new ThreadC(service);
//        threadA.setName("A");
//        threadB.setName("B");
//        threadC.setName("C");
//        threadA.start();
//        threadB.start();
//        threadC.start();
        RepastService service = new RepastService();
        ThreadP[] arrayP = new ThreadP[60];
        ThreadC[] arrayC = new ThreadC[60];
        for (int i = 0; i < 60; i++) {
            arrayP[i] = new ThreadP(service);
            arrayC[i] = new ThreadC(service);
        }
        Thread.sleep(2000);
        for (int i = 0; i < 60; i++) {
            arrayP[i].start();
            arrayC[i].start();
        }
    }
}
