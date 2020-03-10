package BehavioralPattern.Observer.Problem;

import java.util.ArrayList;
import java.util.List;

/* 입력된 점수를 저장하는 클래스 (3. 출력형태: 2개 출력 형태를 가질 때) */
public class ScoreRecord3 {
    private List<Integer> scores = new ArrayList<Integer>();  // 점수를 저장함
    private DataSheetView2 dataSheetView;  // 목록 형태로 점수를 출력하는 클래스
    private MinMaxView2 minMaxView;  // 최소/최대 값만을 출력하는 형태의 클래스

    // DataSheetView를 설정함
    public void setDataSheetView(DataSheetView2 dataSheetView){
        this.dataSheetView = dataSheetView;
    }

    // MinMaxView를 설정함
    public void setMinMaxView(MinMaxView2 minMaxView){
        this.minMaxView = minMaxView;
    }

    // 새로운 점수를 추가하면 출력하는 것에 변화를 통보(update())하여 출력하는 부분 갱신
    public void addScore(int score){
        scores.add(score);  // scores 목록에 주어진 점수를 추가함
        dataSheetView.update();  // scores가 변경됨을 통보함
        minMaxView.update();  // scores가 변경됨을 통보함
    }

    // 출력하는 부분에서 변화된 내용을 얻어감
    public List<Integer> getScoreRecord(){
        return scores;
    }
}
