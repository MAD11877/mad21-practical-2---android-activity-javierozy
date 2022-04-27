package sg.ed.np.mad.week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        User user = initUser();
        setFollowing(user,button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(user.followed == false){
                    user.followed = true;
                }
                else{
                    user.followed = false;
                }
                setFollowing(user,button);
            }
        });
    }
    public User initUser(){
        User user = new User("Username","Description",1,false);
        return user;
    }

    public void setFollowing(User user, Button button){
        TextView txt = button;
        if(user.followed == false){
            txt.setText("Follow");
        }
        else{
            txt.setText("Unfollow");
        }
    }

}