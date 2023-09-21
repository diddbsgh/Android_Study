package com.example.mvvmex;

import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {   // ViewModel 클래스를 상속받음
    private CounterModel counterModel;  // CounterModel 객체를 사용하여 카운터 값 관리
    public CounterViewModel() {
        this.counterModel = new CounterModel();
    }

    public int getCount() {     // getCount 메소드 -> CounterModel에서 가져온 카운터 값 반환
        return counterModel.getCount();
    }

    public void incrementCount() {  // CounterModel에서 카운터 증가시킴
        counterModel.increment();
    }
}