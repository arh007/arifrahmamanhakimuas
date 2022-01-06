package simple.example.motorpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import simple.example.motorpedia.model.Honda;
import simple.example.motorpedia.model.Motor;
import simple.example.motorpedia.model.Suzuki;
import simple.example.motorpedia.model.Yamaha;

public class DaftarMotorActivity extends AppCompatActivity {
    public final static String MOTOR_TERPILIH ="motor_obj_key";
    List<Motor> motors;
    ListView listView;
    String merekMotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_motor);
        Intent intent = getIntent();
        merekMotor = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        motors = DataProvider.getMotorsByTipe(this, merekMotor);
        TextView txMerekList = findViewById(R.id.text_title_daftar);
        String judul="";
        if (motors.get(0) instanceof Honda) {
            judul = getString(R.string.honda_list_title);
        } else if (motors.get(0) instanceof Yamaha) {
            judul = getString(R.string.yamaha_list_title);
        } else if (motors.get(0) instanceof Suzuki) {
            judul = getString(R.string.suzuki_list_title);
        }
        txMerekList.setText(judul);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_motor);
        DaftarMotorAdapter adapter = new DaftarMotorAdapter(this, motors);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Motor terpilih = motors.get(position);
            bukaProfileMotor(terpilih);
        }
    };

    private void bukaProfileMotor(Motor motorTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(MOTOR_TERPILIH, motorTerpilih);
        startActivity(intent);
    }

}