package CreationalPattern.Singleton.Context.RaceCondition;

public class Printer {

    // 외부에 제공할 자기 자신의 인스턴스
    private static Printer printer = null;

    private Printer() {}

    // 자기 자신의 인스턴스를 외부에 제공
    public static Printer getPrinter(){
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
        System.out.println(str);
    }
}
