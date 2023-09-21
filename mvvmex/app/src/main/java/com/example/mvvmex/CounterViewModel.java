package com.example.mvvmex;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    private CounterModel counterModel;  // 카운터 데이터 모델 저장
    private MutableLiveData<Integer> countLiveData;  // 카운터 값을 위한 LiveData

    public CounterViewModel() {
        this.counterModel = new CounterModel();  // 카운터 모델 초기화
        this.countLiveData = new MutableLiveData<>();  // MutableLiveData 초기화
        this.countLiveData.setValue(counterModel.getCount());  // 초기 카운터 값 설정
    }

    public LiveData<Integer> getCountLiveData() {
        return countLiveData;  // 카운터 LiveData 반환
    }

    public void incrementCount() {
        counterModel.increment();  // 카운터 증가 메소드 호출
        countLiveData.setValue(counterModel.getCount());  // 변경된 카운터 값을 LiveData에 업데이트
    }
}
