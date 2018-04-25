package e.hp.gll3ry;

import android.content.Context;
import android.media.Image;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import static android.widget.ImageView.*;

public class imageadapter extends BaseAdapter{
    private Context context;
    public Integer[] images={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
            R.drawable.pic10,
            R.drawable.pic11,
            R.drawable.pic12,
            R.drawable.pic13,
            R.drawable.pic14,
            R.drawable.pic15,
            R.drawable.pic17,
            R.drawable.pic18,
            R.drawable.pic19,
            R.drawable.pic20



    };

    public imageadapter(Context a){context=a;}
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView= new ImageView(context);
        imageView.setScaleType(ScaleType.CENTER_INSIDE);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
