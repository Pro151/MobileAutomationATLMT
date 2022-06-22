package TestDataRepo;

import org.testng.annotations.DataProvider;

public class TestDataRepository {


    @DataProvider
    public Object[][] dataProviderTestLogin() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object[][] data2 = new Object[3][2];
        //1st set
        data2[0][0] = "qayy@yopmail.com";
        data2[0][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2nd set
        data2[1][0] = "qazza@yopmail.com";
        data2[1][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3rd set
        data2[2][0]="qatzz@yopmail.com";
        data2[2][1]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return data2;


    }


    @DataProvider
    public Object[][] dataProviderTestRegister() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object[][] data2 = new Object[3][2];
        //1st set
        data2[0][0] = "qayy@yopmail.com";
        data2[0][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2nd set
        data2[1][0] = "qazza@yopmail.com";
        data2[1][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3rd set
        data2[2][0]="qatzz@yopmail.com";
        data2[2][1]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return data2;


    }

    @DataProvider
    public Object[][] dataProviderTestProfileUpdate() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object[][] data2 = new Object[4][4];
        //1st set
        data2[0][0] = "Amenda";
        data2[0][1] = "Mackenly";


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2nd set
        data2[1][0] = "Ave";
        data2[1][1] = "Sydney";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3rd set
        data2[2][0]="qatzz@yopmail.com";
        data2[2][1]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return data2;


    }

    @DataProvider
    public Object[][] dataProviderTestContactDetails() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Object[][] data2 = new Object[3][2];
        //1st set
        data2[0][0] = "qayy@yopmail.com";
        data2[0][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2nd set
        data2[1][0] = "qazza@yopmail.com";
        data2[1][1] = "Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //3rd set
        data2[2][0]="qatzz@yopmail.com";
        data2[2][1]="Qa123!";

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        return data2;


    }


}
