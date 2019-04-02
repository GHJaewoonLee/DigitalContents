package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;


public class PlayerList {

	List<PlayerDto> list = new ArrayList<PlayerDto>();
	
	
	private void playerList() {
		System.out.println("=== 두산 베어스 팀명단 ===");
		System.out.println("--------------------------------------------------------------");
				
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(list.get(i));
		}
	}
	
	// List(Collection)에 객체를 add할 때에는 주소값이(reference가) add가 됨
	private void playerRegister(PlayerDto playerDto) {
		list.add(playerDto);
	}
	
	private PlayerDto playerSearch(int number) {
		PlayerDto playerDto = null;
		int len = list.size();
		
		for (int i = 0; i < len; i++) {
			PlayerDto dto = list.get(i);
			if (list.get(i).getNumber() == number) {
				playerDto = dto;
				break;
			}
		}
		
		return playerDto;
	}
	
	private void playerInfo(PlayerDto playerDto) {
		if (playerDto == null) {
			System.out.println("선수는 없습니다.");
		} else {
			System.out.println(playerDto);
		}
	}
	
	
	public static void main(String[] args) {
		
		PlayerList pl = new PlayerList();
		
		pl.playerRegister(new PlayerDto(24, "오재원", 4, 0.321));
		pl.playerRegister(new PlayerDto(13, "허경민", 5, 0.351));
		pl.playerRegister(new PlayerDto(34, "린드블럼", 1, 0.001));
		pl.playerRegister(new PlayerDto(9, "페르난데스", 3, 0.421));
		pl.playerRegister(new PlayerDto(38, "김대한", 7, 0.384));
		
		pl.playerList();
		
		int number = 38;
		System.out.println(number + "번 선수 정보");
		PlayerDto playerDto = pl.playerSearch(number);
		pl.playerInfo(playerDto);
		
		number = 14;
		double score = 0.357;
		//List<PlayerDto> list = pl.list;
		playerDto = pl.playerSearch(number);
		if (playerDto != null) {
			playerDto.setGrade(score);
			//list.set(list.indexOf(playerDto), playerDto);
			System.out.println(number + "번 선수 안타. 타율이 " + score + "로 변경");
		}
		pl.playerInfo(playerDto);
		
		pl.playerList();
	}
}
