package com.wirama.zodiak;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class holder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private ImageView image;
    private TextView title, description;
    private Context context;

    public holder(View view){
        super(view);

        image = (ImageView) view.findViewById(R.id.image);
        title = (TextView) view.findViewById(R.id.title);
        description = (TextView)view.findViewById(R.id.description);
        view.setOnClickListener(this);
        context = view.getContext();
    }

    public void bind(data data){
        int resID = data.getImage();
        image.setTag(resID);
        image.setImageResource(resID);
        title.setText(data.getTitle());
        description.setText(data.getDescription());
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), detzodiak.class);

        intent.putExtra("itent_image",(int) image.getTag());
        intent.putExtra("itent_title", title.getText());
        intent.putExtra("itent_description", description.getText());
        context.startActivity(intent);
    }
}
