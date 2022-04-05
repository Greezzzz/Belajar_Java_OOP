class shape {
    String nama;
    int getCorner() {
        return 0;
    }

    shape(String nama) {
        this.nama = nama;
    }
}

class rectangel extends shape {

    rectangel(String nama) {
        super(null); //super constructor. wajib digunakan apabila constructor di parent terdapat paremeter
    }
    int getCorner() {
        return 4;
    }

    int parentGetCorner() {
        return super.getCorner();
    }
}
