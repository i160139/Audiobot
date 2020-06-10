package com.justai.aimybox.assistant;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.provider.AlarmClock;
import android.provider.ContactsContract;
import android.speech.RecognizerIntent;
import android.telephony.SmsManager;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

import static java.lang.Boolean.TRUE;
import static java.lang.Thread.sleep;

public class assistant extends AppCompatActivity {
    private static final String TAG = "ChatActivity";
    private ChatArrayAdapter chatArrayAdapter;
    private ListView listView;
    private EditText chatText;
    private FloatingActionButton sendButton;
    private FloatingActionButton listenButton;
    private Animation pop_in_anim;
    private Animation pop_out_anim;
    private final int REQ_CODE_SPEECH_INPUT = 100;
    private boolean rightSide = true; //true if you want message on right rightSide
    MediaPlayer mediaPlayer;
    private int choice=-1;
    private TextView rTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistant);
        TTS.init(getApplicationContext());
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.goldenhour); // DON'T COMMENT THIS
       // call("Abdul Wahab");
        //createAlarm("WAKE UP",12,22);
        //sendSMS("Zeela","This is MR Audiobot.");
        //playMusic();
        //stopMusic();
        //playVideo();
        sendButton = (FloatingActionButton) findViewById(R.id.btn_send);
        listView = (ListView) findViewById(R.id.msgview);
        listenButton = (FloatingActionButton) findViewById(R.id.btn_mic);
        chatText = (EditText) findViewById(R.id.msg);

        pop_in_anim = AnimationUtils.loadAnimation(this, R.anim.pop_in);
        pop_out_anim = AnimationUtils.loadAnimation(this, R.anim.pop_out);
        sendButton.setAnimation(pop_out_anim);
        sendButton.setAnimation(pop_in_anim);
        listenButton.setAnimation(pop_in_anim);
        listenButton.setAnimation(pop_out_anim);
        sendButton.clearAnimation();
        listenButton.clearAnimation();

        chatArrayAdapter = new ChatArrayAdapter(this, R.layout.right);
        listView.setAdapter(chatArrayAdapter);

        rTextView = (TextView) findViewById(R.id.msgr);
        rTextView.setText("hello");
        rTextView.setMovementMethod(LinkMovementMethod.getInstance());


        chatText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 0 && listenButton.getVisibility() == View.GONE) {
                    sendButton.clearAnimation();
                    sendButton.startAnimation(pop_out_anim);
                    sendButton.hide();
                    sendButton.setEnabled(false);
                    listenButton.clearAnimation();
                    listenButton.show();
                    listenButton.startAnimation(pop_in_anim);
                    listenButton.setEnabled(true);

                } else if (s.length() > 0 && sendButton.getVisibility() == View.GONE) {
                    listenButton.clearAnimation();
                    listenButton.startAnimation(pop_out_anim);
                    listenButton.hide();
                    listenButton.setEnabled(false);
                    sendButton.clearAnimation();
                    sendButton.show();
                    sendButton.startAnimation(pop_in_anim);
                    sendButton.setEnabled(true);
                }
            }
            //  MyIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String query = "";
                query = chatText.getText().toString();
                if(choice!=-1)
                {
                    doChoices(query);
                }
                choice=sendChatMessage(query);
                // sendRequest(query);

                // sendResponse(result.getFulfillment().getSpeech());
            }
        });

        listenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                promptSpeechInput();
            }
        });

        listView.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        listView.setAdapter(chatArrayAdapter);

        //to scroll the list view to bottom on data change
        chatArrayAdapter.registerDataSetObserver(new DataSetObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                listView.setSelection(chatArrayAdapter.getCount() - 1);
            }
        });


        sendResponse("Hello!! I'm your personal assistant. Try me.");
        TTS.speak("Hello!! Welcome Back.");
    }
    private void doChoices(String text){
        if(choice==1)
        {
            String[] separated =text.split(":");
            createAlarm("alarm",Integer.parseInt(separated[0]),Integer.parseInt(separated[1]));
            choice=-1;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    sendResponse("done, alarm will wake you up tomorrow");
                    TTS.speak("done, alarm will wake you up tomorrow");
                    return;
                }
            }, 2000);
        }
        else if(choice==2)
        {
            String[] separated =text.split(":");
            sendSMS(separated[0],separated[1]);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    sendResponse("SMS sent! ;)");
                    TTS.speak("SMS sent!");
                    choice=-1;
                    return;
                }
            }, 2000);

        }
        else if(choice==3)
        {
            call(text);
            choice=-1;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    sendResponse("I hope it helped");
                    TTS.speak("I hope it helped");
                    return;
                }
            }, 5000);
        }
        else if(choice==4)
        {
            playVideo();
            sendResponse("yayyy! It worked right :D");
            TTS.speak("It worked right");
            choice=-1;
            return;
        }
        else if(choice==5)
        {
            playMusic();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    sendResponse("I hope it helped");
                    TTS.speak("I hope it helped");
                    choice=-1;
                    return;
                }
            }, 2000);
        }
        else
        {
            return;
        }
    }
    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Say something&#8230;");
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Sorry! Your device doesn't support speech input",
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Receiving speech input
     * */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    chatText.setText(result.get(0));
                }
                break;
            }

        }
    }



    private boolean sendResponse(String text) {
        if (text.length() == 0)
            return false;
        chatArrayAdapter.add(new ChatMessage(!rightSide, text));
        return true;
    }

    private int sendChatMessage(String text) {
        text=text.toLowerCase();
        if (text.length() == 0)
            return -1;
        chatArrayAdapter.add(new ChatMessage(rightSide, text));
        chatText.setText("");
        if(text.contains("alarm")||text.contains("wake me")||text.contains("wake up")){
            sendResponse("Don't worry, I can set an alarm for you. Tell me what time [hour]:[minutes] :)");
            TTS.speak("Don't worry, I can set an alarm for you. Tell me what time in hours and minutes");
            return 1;
        }
        else if(text.contains("message")||text.contains("text")||text.contains("wish")){
            sendResponse("I can send a message from you. just tell me [Contact_name]:[Message you want to send] ;)");
            TTS.speak("I can send a message from you. just tell me Contact name Message you want to send ");
            return 2;
        }
            else if(text.contains("call")||text.contains("contact")||text.contains("miss")) {
            sendResponse("I'll make a call right now. just reply me with [Contact_name] in your phone");
            TTS.speak("I'll make a call right now. Just reply me with Contact name in your phone");
            return 3;
        }
        else if(text.contains("bored")||text.contains("funny")||text.contains("laugh")) {
            sendResponse("Let me play something for you");
            TTS.speak("Let me play something for you");
            return 4;
        }
        else if(text.contains("stressed")||text.contains("depress")||text.contains("exhausted")||text.contains("frustrated")||text.contains("tired")||text.contains("excited")) {
            sendResponse("I can play a soothing song for you, Write stop to stop music");
            TTS.speak("I can play a soothing song for you, Write stop to stop music");
            return 5;
        }
        else if(text.contains("thanks")||text.contains("Thankyou")) {
            sendResponse("My pleasure <3");
            TTS.speak("My Pleasure");
            return 5;
        }
        else if(text.contains("stop")) {
            stopMusic();
            return -1;
        }
        else
            {
                return -1;
        }
        }



    public void call(String name){
        final String s = getPhoneNumber(name,assistant.this);
        Intent callIntent = new Intent(Intent.ACTION_DIAL); callIntent.setData(Uri.parse("tel:"+s));
        Log.d("phoneNum",s);
        startActivity(callIntent);
    }

    public String getPhoneNumber(String name, Context context) {
        String ret = null;
        String selection = ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME+" like'%" + name +"%'";
        String[] projection = new String[] { ContactsContract.CommonDataKinds.Phone.NUMBER};
        Cursor c = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                projection, selection, null, null);
        if (c.moveToFirst()) {
            ret = c.getString(0);
        }
        c.close();
        if(ret==null)
            ret = "-1-1-1";
        Log.d("phoneNum",ret);
        return ret;
    }
    public void setReminder(String title){
        Calendar cal = Calendar.getInstance();
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("beginTime", cal.getTimeInMillis());
        intent.putExtra("allDay", false);
        intent.putExtra("rule", "FREQ=DAILY");
        intent.putExtra("endTime", cal.getTimeInMillis()+60*60*1000);
        intent.putExtra("title", title);
        startActivity(intent);
    }
    public void createAlarm(String message, int hour, int minutes) {

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_SKIP_UI,TRUE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void sendSMS(String name, String message) {
        SmsManager smsManager = SmsManager.getDefault();
        String phoneNum = getPhoneNumber(name,assistant.this);
        smsManager.sendTextMessage(phoneNum, null, message, null, null);
    }

    public void playMusic(){
        mediaPlayer.start();
    }

    public void stopMusic(){
        mediaPlayer.stop();
        //mediaPlayer.release();
    }

    public void playVideo(){
        String url1 = "https://www.youtube.com/watch?v=5dsGWM5XGdg";
        String url2 = "https://www.youtube.com/watch?v=3dcli9i_pvA";
        String url3 = "https://www.youtube.com/watch?v=lhWbo135Efc";
        String url = url1;
        Random r = new Random();
        int i1 = r.nextInt(4 - 1) + 1;
        if (i1==1){
            url = url1;
        } else if (i1==2){
            url = url2;
        } else if (i1==3){
            url=url3;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
}
