package lightIT.test.application.data.retrofit.request;

public class ReviewRequest {

    private int rate;
    private String text;

    public ReviewRequest(int rate, String text) {
        this.text = text;
        this.rate = rate;
    }
}
