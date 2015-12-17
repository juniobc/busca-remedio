package br.com.goiania.buscaremedio.utils;

import br.com.goiania.buscaremedio.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.LayoutInflater;
//import br.com.goiania.buscaremedio.R;

public class ListaMedicamentos extends ArrayAdapter <String> {
	
	Context context;
	int resource;
	String data[] = null;
	
	public ListaMedicamentos (Context context, int resource, String[] object) {
		super(context, resource, object);
		this.context = context;
		this.data = object;
		this.resource = resource;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		if(convertView == null){
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			convertView = inflater.inflate(resource, parent,false);
		}
		
		LinearLayout root = (LinearLayout) convertView.findViewById(R.id.row);
		
		TextView msg_tamanho_caracter = (TextView) convertView.findViewById(R.id.msg_tamanho_caracter);
		TextView nm_medicamento = (TextView) convertView.findViewById(R.id.nm_medicamento);
		
		if(data.length != 0){
			
			msg_tamanho_caracter.setVisibility(View.GONE);
			
		}
		
		nm_medicamento.setText(data[position]);
		
		return convertView;
		
	}

}
