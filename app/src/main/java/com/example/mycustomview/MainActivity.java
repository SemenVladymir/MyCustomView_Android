package com.example.mycustomview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
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
    listView = findViewById(R.id.listView);

        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(R.drawable.yel_img1, "Ноутбук LENOVO IdeaPad Gaming 3 15ACH6 Shadow Black [82K202BMRA]", "32 999 грн"));
        list.add(new Product(R.drawable.yel_img2, "Ноутбук Acer Aspire 5 A515-57-52BD [NX.KN4EU.00J]", "28 999 грн"));
        list.add(new Product(R.drawable.yel_img3, "Чохол Metal Buttons Colorful for Apple iPhone 15 Pro with MagSafe (Синій)", "749 грн"));
        list.add(new Product(R.drawable.yel_img4, "Apple iMac 24\" M3/8CPU/10GPU/24GB/512GB Purple (Z19P0001W)", "105 499 грн"));
        list.add(new Product(R.drawable.yel_img5, "Apple MacBook Air M1 256Gb Space Gray (MGN63) 2020", "33 399 грн"));
        list.add(new Product(R.drawable.yel_img6, "Смартфон Xiaomi Redmi Note 12S 8/256GB Ice Blue (No NFC) (Global)", "6 899 грн"));

        ProductAdapter adapter = new ProductAdapter(this, R.layout.activity_customview, list);

        listView.setAdapter(adapter);
    }
}