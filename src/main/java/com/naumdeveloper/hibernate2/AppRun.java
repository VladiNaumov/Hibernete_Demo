package com.naumdeveloper.hibernate2;


public class AppRun {

    public static void main(String[] args) {

        ManagerFactoryUtil managerFactory = new ManagerFactoryUtil();
         try {

            Dao dao = new Dao(managerFactory);
            dao.findAll();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            managerFactory.shutdown();
        }

    }
}
