package CreationalPattern.Singleton.Solution.ThreadSafe_Initialization;

public class Printer {

    // 외부에 제공할 자기 자신의 인스턴스
    private static Printer printer = null;

    private int counter = 0;

    // 인스턴스를 만드는 메서드 동기화 (임계 구역)
    public synchronized static Printer getPrinter(){
        // 조건 검사 구문 (문제의 원인!!)
        if(printer == null){
            try{
                // 스레드 스케줄링 변경(스레드 실행 1ms동안 정지)
                Thread.sleep(1);
            } catch (InterruptedException e) {}

            // Printer 인스턴스 생성
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str){
        // 오직 하나의 스레드만 접근을 허용함 (임계 구역)
        // 성능을 위해 필요한 부분만을 임계 구역으로 설정한다.
        synchronized(this) {
            counter++;
            System.out.println(str + counter);
        }
    }
}
