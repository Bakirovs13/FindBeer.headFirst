package com.example.startandroidlessons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BeerExperrt beerExpert = new BeerExperrt();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //огда пользователь щелкает на кнопке Find Beer,
    // вызывается метод onClickFindBeer() из класса активности.
    public void onClickFindBeer(View view) {

        Spinner spinnerBeer = (Spinner) findViewById(R.id.spinner);
        TextView textViewBeer= (TextView) findViewById(R.id.beer_tv);


        String spinnerBeerType = String.valueOf(spinnerBeer.getSelectedItem());
        //Метод getSelectedItem()возвращает
        //вариант, выбранный в раскрывающемся списке.


        //Метод onClickFindBeer() вызывает метод getBrands() из
        // класса BeerExpert, передавая ему вид пива, выбранный в раскрывающемся списке.
        List<String>brandList = beerExpert.getBrands(spinnerBeerType);
        StringBuilder brandsFormatted =new StringBuilder();
        for (String brand:brandList){
            brandsFormatted.append(brand).append('\n');//аждый сорт выво- дится с новой строки.
        }
       textViewBeer.setText(brandsFormatted);




    }
}