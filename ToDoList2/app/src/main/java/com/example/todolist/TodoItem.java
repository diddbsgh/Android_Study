package com.example.todolist;

public class TodoItem {

    private String title;
    private String content;
    private String date;
    private int color; // TODO: 색상을 나타내는 변수 추가

    // 생성자: TodoItem 초기화 시 필요한 데이터를 받아옴
    public TodoItem(String title, String content, String date, int color) {
        this.title = title;
        this.content = content;
        this.date = date;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public int getColor() {
        return color;
    }
}
