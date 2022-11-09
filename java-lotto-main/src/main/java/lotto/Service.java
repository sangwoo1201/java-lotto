package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class Service {
	int buyCount=0;

	public void buy() {
    	System.out.println("로또 구입 금액을 입력해주세요.");
    	String cash = Console.readLine();
    	int cash1 = Integer.parseInt(cash);
    	if(cash1%1000!=0) {
    		System.out.println("[ERROR] 1,000단위로 입력해주세요.");
    	}else {
        	buyCount = cash1/1000;
        	System.out.println(buyCount+"개를 구입했습니다.");
    	}
    }
	public void list() {
		List<List<Integer>> numbersAll = new ArrayList<>();
		 for (int i = 0; i < buyCount; i++)  {
			 List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
			 Collections.sort(numbers);
			 numbersAll.add(numbers);
			 
	     }
		 System.out.println(numbersAll);
	}
	
}
