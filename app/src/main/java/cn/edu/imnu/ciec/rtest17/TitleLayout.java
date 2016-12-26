package cn.edu.imnu.ciec.rtest17;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by HP301 on 2016/12/26.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        /*
        首先重写LinearLayout中带有两个参数的构造器。
        构造器需要对标题栏进行动态加载，这就要使用LayoutInflater来实现。
        inflate（）方法用来动态加载布局文件，接受两个参数(要加载的布局文件的id,父布局(是一个LinearLayout))
         */

        LayoutInflater.from(context).inflate(R.layout.title,this);//关联xml文件

        Button backButton= (Button) findViewById(R.id.title_back);
        Button closeButton= (Button) findViewById(R.id.title_close);

        backButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"back button",Toast.LENGTH_LONG).show();
            }
        });

        closeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"close button",Toast.LENGTH_LONG).show();

            }
        });
    }
}
