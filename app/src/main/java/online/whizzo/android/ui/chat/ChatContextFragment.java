package online.whizzo.android.ui.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import online.whizzo.android.R;

import java.util.ArrayList;
import java.util.List;

public class ChatContextFragment extends Fragment {

    private ChatContextViewModel chatContextViewModel;
    private RecyclerView mRecycler;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chatcontext,container,false);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter((ArrayList<ChatCard>) getRecentChats());
        mRecycler = (RecyclerView) root.findViewById(R.id.chatrecyler);
        mRecycler.setHasFixedSize(true);
        mRecycler.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(root.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        mRecycler.setLayoutManager(llm);


        return root;
    }


    public List<ChatCard> getRecentChats(){
        ChatCard testCard1 = new ChatCard("Hanzalah Ravat",5,"","18:14","Hi how are you today?");
        ChatCard testCard2 = new ChatCard("Nisath",1,"","18:00","Is it working");
        ChatCard testCard3 = new ChatCard("Naim Ahmed",10,"","17:40","I'm Having a fun time at this Hackathon bro");
        ChatCard testCard4 = new ChatCard("Nishika",1,"","17:30","Nice!");
        ChatCard testCard5 = new ChatCard("Bob",1,"","17:30","Sweet!");
        ChatCard testCard6 = new ChatCard("Mom",1,"","17:30","It's cold outside");


        ArrayList<ChatCard> toReturn = new ArrayList<>();
        toReturn.add(testCard1);toReturn.add(testCard2);toReturn.add(testCard3);toReturn.add(testCard4);toReturn.add(testCard5);toReturn.add(testCard6);
        return toReturn;
    }
}