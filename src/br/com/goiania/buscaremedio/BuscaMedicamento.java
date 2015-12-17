package br.com.goiania.buscaremedio;

import br.com.goiania.buscaremedio.utils.CustomAutoCompleteTextChangedListener;
import br.com.goiania.buscaremedio.utils.CustomAutoCompleteView;
import br.com.goiania.buscaremedio.utils.ListaMedicamentos;
import android.app.Activity;
import android.os.Bundle;

public class BuscaMedicamento extends Activity {
	
	public CustomAutoCompleteView myAutoComplete;
    
    // adapter for auto-complete
    public ListaMedicamentos adapter;
     
    // just to add some initial value
    public String[] item = new String[] {"Informe 3 caracteres!"};
	
	@Override
	public void onCreate(Bundle bundle){
		
		super.onCreate(bundle);
		
		setContentView(R.layout.busca_medicamento);
		
		try{
	        
	        myAutoComplete = (CustomAutoCompleteView)findViewById(R.id.autoCompleteTextView1);
	        
			adapter = new ListaMedicamentos(this,R.layout.lista_medicamentos,item);
			
			myAutoComplete.setAdapter(adapter);	
			
			myAutoComplete.addTextChangedListener(new CustomAutoCompleteTextChangedListener(this));
             
            // add the listener so it will tries to suggest while the user types
            //myAutoComplete.addTextChangedListener(new CustomAutoCompleteTextChangedListener(this));
         
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
