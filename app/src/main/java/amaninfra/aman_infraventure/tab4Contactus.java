package amaninfra.aman_infraventure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static amaninfra.aman_infraventure.R.string.email;
/**
 * Created by iesha on 29-Oct-17.
 */

public class tab4Contactus extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4_contactus, container, false);

//        ImageView sendIcon = (ImageView) rootView.findViewById(R.id.send_icon);
        TextView sendText = (TextView) rootView.findViewById(R.id.send_text);

//        sendIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sendMail();
//            }
//        });

        sendText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
        return rootView;
    }

    public void sendMail() {

        EditText nameField = (EditText) getView().findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        EditText emailField = (EditText) getView().findViewById(R.id.email_field);
        String email = emailField.getText().toString();

        EditText numberField = (EditText) getView().findViewById(R.id.nmbr_field);
        String number = numberField.getText().toString();

        EditText msgField = (EditText) getView().findViewById(R.id.msg_field);
        String msg = msgField.getText().toString();

        String mailText = "Name: " + name + "\n" + "Number: " + number + "\n" + "Email: " + email + "\n" + "Message: " + msg;
        String subject = "Message from " + name;

        if (name.isEmpty()) {
            Toast toast = Toast.makeText(getActivity(), "Please Enter your name",
                    Toast.LENGTH_LONG);
            toast.show();
        } else if (email.isEmpty()) {
            Toast toast = Toast.makeText(getActivity(), "Please Enter your email",
                    Toast.LENGTH_SHORT);
            toast.show();
        } else if (number.isEmpty()) {
            Toast toast = Toast.makeText(getActivity(), "Please Enter you number",
                    Toast.LENGTH_SHORT);
            toast.show();
        } else if (msg.isEmpty()) {
            Toast toast = Toast.makeText(getActivity(), "Please Enter your message",
                    Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(intent.EXTRA_EMAIL, new String[]{"amaninfraventure@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, mailText);
            if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }
}
