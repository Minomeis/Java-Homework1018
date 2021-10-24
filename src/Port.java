public class Port {
    double x;
    double y;
    double z;
    public Port(double a,double b,double c){
        x = a;
        y = b;
        z = c;
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
    public void show(){
        System.out.println("点坐标为"+ "(" + this.x + "," + this.y + "," + this.z + ")" );
    }
    public double jisuan(Port aa){
        double h;
        h = Math.sqrt((aa.x - this.x)*(aa.x - this.x)+(aa.y - this.y)*(aa.y - this.y)+(aa.z - this.z)*(aa.z - this.z));
        System.out.println("结果为"+h);
        return h;
    }
    public static void main(String[] args){
        Port port1 = new Port(2,3,4);
        Port port2 = new Port(7,8,5);
        port1.show();
        port2.show();
        port1.jisuan(port2);
    }
}
