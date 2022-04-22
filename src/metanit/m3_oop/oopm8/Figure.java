package metanit.m3_oop.oopm8;

// abstract class figure
abstract class Figure {

    float x;    // x - coordinate dot
    float y;    // y - coordinate dot

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // abstract method for get a Perimeter
    public abstract float getPerimeter();

    // abstract method for get an Area
    public abstract float getArea();

}

