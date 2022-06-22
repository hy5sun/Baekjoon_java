import java.util.Scanner; //스캐너 클래스를 사용하기 위해 import

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //스캐너 변수 선언
        int hour = sc.nextInt(); //시간 입력
        int minute = sc.nextInt(); //분 입력
        int time = sc.nextInt(); //걸리는 시간 입력
        //scan.nextInt(); : 공백 이전까지 입력된 정수를 읽는다.

        minute += time;
        while (minute >= 60)
        {
            if (minute >= 60){
                hour += 1;
                minute -= 60;
            }
            
            if (hour >= 24){
                hour -= 24;
            }
        }
        System.out.println(hour + " " + minute); //시간과 분 출력
    }
}

//scan.next(); : 공백 이전까지 입력된 문자열을 읽는다.
//scan.nextLine(); : 한 줄 띄어쓰기 이전까지 라인 전체 데이터를 읽는다. (공백포함)