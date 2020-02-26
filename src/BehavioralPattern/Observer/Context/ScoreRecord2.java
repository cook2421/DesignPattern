package BehavioralPattern.Observer.Context;

import java.util.ArrayList;
import java.util.List;

/* 입력된 점수를 저장하는 클래스 (2. 출력형태: 최대, 최소값) */
public class ScoreRecord2 {
    private List<Integer> scores = new ArrayList<Integer>();  // 점수를 저장함
    private MinMaxView1 minMaxView;  // 최소/최대 값만을 출력하는 형태의 클래스

    // MinMaxView를 설정함
    public void setMinMaxView(MinMaxView1 minMaxView){
        this.minMaxView = minMaxView;
    }

    // 새로운 점수를 추가하면 출력하는 것에 변화를 통보(update())하여 출력하는 부분 갱신
    public void addScore(int score){
        scores.add(score);  // scores 목록에 주어진 점수를 추가함
        minMaxView.update();  // MinMaxView에게 scores가 변경됨을 통보함
    }

    // 출력하는 부분에서 변화된 내용을 얻어감
    public List<Integer> getScoreRecord(){
        return scores;
    }
}
