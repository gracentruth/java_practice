import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        //어레이리스트 생성
        ArrayList<String> nameList=new ArrayList<String>();

        //엘레멘트 추가
        nameList.add("dog"); //인덱스 0부터 시작
        nameList.add("cat");
        nameList.add("bear");
        nameList.add("rabit");
        //크기
        System.out.println("크기: "+nameList.size());

        //특정 인덱스 요소 가져오기
        System.out.println("2번째 요소"+nameList.get(1));
        //특정 인덱스 요소 삭제하기
        nameList.remove(0);

        for(int i=0;i<nameList.size();i++){
           System.out.println((i+1)+". "+nameList.get(i));
        }

        for(String n : nameList){
            System.out.println(n);
        }
        //반복자 사용
        ArrayList<String> List=new ArrayList<String>();
        List.add("a");
        List.add("b");
        List.add("c");

        Iterator<String> it=List.iterator();

       while(it.hasNext()){
            System.out.println(it.next());
        }





  }

}
