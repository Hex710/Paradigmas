public class Data{
    private int year;
    private int month;
    private int day;

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return this.day;
    }

    public void setYear(int year){
        if(year > 0){
            this.year = year;
        }
    }

    public void setMonth(int month){
        if ((month > 0) && (month <= 12)){
            this.month = month;
        }
    }

    public void setDay(int day, int month){
        if (day > 0){
            if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day <= 31)){
                this.day = day;
            }
            else if ((month == 2) && (day <= 28)){
                this.day = day;
            }
            else if (day <= 30){
                this.day = day;
            }
        }
    }

    public boolean anterior(int year, int month, int day){
        if ((this.year < year) || ((this.year == year) && ((this.month < month) || ((this.month == month) && (this.day < day))))){
            return false;
        }
        
        return true;
    }

    public boolean posterior(int year, int month, int day){
        if ((this.year > year) || ((this.year == year) && ((this.month > month) || ((this.month == month) && (this.day > day))))){
            return false;
        }

        return true;
    }

    public boolean equals(int year, int month, int day){
        if ((this.year == year) && (this.month == month) && (this.day == day)){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.day + "/" + this.month + "/" + this.year;
    }
}