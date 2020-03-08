package BehavioralPattern.Observer.Problem;

import java.util.ArrayList;
import java.util.List;

/* 입력된 점수를 저장하는 클래스 (1. 출력형태: 목록) */
public class ScoreRecord1 {
    private List<Integer> scores = new ArrayList<>();  // 점수를 저장함
    private DataSheetView1 dataSheetView;  // 목록 형태로 점수를 출력하는 클래스

    public void setDataSheetView(DataSheetView1 dataSheetView){
        this.dataSheetView = dataSheetView;
    }

    // 새로운 점수를 추가하면 출력하는 것에 변화를 통보(update())하여 출력하는 부분 갱신
    public void addScore(int score){
        scores.add(score);  // scores 목록에 주어진 점수를 추가함
        dataSheetView.update();  // scores가 변경됨을 통보함
    }

    // 출력하는 부분에서 변화된 내용을 얻어감
    public List<Integer> getScoreRecord(){
        return scores;
    }
}
