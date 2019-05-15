package com.mycompany.androidexample.UI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.mycompany.androidexample.R;

import java.util.ArrayList;
import java.util.List;

public class FruitListView extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_list_view);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(FruitListView.this,R.layout.ui_list_view,fruitList);
        ListView fruitListView =(ListView) findViewById(R.id.list_view);
        fruitListView.setAdapter(adapter);
    }
    private void initFruits(){
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana=new Fruit("banana",R.drawable.banana_pic);
            fruitList.add(apple);
            Fruit orange=new Fruit("orange",R.drawable.orange_pic);
            fruitList.add(apple);
            Fruit watermelon=new Fruit("watermelon",R.drawable.watermelon_pic);
            fruitList.add(apple);
            Fruit pear=new Fruit("pear",R.drawable.pear_pic);
            fruitList.add(apple);
            Fruit grape=new Fruit("grape",R.drawable.grape_pic);
            fruitList.add(apple);
            Fruit pineapple=new Fruit("pineapple",R.drawable.pineapple_pic);
            fruitList.add(apple);
            Fruit strawberry=new Fruit("strawberry",R.drawable.strawberry_pic);
            fruitList.add(apple);
            Fruit cherry=new Fruit("cherry",R.drawable.cherry_pic);
            fruitList.add(apple);
            Fruit mango=new Fruit("mango",R.drawable.mango_pic);
            fruitList.add(apple);
        }
    }
}
