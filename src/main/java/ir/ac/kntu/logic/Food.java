package ir.ac.kntu.logic;

public class Food {

    private String name;
    private String information;
    private double rate;
    private String[] comment;


    public Food(String name,String information,double rate,String[] comment) {
        this.name = name;
        this.information = information;
        this.rate = rate;
        this.comment = comment;
    }

    public Food() {
    }

    public String[] getComment() {
        return comment;
    }

    @Override
    public String toString() {

        String commentss ="";
        for(int i=0;i<comment.length;i++){
            commentss += comment[i];
        }
        return
                "\n"+"name='" + name + '\'' +
                ", information='" + information + '\'' +
                ", rate=" + rate +
                " ,comment on this food : " + commentss;

    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        if(rate<0){
            this.rate = 0;
        }
        if(rate>5){
            this.rate = 5;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
