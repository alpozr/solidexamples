package singleresp;


import java.util.HashMap;

public class StudentCrud {

     private HashMap Students = new HashMap<Integer,String>();

     String registerStudent(Student student){
         String response=null;
        try{
            Students.put(student.getStudentNumber(),student.getFullName());
            response="success";
        }catch (Exception e){
            System.out.println("Something went wrong.");
            response="failed";
        }
       return response;
    }
    String deleteStudent(Integer studentNumber){
       String response=null;
        try{
            if((Students.containsKey(studentNumber))){
                Students.remove(studentNumber);
                response="success";
            }
            else{
                response="failed";
            }
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
            response="failed";
        }
        return response;
    }
    String showStudent(){
        String response=null;
        try{
            if(!Students.keySet().isEmpty()) {
                for (Object student : Students.keySet()) {
                    String name = student.toString();
                    String studentNo = Students.get(name).toString();
                    System.out.println("Name:" + name + "Number:" + studentNo);
                    response="success";
                }
            }
            else{
                response="Empty";
            }
        }catch(Exception e){
            System.out.println("Something went wrong.");
            response="failed";
        }
        return response;
    }
}
