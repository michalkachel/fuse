package pl.elabo.fuseapp.network;

import pl.elabo.fuseapp.model.Company;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface FuseApi {

	@GET("https://{companyName}.fusion-universal.com/api/v1/company.json")
	Call<Company> company(@Path("companyName") String companyName);

}
