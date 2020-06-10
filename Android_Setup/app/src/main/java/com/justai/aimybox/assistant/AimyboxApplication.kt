package com.justai.aimybox.assistant

import android.app.Application
import android.content.Context
import android.widget.Toast
import com.justai.aimybox.Aimybox
import com.justai.aimybox.dialogapi.rasa.RasaDialogApi
import com.justai.aimybox.components.AimyboxProvider
import com.justai.aimybox.core.Config
import com.justai.aimybox.model.Response
import com.justai.aimybox.speechkit.google.platform.GooglePlatformSpeechToText
import com.justai.aimybox.speechkit.google.platform.GooglePlatformTextToSpeech
import java.util.*
import kotlin.collections.LinkedHashSet

class AimyboxApplication : Application(), AimyboxProvider {

    companion object {
        private const val AIMYBOX_API_KEY = "Ldf0j7WZi3KwNah2aNeXVIACz0lb9qMH"

    }

    override val aimybox by lazy { createAimybox(this)

    }

    private fun createAimybox(context: Context): Aimybox {
        val unitId = UUID.randomUUID().toString()

        val textToSpeech = GooglePlatformTextToSpeech(context, Locale.ENGLISH)
        val speechToText = GooglePlatformSpeechToText(context, Locale.ENGLISH)
        val dialogApi = RasaDialogApi(unitId, "https://6006f13e306e.ngrok.io/webhooks/rest/webhook",customSkills = linkedSetOf(Botskills()))
      //  Toast.makeText(this, "Your intention is ", Toast.LENGTH_LONG).show()
        return Aimybox(Config.create(speechToText, textToSpeech, dialogApi))
    }
}