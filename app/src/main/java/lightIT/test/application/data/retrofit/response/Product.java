package lightIT.test.application.data.retrofit.response;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {

    public int id;
    public String img;
    public String text;
    public String title;

    protected Product(Parcel in) {
        id = in.readInt();
        img = in.readString();
        text = in.readString();
        title = in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(img);
        parcel.writeString(text);
        parcel.writeString(title);
    }
}
