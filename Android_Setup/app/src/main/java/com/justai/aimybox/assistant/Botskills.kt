package com.justai.aimybox.assistant
import android.content.Intent
import android.provider.AlarmClock
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import com.justai.aimybox.Aimybox
import com.justai.aimybox.core.CustomSkill
import com.justai.aimybox.dialogapi.rasa.RasaRequest
import com.justai.aimybox.dialogapi.rasa.RasaResponse
import com.justai.aimybox.model.Response
import com.justai.aimybox.components.AimyboxAssistantFragment
import kotlinx.coroutines.NonCancellable.start
import java.lang.Boolean.TRUE




class Botskills:CustomSkill<RasaRequest, RasaResponse> {
    override fun canHandle(response:RasaResponse) : Boolean = true

    override suspend fun onRequest(request: RasaRequest): RasaRequest {
        request.data?.addProperty("my_string_property", "how are you")
        request.data?.addProperty("my_number_property", 10)
        return request
    }

    override suspend fun onResponse(
        response: RasaResponse,
        aimybox: Aimybox,
        defaultHandler: suspend (Response) -> Unit

    ) {
     //   super.onResponse(response, aimybox, defaultHandler)
        val TAG = response.intent.toString()
        Log.i(TAG, "saved — get item number ")
        aimybox.standby()
    }

}
