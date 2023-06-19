package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
public class TodoList extends AppCompatActivity {

    private ArrayList<String> toDoList;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        // 변수 초기화
        toDoList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, R.layout.activity_todo_list, toDoList);
        listView = findViewById(R.id.list_view);
        editText = findViewById(R.id.editText);

        // 어댑터를 리스트뷰에 적용
        listView.setAdapter(adapter);

        // 할 일 추가 버튼 클릭 이벤트 처리
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItemToList();
            }
        });

        // 리스트 아이템 클릭 이벤트 처리
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                // 취소선 추가
                textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            }
        });
    }



    // 리스트에 아이템 추가
    private void addItemToList() {
        String item = editText.getText().toString();
        if (!item.isEmpty()) {
            toDoList.add(item);
            adapter.notifyDataSetChanged();
            editText.setText("");
        }
    }
}
