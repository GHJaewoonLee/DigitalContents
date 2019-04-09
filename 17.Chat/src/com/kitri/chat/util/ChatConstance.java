package com.kitri.chat.util;


public class ChatConstance {
	public static final int PORT = 9876;
	
	// Protocol 정의
	// client -> server
	/* 접속 */				// 100|대화명
	/* 모든 사람에게 메시지 */	// 200|메시지
	/* 특정 사람에게 메시지 */	// 250|대상자|메시지
	/* 쪽지 보내기 */			// 300|대상자|메시지
	/* 대화명 변경 */			// 400|변경할대화명
	/* 접속종료 */				// 900|
	public static final int CS_CONNECT = 100;
	public static final int CS_ALL = 200;
	public static final int CS_TO = 250;
	public static final int CS_PAPER = 300;
	public static final int CS_RENAME = 400;
	public static final int CS_DISCONNECT = 900;
	
	// server -> client
	/* 접속 */				// 100|접속자의대화명
	/* 모든 사람에게 메시지 */	// 200|[보낸사람대화명] 메시지
	/* 특정 사람에게 메시지 */	// 200|☆보낸사람대화명☆ 메시지
	/* 쪽지 보내기 */			// 300|보낸사람대화명|메시지
	/* 대화명 변경 */			// 400|변경전대화명|변경할대화명
	/* 접속종료 */				// 900|접속종료자
	public static final int SC_CONNECT = 100;
	public static final int SC_MESSAGE = 200;
	public static final int SC_PAPER = 300;
	public static final int SC_RENAME = 400;
	public static final int SC_DISCONNECT = 900;
}
