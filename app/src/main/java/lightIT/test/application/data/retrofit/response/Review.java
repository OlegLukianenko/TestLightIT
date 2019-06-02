package lightIT.test.application.data.retrofit.response;

import com.google.gson.annotations.SerializedName;

public class Review {

    public int id;
    public int product;

    @SerializedName("created_by")
    public CreatedBy createdBy;
    public String rate;
    public String text;


    public class CreatedBy {
        public int id;
        public String username;
    }
}
