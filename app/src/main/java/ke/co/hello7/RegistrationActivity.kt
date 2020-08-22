package ke.co.hello7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.editTextTextPersonName
import kotlinx.android.synthetic.main.activity_main.editTextTextPersonName
import kotlinx.android.synthetic.main.activity_registration.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class Registrationactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        tvRegister.setOnClickListener {
            var FirstName = editTextTextPersonName.text.toString()
            var Password = editTextTextPersonName.text.toString()
            var LastName = editTextTextPersonName2.text.toString()
            var email = editTextTextPersonName.text.toString()
            var PhoneNumber = intArrayOf().text.toString()
            var ConfirmPassword = editTextTextPersonName.text.toString()

            var requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("first_name", FirstName)
                .addFormDataPart("last_name", LastName)
                .addFormDataPart("email", email)
                .addFormDataPart("phone_number", PhoneNumber)
                .addFormDataPart("password", Password)
                .build()

            //registerUser(requestBody)
            Toast.makeText(baseContext, Password, Toast.LENGTH_LONG).show()


        }
        fun registerUser(requestBody: RequestBody) {
            var apiClient = ApiClient.buildService(ApiInterface::class.java)
            var registrationCall = apiClient.registerStudent(requestBody)
            registrationCall.enqueue(object : Callback<Registrationactivity> {
                override fun onFailure(call: Call<Registrationactivity>, t: Throwable) {
                    Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
                }

                override fun onResponse(
                    call: Call<Registrationactivity>
                    response: Response<Registrationactivity>
                ) {
                    if (response.isSuccessful) {
                        Toast.makeText(baseContext, response.body()?.message, Toast.LENGTH_LONG)
                            .show()
                        startActivity(Intent(baseContext, MainActivity::class.java))
                    } else {
                        Toast.makeText(
                            baseContext,
                            response.errorBody().toString(),
                            Toast.LENGTH_LONG
                        )
                            .show()
                    }
                }
            })
        }
    }
}
