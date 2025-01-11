public class Vector3D {

    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString(Vector3D vector) {
        return String.format("(%.2f, %.2f, %.2f)", getX(), getY(), getZ());
    }

    public double getMagnitude(Vector3D vector) {
        double x = getX();
        double y = getY();
        double z = getZ();

        return Math.sqrt(x*x + y*y + z*z);
    }

}
