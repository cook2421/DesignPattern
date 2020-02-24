package Singleton.RaceCondition;

public class Client {

    private static final int THREAD_NUM = 5;

    public static void main(String[] args) {
        UserThread[] user = new UserThread[THREAD_NUM];
        for(int i=0; i<THREAD_NUM; i++){
            //UserThread 인스턴스 생성
            user[i] = new UserThread(i+1+"");
            user[i].start();
        }
    }
}
