package th.ac.su.ict.curencyconverter

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import th.ac.su.ict.currencyconverter.MoneyResponse

interface MoneyService {
    @GET("latest?")
    fun getCurrentRatesData(@Query("base")exUnit:String
    ): Call<MoneyResponse>

}