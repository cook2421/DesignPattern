package CreationalPattern.Singleton.Synchronized;

public class BasicSynchronization {
    private String mMessage;

    public static void main(String[] args) {
        BasicSynchronization temp = new BasicSynchronization();

        System.out.println("Test start!");
        new Thread(() -> {
            for(int i=0; i<1000; i++){
                temp.callMe("Thread1");
            }
        }).start();

        new Thread(() -> {
            for(int i=0; i<1000; i++){
                temp.callMe("Thread2");
            }
        }).start();
        System.out.println("Test end!");
    }


    public synchronized void callMe(String whoCallMe){
        mMessage = whoCallMe;

        try{
            long sleep = (long)(Math.random() * 100);
            Thread.sleep(sleep);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        if(!mMessage.equals(whoCallMe)){
            System.out.println(whoCallMe + " | " + mMessage);
        }
    }
}


// 위 함수에서는 절대 로그가 찍히지 않지만,
// 'synchronized'를 지우면 로그가 주르르륵 찍힌다.

// 만약 main함수에서 temp객체를 temp1, temp2로 두 개 선언하고
// 아래쪽에서 callMe메서드를 각자 호출하도록 했으면 스레드 경합이 일어나지 않는다.
