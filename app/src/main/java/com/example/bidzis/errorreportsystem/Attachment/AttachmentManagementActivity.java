package com.example.bidzis.errorreportsystem.Attachment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bidzis.errorreportsystem.R;

public class AttachmentManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attachment_management);

        final Button btGetAll = (Button) findViewById(R.id.btGetAllAttachments);
        final Button btGetById = (Button) findViewById(R.id.btGetAttachmentById);
        final Button btGetByFileName = (Button) findViewById(R.id.btGetAttachmentByFileName);
        final Button btGetByMineType = (Button) findViewById(R.id.btGetAttachmentByMineType);
        final Button btGetByMineTypeAndName = (Button) findViewById(R.id.btGetAttachmentByMineTypeAndName);
        final Button btGetByName = (Button) findViewById(R.id.btGetAttachmentByName);
        final Button btGetByType = (Button) findViewById(R.id.btGetAttachmentByType);
        final Button btSave = (Button) findViewById(R.id.btSaveAttachment);

        assert btGetAll != null;
        btGetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetAllActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetById != null;
        btGetById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetByIdActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByFileName != null;
        btGetByFileName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetByFileNameActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByMineType != null;
        btGetByMineType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetByMineTypeActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByMineTypeAndName != null;
        btGetByMineTypeAndName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetByMineTypeAndNameActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByName != null;
        btGetByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetByNameActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByType != null;
        btGetByType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentGetByTypeActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
        assert btSave != null;
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AttachmentManagementActivity.this, AttachmentSaveActivity.class);
                AttachmentManagementActivity.this.startActivity(intent);
            }
        });
    }
}
