package com.example.bidzis.errorreportsystem.Permission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bidzis.errorreportsystem.R;

public class PermissionManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_management);

        final Button btGetAll = (Button) findViewById(R.id.btGetAllPermissions);
        final Button btGetById = (Button) findViewById(R.id.btGetPermissionById);
        final Button btGetByName = (Button) findViewById(R.id.btGetPermissionByName);
        final Button btRemove = (Button) findViewById(R.id.btRemovePermission);
        final Button btSave = (Button) findViewById(R.id.btSavePermission);

        assert btGetAll != null;
        btGetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermissionManagementActivity.this, PermissionGetAllActivity.class);
                PermissionManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetById != null;
        btGetById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermissionManagementActivity.this, PermissionGetByIdActivity.class);
                PermissionManagementActivity.this.startActivity(intent);
            }
        });
        assert btGetByName != null;
        btGetByName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermissionManagementActivity.this, PermissionGetByNameActivity.class);
                PermissionManagementActivity.this.startActivity(intent);
            }
        });
        assert btRemove != null;
        btRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermissionManagementActivity.this, PermissionRemoveActivity.class);
                PermissionManagementActivity.this.startActivity(intent);
            }
        });
        assert btSave != null;
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermissionManagementActivity.this, PermissionSaveActivity.class);
                PermissionManagementActivity.this.startActivity(intent);
            }
        });
    }
}
