package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.todolist.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private TodoListAdapter todoListAdapter;  // TodoListAdapter 선언
    private ArrayList<TodoItem> todoList;    // TodoItem 목록 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // 할 일 목록과 어댑터 초기화
        todoList = new ArrayList<>();
        todoListAdapter = new TodoListAdapter(todoList);

        // RecyclerView 설정
        binding.recyclerviewList.setLayoutManager(new LinearLayoutManager(this));

        // RecyclerView에 어댑터 설정
        binding.recyclerviewList.setAdapter(todoListAdapter);

        // btn_add 버튼 클릭 시 이벤트 처리
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // activity_main -> activity_add로 화면 전환
                Intent intent = new Intent(MainActivity.this, ActivityAdd.class);
                startActivityForResult(intent, 1); // 수정: requestCode를 1로 설정
            }
        });
    }

    // onActivityResult 구현 - ActivityAdd에서의 결과 처리
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 1) {
            // ActivityAdd에서 입력 받은 데이터 가져오기
            String title = data.getStringExtra("title");
            String content = data.getStringExtra("content");
            String date = data.getStringExtra("date");
            int color = data.getIntExtra("color", R.color.default_color);  // 기본 색상 설정

            // ToDoItem 생성
            TodoItem todoItem = new TodoItem(title, content, date, color);

            // ToDoItem을 todoList에 추가하고 어댑터 업데이트
            addTodoItem(todoItem);
        }
    }

    // 할 일 항목을 todoList에 추가하고 어댑터 업데이트하는 메서드 구현
    private void addTodoItem(TodoItem todoItem) {
        todoList.add(todoItem);
        todoListAdapter.updateData(todoList);
    }
}
