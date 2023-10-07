package com.example.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TodoListAdapter extends RecyclerView.Adapter<TodoListAdapter.ViewHolder> {

    private ArrayList<TodoItem> todoItems;

    // 생성자: TodoListAdapter 초기화 시 ArrayList를 받아옴
    public TodoListAdapter(ArrayList<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 뷰홀더 생성
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    public void updateData(ArrayList<TodoItem> todoItems) {
        this.todoItems = todoItems;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TodoItem todoItem = todoItems.get(position);

        // TodoItem의 데이터를 ViewHolder에 바인딩하여 화면에 표시
        holder.tvTitle.setText(todoItem.getTitle());
        holder.tvContent.setText(todoItem.getContent());
        holder.tvDate.setText(todoItem.getDate());
        // TODO: 색상 설정 코드 추가
    }

    @Override
    public int getItemCount() {
        return todoItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvContent;
        public TextView tvDate;

        // ViewHolder 초기화
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title_item);
            tvContent = itemView.findViewById(R.id.content_item);
            tvDate = itemView.findViewById(R.id.tv_date_item);
        }
    }
}
