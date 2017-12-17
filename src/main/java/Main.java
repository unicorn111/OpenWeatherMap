public class Main {
    public static void main(String[] args) throws Exception {
        New_URL n = new New_URL("http://api.openweathermap.org/data/2.5/weather?q=", "Lviv");
        URLReader u = new URLReader(n.get_URL());
        Results r = new Results(u.get_line());
        r.get_description();
        r.get_temp_K();
        r.get_temp_C();
    }
}
