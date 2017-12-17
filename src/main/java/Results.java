import org.json.JSONObject;

public class Results {
    private double temp;
    private String description;
    public Results(JSONObject jsonObj){
        this.temp = jsonObj.getJSONObject("main").getDouble("temp");
        this.description = jsonObj.getJSONArray("weather").getJSONObject(0).getString("description");
    }
    public void get_temp_C(){
        double n_temp = this.temp - 273.15;
        System.out.println("temperature in Celsius: " + n_temp);
    }

    public void get_temp_K(){
        System.out.println("temperature in Kelvin: " + this.temp);
    }
    public  void get_description(){
        System.out.println("description: " + this.description);
    }
}
