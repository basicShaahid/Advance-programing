public class formattingExample {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f%n", 30, Math.toRadians(30), Math.sin(Math.toRadians(30)), Math.cos(Math.toRadians(30)), Math.tan(Math.toRadians(30)));

        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f%n", 60, Math.toRadians(60), Math.sin(Math.toRadians(60)), Math.cos(Math.toRadians(60)), Math.tan(Math.toRadians(60)));
    }
}
