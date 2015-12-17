package br.com.goiania.buscaremedio.utils;

import br.com.goiania.buscaremedio.BuscaMedicamento;
import br.com.goiania.buscaremedio.R;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
 
public class CustomAutoCompleteTextChangedListener implements TextWatcher{
	
	public static BuscaMedicamento mainActivity;
 
    public static final String TAG = "CustomAutoCompleteTextChangedListener.java";
    Context context;
     
    public CustomAutoCompleteTextChangedListener(Context context){
        this.context = context;
    }
     
    @Override
    public void afterTextChanged(Editable s) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
            int after) {
        // TODO Auto-generated method stub
         
    }
 
    @Override
    public void onTextChanged(CharSequence userInput, int start, int before, int count) {
 
        // if you want to see in the logcat what the user types
        Log.e(TAG, "User input: " + userInput);
 
        mainActivity = ((BuscaMedicamento) context);
        
        if(userInput.length() == 3){
        	
        	mainActivity.adapter.notifyDataSetChanged();
            
            mainActivity.adapter = new ListaMedicamentos(context,R.layout.lista_medicamentos,new String[]{"teste","teste3"});
    		
            mainActivity.myAutoComplete.setAdapter(mainActivity.adapter);
        	
        }
        
        /*Handler handler = new Handler(); 
        handler.postDelayed(new Runnable() { 
             public void run() { 
            	 Log.e(TAG, "teste");
            	 mainActivity.adapter.notifyDataSetChanged();
                 
                 mainActivity.adapter = new ListaMedicamentos(context,R.layout.lista_medicamentos,new String[]{});
         		
                 mainActivity.myAutoComplete.setAdapter(mainActivity.adapter);
             } 
        }, 2000);*/
        
        /**/
        
        //mainActivity.myAutoComplete.showDropDown();
        //mainActivity.myAutoComplete.requestFocus();
         
    }
 
}