package BehavioralPattern.Observer.Problem;

import java.util.List;

/* 1. 출력형태: 목록 형태로 출력하는 클래스 */
public class DataSheetView1 {
    private ScoreRecord1 scoreRecord;
    private int viewCount;

    public DataSheetView1(ScoreRecord1 scoreRecord, int viewCount){
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    // 점수의 변경을 통보받음
    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();  // 점수를 조회함
        displayScores(record, viewCount);  // 조회된 점수를 viewCount만큼만 출력함
    }

    private void displayScores(List<Integer> record, int viewCount){
        System.out.println("List of " + viewCount + " entries: ");

        for(int i=0; i<viewCount&&i<record.size(); i++){
            System.out.println(record.get(i) + " ");
        }

        System.out.println();
    }
}
