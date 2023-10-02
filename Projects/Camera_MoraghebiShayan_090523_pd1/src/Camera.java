public class Camera {
    //instance variables
    private int resolution;
    private String brand;

    //constructors
    public Camera(){
    }
    public Camera(int r, String b){
        resolution=r;
        brand=b;
    }
    public Camera(int r){
        resolution=r;
    }
    public Camera(String b){
        brand=b;
    }

    //mutators
    public void setBrand(String b){
        brand=b;
    }
    public void setResolution(int r) {
        resolution = r;
    }

    //accessors

    public String getBrand() {
        return brand;
    }
    public int getResolution() {
        return resolution;
    }

    //toString

    @Override
    public String toString() {
        return  "Brand: "+brand+"\n"+
                "Resolution: "+resolution+"MP\n";
    }
}
