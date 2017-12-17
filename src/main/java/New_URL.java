public class New_URL {
    private String result, url, city, APIID;

    public New_URL(String url, String city){
        this.url = url;
        this.city = city;
        this.APIID = "&APPID=7814e873825c04d45d39eb574c337fbe";
        this.url = this.url + this.city + this.APIID;
    }
    public String get_URL(){
        return this.url;
    }
}
