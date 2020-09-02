package id.go.kominfobms.mitrakurirlangit;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ss.com.bannerslider.ImageLoadingService;

public class PicassoImageLoadingService implements ImageLoadingService {
    public Context context;

    public PicassoImageLoadingService(Context context) {
        this.context = context;
    }

    public PicassoImageLoadingService() {

    }

    @Override
    public void loadImage(String url, ImageView imageView) {
        Picasso.get().load(url).fit().into(imageView);
    }

    @Override
    public void loadImage(int resource, ImageView imageView) {
        Picasso.get().load(resource).fit().into(imageView);
    }

    @Override
    public void loadImage(String url, int placeHolder, int errorDrawable, ImageView imageView) {
        Picasso.get().load(url).fit().placeholder(placeHolder).error(errorDrawable).into(imageView);
    }
}
