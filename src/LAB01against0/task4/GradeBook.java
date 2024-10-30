package LAB01against0.task4;


public class GradeBook {

    public static double highResult = 0;
    public static int highResultId;
    public static String highResultName;
    public static String azamat;

    public static double lowResult = 100;
    public static int lowResultId;
    public static String lowResultName ;

    public static int count = 0;

    public static double sumOfGrades = 0;

    public static int first = 0;public static int second;public static int third;public static int fourth = 0;public static int fifth = 0;public static int sixth = 0;
    public static int seventh = 0;public static int eighth = 0;public static int ninth = 0;public static int tenth = 0;public static int eleventh = 0;

    public GradeBook() {
        this.azamat = "good";
    }

    public GradeBook(String name, double grade) {
        count++;

        if(grade > highResult) {
            highResultName = name;
            highResult = grade;
            highResultId = count;
        }
        if(grade < lowResult) {
            lowResultName = name;
            lowResult = grade;
            lowResultId = count;
        }




        if(grade <= 9 && grade >= 0) {
            first++;
        }else if(grade <= 19 && grade >= 10) {
            second++;
        }else if(grade <= 29 && grade >= 20) {
            third++;
        }else if(grade <= 39 && grade >= 30) {
            fourth++;
        }else if(grade <= 49 && grade >= 40) {
            fifth++;
        }else if(grade <= 59 && grade >= 50) {
            sixth++;
        }else if(grade <= 69 && grade >= 60) {
            seventh++;
        }else if(grade <= 79 && grade >= 70) {
            eighth++;
        }else if(grade <= 89 && grade >= 80) {
            ninth++;
        }else if(grade <= 99 && grade >= 90) {
            tenth++;
        }else if(grade == 100){
            eleventh++;
        }

        sumOfGrades+=grade;
    }

    public void getSum(){
        System.out.println(count);
    }

    public String displayMessage() {
        return "Welcome to the grade book for ";
    }

    public String getHigh() {
        return "Highest grade is "+highResult+" ("+highResultName+", id: "+highResultId+")";
    }

    public String getLow() {
        return "Lowest grade is "+lowResult+" ("+lowResultName+", id: "+lowResultId+")";
    }

    public double determineClassAverage() {
        return sumOfGrades/count;
    }






    public void outputBarChart() {
        String firstCount = "";
        for(int i = 0; i < first;i++) {
            firstCount += "*";
        }

        String secondCount = "";
        for(int i = 0; i < second;i++) {
            secondCount += "*";
        }

        String thirdCount = "";
        for(int i = 0; i < third;i++) {
            thirdCount += "*";
        }

        String fourthCount = "";
        for(int i = 0; i < fourth;i++) {
            fourthCount += "*";
        }

        String fifthCount = "";
        for(int i = 0; i < fifth;i++) {
            fifthCount += "*";
        }

        String sixthCount = "";
        for(int i = 0; i < sixth;i++) {
            sixthCount += "*";
        }

        String seventhCount = "";
        for(int i = 0; i < seventh;i++) {
            seventhCount += "*";
        }

        String eighthCount = "";
        for(int i = 0; i < eighth;i++) {
            eighthCount += "*";
        }

        String ninthCount = "";
        for(int i = 0; i < ninth;i++) {
            ninthCount += "*";
        }

        String tenthCount = "";
        for(int i = 0; i < tenth;i++) {
            tenthCount += "*";
        }

        String eleventhCount = "";
        for(int i = 0; i < eleventh;i++) {
            eleventhCount += "*";
        }

        System.out.println("00-09:"+firstCount);
        System.out.println("10-19:"+secondCount);
        System.out.println("20-29:"+thirdCount);
        System.out.println("30-39:"+fourthCount);
        System.out.println("40-49:"+fifthCount);
        System.out.println("50-59:"+sixthCount);
        System.out.println("60-69:"+seventhCount);
        System.out.println("70-79:"+eighthCount);
        System.out.println("80-89:"+ninthCount);
        System.out.println("90-99:"+tenthCount);
        System.out.println("100:"+eleventhCount);
    }


}
