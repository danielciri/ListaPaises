package com.danielcirilo.listviewcontries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

public class MainActivity extends AppCompatActivity {
    private Country [] datos;
    private CountryParser parseador;
    private ListView lvMain;
    private CountryArrayAdapter adapterCountry;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parseador = new CountryParser(getResources().openRawResource(R.raw.countries));
        try {
            datos = parseador.parseCountriesFromXml();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        adapterCountry = new CountryArrayAdapter(MainActivity.this,datos);
        lvMain = findViewById(R.id.lvMain);
        lvMain.setAdapter(adapterCountry);
    }
}