package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;


public class PlayerList {

	List<PlayerDto> list = new ArrayList<PlayerDto>();
	
	
	private void playerList() {
		System.out.println("=== �λ� ��� ����� ===");
		System.out.println("--------------------------------------------------------------");
				
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(list.get(i));
		}
	}
	
	// List(Collection)�� ��ü�� add�� ������ �ּҰ���(reference��) add�� ��
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
			System.out.println("������ �����ϴ�.");
		} else {
			System.out.println(playerDto);
		}
	}
	
	
	public static void main(String[] args) {
		
		PlayerList pl = new PlayerList();
		
		pl.playerRegister(new PlayerDto(24, "�����", 4, 0.321));
		pl.playerRegister(new PlayerDto(13, "����", 5, 0.351));
		pl.playerRegister(new PlayerDto(34, "�����", 1, 0.001));
		pl.playerRegister(new PlayerDto(9, "�丣������", 3, 0.421));
		pl.playerRegister(new PlayerDto(38, "�����", 7, 0.384));
		
		pl.playerList();
		
		int number = 38;
		System.out.println(number + "�� ���� ����");
		PlayerDto playerDto = pl.playerSearch(number);
		pl.playerInfo(playerDto);
		
		number = 14;
		double score = 0.357;
		//List<PlayerDto> list = pl.list;
		playerDto = pl.playerSearch(number);
		if (playerDto != null) {
			playerDto.setGrade(score);
			//list.set(list.indexOf(playerDto), playerDto);
			System.out.println(number + "�� ���� ��Ÿ. Ÿ���� " + score + "�� ����");
		}
		pl.playerInfo(playerDto);
		
		pl.playerList();
	}
}
