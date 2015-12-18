package br.com.goiania.buscaremedio.servico;

import org.json.JSONObject;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class BuscaMedicamento extends AsyncTask<String, Context, JsonObjectRequest> {

	Context context;
	
	String url = "http://ip.jsontest.com/";
	
	ProgressDialog pd;
	
	public BuscaMedicamento(Context context){
		this.context = context;
		
	}
	@Override
	protected JsonObjectRequest doInBackground(String... arg0) {
		
		JsonObjectRequest jsObjRequest = new JsonObjectRequest
		        (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

		    @Override
		    public void onResponse(JSONObject response) {
		        Log.d("Resposta: ", response.toString());
		    }
		}, new Response.ErrorListener() {

		    @Override
		    public void onErrorResponse(VolleyError error) {
		        // TODO Auto-generated method stub

		    }
		});
		
		return jsObjRequest;
	}

	@Override
	protected void onPreExecute() {
			pd = new ProgressDialog(context);
			pd.setMessage("Carregando Captcha...");
			pd.show();
	}
	
	@Override
	protected void onPostExecute(JsonObjectRequest result) {
			pd.dismiss();
	}

}
