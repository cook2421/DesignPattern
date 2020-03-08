package BehavioralPattern.Observer.Problem;

import java.util.Collections;
import java.util.List;

/* 2. 출력형태: 최소/최대 값만을 출력하는 형태의 클래스 */
public class MinMaxView1 {
    private ScoreRecord2 scoreRecord;

    // getScoreRecord()를 호출하기 위해 ScoreRecord2 객체를 인자로 받음
    public MinMaxView1(ScoreRecord2 scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    // 점수의 변경을 통보받음
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();  // 점수를 조회함
        displayScores(record);  // 최소값과 최대값을 출력함
    }

    // 최소값과 최대값을 출력함
    private void displayScores(List<Integer> record){
        int min = Collections.min(record, null);
        int max = Collections.max(record, null);
        System.out.println("Min: " + min + ", Max: " + max);
    }
}

