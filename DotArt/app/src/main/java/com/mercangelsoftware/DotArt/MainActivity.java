package com.mercangelsoftware.DotArt;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.util.*;

public class MainActivity extends Activity 
{
	GridLayout mainGrid;
	int columnCount = 3;
	int rowCount = 3;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		mainGrid = (GridLayout)findViewById(R.id.main_grid);
		mainGrid.setColumnCount(columnCount);
		mainGrid.setRowCount(rowCount);
		
		for(int i = 0; i < rowCount; i++){
			for (int j = 0; j < columnCount; j++){
				TextView t = new TextView(mainGrid.getContext());
				t.setText("A");
				GridLayout.LayoutParams param =new GridLayout.LayoutParams();
				param.height = GridLayout.LayoutParams.WRAP_CONTENT;
				param.width = GridLayout.LayoutParams.WRAP_CONTENT;
				param.rightMargin = 5;
				param.topMargin = 5;
				param.setGravity(Gravity.CENTER);
				param.columnSpec = GridLayout.spec(i);
				param.rowSpec = GridLayout.spec(j);
				//ViewGroup.LayoutParams parms = new ViewGroup.LayoutParams(mainGrid.getContext(), new AttributeSet());
				mainGrid.addView(t, j + (i * columnCount), param);
			}
		}
    }
}
