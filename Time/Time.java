public class Time{
    private int hour;
    private int minute;

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public void setHour(int hour){
        if ((hour >= 0) && (hour < 24)){
            this.hour = hour;
        }
    }

    public void setMinute(int minute){
        if ((minute >= 0) && (minute < 60)){
            this.minute = minute;
        }
    }

    public boolean anterior(int hour, int minute){
        if ((this.hour < hour) || ((this.hour == hour) && (this.minute < minute))){
            return false;
        }
        
        return true;
    }

    public boolean posterior(int hour, int minute){
        if ((this.hour > hour) || ((this.hour == hour) && (this.minute > minute))){
            return false;
        }

        return true;
    }

    public boolean equals(int hour, int minute){
        if ((this.hour == hour) && (this.minute == minute)){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.hour + ":" + this.minute;
    }
}