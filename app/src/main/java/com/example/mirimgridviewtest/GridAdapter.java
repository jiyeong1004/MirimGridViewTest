package com.example.mirimgridviewtest;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
        Context context;

        int[] imgRes = {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5,
                R.drawable.m6, R.drawable.m7, R.drawable.m8, R.drawable.m9, R.drawable.m10,
                R.drawable.m11, R.drawable.m12, R.drawable.m13, R.drawable.m14, R.drawable.m15,
                R.drawable.m16, R.drawable.m17, R.drawable.m18};

        String[] posterTitles = {"너의 이름은", "시간을 달리는 소녀", "별을 쫒는 아이", "늑대아이", "이웃집 토토로",
                "센과 치히로", "마녀 배달부 키키", "메리와 마녀의 꽃", "모노노케 히메", "천공의 성 라퓨타",
                "마루 밑 아리에티", "벼랑 위의 포뇨", "바람이 분다", "코쿠리코 언덕에서", "칼리오스트로의 성",
                "날씨의 아이", "목소리의 형태", "너와 파도를 탈 수 있다면"};

        public GridAdapter(Context context){
            this.context = context;
        }

    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new GridView.LayoutParams(300, 400));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(imgRes[position]);
        final int pos = position;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View dialogView = View.inflate(context, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(context);
                ImageView imgvPoster = dialogView.findViewById(R.id.imgv_dialog);
                imgvPoster.setImageResource(imgRes[pos]);
                dlg.setTitle(posterTitles[pos]);
                dlg.setIcon(R.mipmap.ic_slate);
                dlg.setView(dialogView);
                dlg.setNegativeButton("닫기", null);
                dlg.show();
            }
        });
        return imgv;
    }
}
