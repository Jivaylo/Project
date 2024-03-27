package ladd.marshall.androidmvvmexample.model.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "employee_table")
data class Employee(
    @Expose
    @PrimaryKey
    val id: Int,

    @SerializedName("employee_name")
    @Expose
    val employeeName: String,
    @SerializedName("employee_salary")
    @Expose
    val employeeSalary: Int,
    @SerializedName("employee_age")
    @Expose
    val employeeAge: Int,
    @SerializedName("profile_image")
    @Expose
    val profileImage: String
)
