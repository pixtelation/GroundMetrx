package Generic_Library;

public interface Framework_constants {
    String url="https://team-b.groundmetrx.com/";
//    String gk="webdriver.gecko.driver";
//    String gv="C:\\\\Users\\\\Wadmin\\\\Downloads\\\\browser\\\\msedgedriver.exe";
    String expected_signin="https://team-b.groundmetrx.com/home";
    String expected_="";


    String un = Excel.fetchdata(0,2,0);
    String pass = Excel.fetchdata(0,2,1);
    String first_name= Excel.fetchdata(0,1,2);
    String last_name= Excel.fetchdata(0,1,3);
    String gender_male= Excel.fetchdata(0,1,4);
//    String gender_female= Excel.fetchdata(0,2,4);
//    String gender_other= Excel.fetchdata(0,3,4);
    String phone= Excel.fetchdata(0,1,5);
    String email_id= Excel.fetchdata(0,1,6);
    String dob= Excel.fetchdata(0,1,7);
    String address1= Excel.fetchdata(0,1,8);
    String address2= Excel.fetchdata(0,1,9);
    String city= Excel.fetchdata(0,1,10);
    String post_code= Excel.fetchdata(0,1,11);
    String country= Excel.fetchdata(0,1,12);

}
