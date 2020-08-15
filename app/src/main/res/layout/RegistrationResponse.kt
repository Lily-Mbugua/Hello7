package ke.co.hello7

class RegistrationResponse {
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
}