package com.example.bidzis.errorreportsystem.History;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bidzis.errorreportsystem.R;

public class HistoryManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_management);

        final Button btGetAll = (Button) findViewById(R.id.btGetAllHistories);
        final Button btGetByDate = (Button) findViewById(R.id.btGetHistoriesByDate);
        final Button btGetById = (Button) findViewById(R.id.btGetHistoryById);
        final Button btGetByUserId = (Button) findViewById(R.id.btGetHistoriesByUserId);
        final Button btGetByUserIdAndDate = (Button) findViewById(R.id.btGetHistoriesByUserIdAndDate);
        final Button btRemove = (Button) findViewById(R.id.btRemoveHistory);
        final Button btSave = (Button) findViewById(R.id.btSaveHistory);
        final Button btSaveWithAttachment = (Button) findViewById(R.id.btSaveHistoryWithAttachment);


        assert btGetAll != null;
        btGetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistoryGetAllActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByDate != null;
        btGetByDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistoryGetByDateActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetById != null;
        btGetById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistoryGetByIdActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByUserId != null;
        btGetByUserId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistoryGetByUserIdActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByUserIdAndDate != null;
        btGetByUserIdAndDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistoryGetByUserIdAndDateActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btRemove != null;
        btRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistoryRemoveActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btSave != null;
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistorySaveActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
        assert btSaveWithAttachment != null;
        btSaveWithAttachment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoryManagementActivity.this, HistorySaveWithAttachmentActivity.class);
                HistoryManagementActivity.this.startActivity(intent);
            }
        });
    }
}
