package CrudDatabaseJava;

import CrudDatabaseJava.service.StudentService;
import CrudDatabaseJava.service.StudentServiceImpl;

import java.util.*;

public class Main {

    //public static HashMap<String,Student> data = new HashMap<>();

    public static void main(String[] args) {

        StudentService service = new StudentServiceImpl();

        Scanner scanner = new Scanner(System.in);
//        List<String> lists= Arrays.asList(
//                "Jerry, 123@gmail.com, UK",
//                "Terry, 234@gmail.com, OH",
//                "Berry, 345@gmail.com, LA");


        while(scanner.hasNext()){
            String line = scanner.nextLine();
            String[] arrays = line.split(",");
            Student student = new Student();
            try{
                //add
                switch(arrays[0]){
                    case "add":
                        service.addStudent(line);
                        break;
                    case "get":
                        Student student1 = service.getStudentByName(arrays[1]);
                        System.out.println(student1);
                        break;
                    case "update":
                        service.updateStudent(line);
                        break;
                    case "delete":
                        service.deleteStudent(arrays[1]);
                        break;
                    default:
                        System.out.println("there's an error in statement");
                }

            }catch(Exception e){
                e.printStackTrace();
            }





        }

//        String s1 = "Jerry, 123@gmail.com, UK";
//        String s2 = "Terry, 234@gmail.com, OH";
//        String s3 = "Berry, 345@gmail.com, LA";




        //data.forEach((key,value)->System.out.println(key+": "+ value.getName()+" "+value.getEmail()+" "+value.getLocation()));



    }
}
