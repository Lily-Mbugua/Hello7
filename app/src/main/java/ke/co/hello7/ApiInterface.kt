package ke.co.hello7

import android.net.nsd.NsdManager
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiInterface {
    @POST("register")

    fun registerStudent(@Body requestBody: RequestBody): Call<NsdManager.RegistrationListener>
}



