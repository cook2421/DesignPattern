package BehavioralPattern.State.Solution;

public class OFF implements State {

    private static OFF off = new OFF();    // OFF 클래스의 인스턴스로 초기화됨

    private OFF(){};

    public static OFF getInstance() {    // 초기화된 OFF 클래스의 인스턴스를 반환함
        return off;
    }

    public void on_button_pushed(Light light){  // Off 상태일 때 On 버튼을 누르면 On 상태임
        System.out.println("Light On!");
        light.setState(ON.getInstance());
    }

    public void off_button_pushed(Light light){  // Off 상태일 때 Off 버튼을 눌러도 변화 없음
        System.out.println("반응 없음");
    }
}
