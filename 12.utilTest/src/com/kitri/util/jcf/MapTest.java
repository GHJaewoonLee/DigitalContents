package com.kitri.util.jcf;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


public class MapTest {

	public static void main(String[] args) {
		
		// Map은 Key가 같을 경우 나중에 put된 값이 이전 값을 덮어씌움
		//Map<String, PlayerDto> map = new HashMap<String, PlayerDto>();
		Map<String, PlayerDto> map = new Hashtable<String, PlayerDto>();
		map.put("DS24", new PlayerDto(24, "오재원", 4, 0.321));
		map.put("DS9", new PlayerDto(9, "페르난데스", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "박병호", 3, 0.431));
		map.put("HH19", new PlayerDto(19, "정근우", 7, 0.321));
		
		int size = map.size();
		System.out.println("등록 인원 : " + size);
		
		int number = 24;
		System.out.println("두산의 " + number + "번 선수의 정보");
		PlayerDto playerDto = map.get("DS" + number);
		System.out.println(playerDto);
		
		// Map은 순서가 없음
		// 키들만 얻어오거나 값들만 얻어오거나
	}
}
