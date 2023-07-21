class q {
    int s = 2, a = 3, b = 5, c = 8;

    void d1() {
        int area = s * (s - a) * (s - b) * (s - c);
        System.out.println("Area of Quadrilateral :" + area);
    }
}

class tr extends q {
    int a = 5, b = 10, h = 10;

    void d2() {
        int Area_tr = a + b / 2 * h;
        System.out.println("Area of trapezoid :" + Area_tr);
    }
}

class para extends q {
    int b, h;

    void d3() {
        int Area_para = b * h;
        System.out.println("Area of parallogram :" + Area_para);
    }
}

class rect extends q {
    int l = 10, b = 5;

    void d4() {
        int Area_rec = l * b;
        System.out.println("Area of rectangle :" + Area_rec);
    }

}

class sq extends q {
    void d5() {
        int a = 6;
        int Area_sq = a * a;
        System.out.println("Area of Squre :" + Area_sq);
    }
}

public class Main {
    public static void main(String[] args) {
        tr t = new tr();
        t.d2();
        para p = new para();
        p.d3();
        rect r = new rect();
        r.d4();
        sq s = new sq();
        s.d5();
        s.d1();
    }
}