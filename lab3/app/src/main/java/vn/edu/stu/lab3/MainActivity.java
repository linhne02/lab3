package vn.edu.stu.lab3;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txt_hoten, txt_cmnd, txt_thongtinkhac;
    Button btn_luu;
    RadioButton rdo_nam, rdo_nu, rdo_khac;
    CheckBox chk_an, chk_mac, chk_choigame;
    ListView list;

    ArrayList<Person> array = new ArrayList<>();
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        addControls();
        addEvents();


    }
    private void addControls(){
        txt_hoten=findViewById(R.id.txtHoTen);
        txt_cmnd=findViewById(R.id.txtCMND);
        txt_thongtinkhac=findViewById((R.id.txtThongTinKhac));
        btn_luu=findViewById(R.id.btnLuu);
        rdo_nam=findViewById(R.id.rdbNam);
        rdo_nu=findViewById(R.id.rdbNu);
        rdo_khac=findViewById(R.id.rdbKhongXacDinh);
        chk_an=findViewById(R.id.ckbAnNgon);
        chk_mac=findViewById(R.id.ckbMacDep);
        chk_choigame=findViewById(R.id.ckbChoiGame);
        list=findViewById(R.id.List);
        adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                array
        );
        list.setAdapter(adapter);
    }
private void addEvents(){
        btn_luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Person p = new Person();
                p.setHoten(txt_hoten.getText().toString());
                p.setCmnd(txt_cmnd.getText().toString());
                p.setThonginkhac(txt_thongtinkhac.getText().toString());

                if(rdo_nam.isChecked()==true)
                    p.setGioitinh(0);


            }
        });

}

//be linh xinh dep

}