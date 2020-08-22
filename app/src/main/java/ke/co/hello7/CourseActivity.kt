package ke.co.hello7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_registration.*


class CourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var courseList = listOf<Course>(
            Course("89", "Java", "Java34", "Buyole Isacko", "Java Intro"),
            Course("100", "Python", "Py453", "James Mwai", "Kotlin Class"),
            Course("343", "Kotlin", "Kot10", "John Owour", "OOP classes"),
            Course("900", "JavaScript", "JS34", "Purity Maina", "MamaMboga"),
            Course("789", "Entreprenuership", "Ent34", "Kellie Murungi", "Entreprenuership"),
            Course("100", "Design", "Des453", "Nyandia", "Design Class"),
            Course("343", "Electronics", "Elec10", "Barre", "Electronic classes")

        )
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        rvCourses.adapter = CoursesRecyclerViewAdapter(courseList)
    }
}
