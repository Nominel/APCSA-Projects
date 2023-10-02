public class CameraRunner {
    public static void main(String[] args) {
        Camera camera1 = new Camera(12,"Samsung");
        System.out.println(camera1);
        System.out.println("Camera1 Brand: "+camera1.getBrand());
        System.out.println("Camera1 Resolution: "+camera1.getResolution()+"MP\n");
        Camera camera2 = new Camera(4);
        camera2.setBrand("FairPhone");
        System.out.println(camera2);
        Camera camera3 = new Camera("Apple");
        camera3.setResolution(48);
        System.out.println(camera3);
        Camera camera4 = new Camera();
        System.out.println(camera4);
    }
}