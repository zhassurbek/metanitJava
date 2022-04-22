package metanit.m3_oop.oopm8;

// производный классы прямоугольника
class Rectange extends Figure {

    private float width;
    private float height;

    // a constructor с обращением к конструктору класса Figure
    public Rectange(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return 2*(width + height);
    }

    @Override
    public float getArea() {
        return (width * height);
    }
}
