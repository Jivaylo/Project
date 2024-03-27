package ladd.marshall.androidmvvmexample.api

import ladd.marshall.androidmvvmexample.model.models.Employee
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface EmployeeEndpoints {


    @GET("api/v1/employees")
    suspend fun getEmployeeList(): List<Employee>


    @GET("api/v1/employee/{employeeId}")
    suspend fun getEmployeeById(@Path("employeeId") employeeId: Int): Employee


    @GET("api/v1/employees")
    suspend fun getEmployeeListRequireToken(@Header("x-api-key") key: String): List<Employee>
}
