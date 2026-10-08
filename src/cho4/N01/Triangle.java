package cho4.N01;

public class Triangle {
        double base;
        double height;

        //메서드(함수)
        public double findArea(){
            return base * height / 2;
        }

        //생성자
        public Triangle(double base, double height){
            this.base = base;
            this.height = height;

        }

        public Triangle(){
            this.base = 15.0;
            this.height = 7.0;
        }
}
