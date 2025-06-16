package tp5.ejercicio1;

public class AdjMatrixVertex<T> implements Vertex<T> {

    private T data;
    private int position;

    public AdjMatrixVertex(T data, int position) {
        this.data=data;
        this.position=position;
    }

    public void setData(T data) {
        this.data=data;
    }

    public void setPosition(int position) {
        this.position=position;
    }

    public T getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public void decrementPosition() {
        this.position--;
    }

}