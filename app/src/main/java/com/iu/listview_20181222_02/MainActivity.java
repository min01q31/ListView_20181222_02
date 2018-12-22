package com.iu.listview_20181222_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.iu.listview_20181222_02.dapters.MemberAdapter;
import com.iu.listview_20181222_02.datas.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    //수강생 목록을 저장하는데 쓰는 ArrayList 생성
    List<Member> memberList = new ArrayList<Member>();
    ListView memberListView;
    MemberAdapter memberAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setupValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setupValues() {
        fillMembers();

        memberAdapter = new MemberAdapter(mContext,memberList);

        memberListView.setAdapter(memberAdapter);
    }

    void fillMembers(){
        memberList.clear();

        memberList.add(new Member("강소진","서울시 강남구","임시"));
        memberList.add(new Member("강윤영","서울시 강동구","임시"));
        memberList.add(new Member("김연영","서울시 강북구","임시"));
        memberList.add(new Member("도현철","서울시 강서구","임시"));
        memberList.add(new Member("오미리","서울시 관악구","임시"));
        memberList.add(new Member("정주연","서울시 광진구","임시"));
        memberList.add(new Member("이민규","서울시 구로구","임시"));
        memberList.add(new Member("정나연","서울시 금천구","임시"));
        memberList.add(new Member("최태식","서울시 노원구","임시"));
        memberList.add(new Member("변현정","서울시 도봉구","임시"));
    }

    @Override
    public void bindViews() {
        memberListView = findViewById(R.id.memberListView);
    }
}
