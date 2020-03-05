package BehavioralPattern.State.Solution;

public class ON implements State {

    private static ON on = new ON();    // ON 클래스의 인스턴스로 초기화됨

    private ON(){};

    public static ON getInstance() {    // 초기화된 ON 클래스의 인스턴스를 반환함
        return on;
    }

    public void on_button_pushed(Light light){  // ON 상태일 때 On 버튼을 눌러도 변화 없음
        System.out.println("반응 없음");
    }

    public void off_button_pushed(Light light){
        System.out.println("Light Off!");
        light.setState(OFF.getInstance());
    }
}
