public class Contador{
    private int counter;

    public int getCounter(){
        return this.counter;
    }

    public void setCounter(int counter){
        if (counter >= 0){
            this.counter = counter;
        }
    }

    public void countSetZero(){
        this.counter = 0;
    }

    public void incrementCounter(int value){
        if (value > 0){
        this.counter = this.counter + value;
        }
    }

    public void decrementCounter(int value){
        if ((this.counter - value) >= 0){
            this.counter = this.counter - value;
        }
    }
}