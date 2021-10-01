package com.example.myapplication_3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import model.Car;
import model.CarFectory;
import model.Icardata;

public class MainActivity extends AppCompatActivity {
private Spinner spinner  ;
private TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner  = findViewById(R.id.spinner) ;
        editText = findViewById(R.id.edittext) ;
        papulatespinner();
    }
    public void eventsubmit(View view) {
       CarFectory carfactory = new CarFectory();
        Icardata obj = carfactory.getmodel();
        String item = spinner.getSelectedItem().toString() ;
        List<Car> cars = obj.getcars(item);
        String str = "";
        for (Car c : cars) {
            str += "name: "+ c.getName() +" , price = "+ c.getPrice() +"\n_________________\n" ;

        }
        editText.setText(str);
    }
    private void papulatespinner() {
        CarFectory carfactory = new CarFectory();
        Icardata obj = carfactory.getmodel();
        String[] types = obj.gettypes();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,types);
        spinner.setAdapter(adapter);
    }


}