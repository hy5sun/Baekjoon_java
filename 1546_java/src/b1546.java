import java.util.Scanner;

public class b1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //시험 본 과목 수
        double[] score = new double[n]; //점수 배열 선언 및 생성
        //double로 안 하고 int로 했다가 몇시간 동안 고통받았다.. 타입의 중요성,,
        double sum = 0; //총 점수

        for (int i = 0; i < n; i++) //연속해서 입력받은 값 배열에 저장
            score[i] = sc.nextInt();
        
        double max = score[0];
        for (int i = 0; i < n; i++) //점수 최댓값 구하기
            if (score[i] > max)
                max = score[i];

        for (int i = 0; i < n; i++){
            score[i] = score[i] / max * 100; //세준이의 짠한 점수 조작
            sum += score[i]; //총 점수 계산
        }
    
        double ave = sum / n; //조작된 평균 값 계산
        System.out.println(ave);

        sc.close();
    }
}