package ke.co.hello7

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.stream.IntStream.builder

object ApiClient {
    var client = OkHttpClient.Builder().build()

    var retrofit = retrofit2.Builder()
        .baseUrl("https://courses-service.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }

}