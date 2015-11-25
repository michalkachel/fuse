package pl.elabo.fuseapp.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class RestClient {

	private static RestClient sRestClient;

	private FuseApi mFuseApi;

	public RestClient() {

		Gson gson = new GsonBuilder()
				.create();

		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://fusion-universal.com")
				.addConverterFactory(GsonConverterFactory.create(gson))
				.build();

		mFuseApi = retrofit.create(FuseApi.class);
	}

	private static RestClient getInstance() {
		if (sRestClient == null) {
			sRestClient = new RestClient();
		}
		return sRestClient;
	}

	public static FuseApi getFuseApi() {
		return getInstance().mFuseApi;
	}
}
