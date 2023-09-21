package com.example.mvvmex;


public class CounterModel {     // 카운터의 데이터 모델을 나타내는 클래스
    private int count;      // 카운터 값 저장

    public int getCount() {     // 현재 카운터 값을 반환하는 메소드
        return count;
    }

    public void increment() {    //카운터를 증가시키는 메소드
        count++;
    }
}