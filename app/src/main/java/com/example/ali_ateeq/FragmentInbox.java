package com.example.ali_ateeq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentInbox extends Fragment {
    View v;
    private RecyclerView myRecyclerView;
    private List<Inbox> inboxList;


    public FragmentInbox() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.inbox_fragment,container,false);
        myRecyclerView = v.findViewById(R.id.inbox_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),inboxList);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerView.setAdapter(recyclerViewAdapter);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        inboxList = new ArrayList<>();
        inboxList.add(new Inbox("Ali","36860701",1));
        inboxList.add(new Inbox("Jassim","36860701",1));
        inboxList.add(new Inbox("Hassin","36860701",1));
        inboxList.add(new Inbox("Mahmood","36860701",1));
        inboxList.add(new Inbox("ATEEQ","36860701",1));

    }
}
