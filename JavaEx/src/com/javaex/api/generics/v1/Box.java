package com.javaex.api.generics.v1;

//	모든 것들을 담을 수 있는 박스를 설계
public class Box {
	Object content; //	모든 클래스 부모 -> 다 들어간다

	//	Getters / Setters
	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
